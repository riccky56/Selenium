$ErrorActionPreference = 'Stop'

$root = 'C:\Users\ragupta1\git\Selenium\src'

function Get-PreviousNonEmptyLine {
    param([System.Collections.Generic.List[string]]$OutputLines)

    for ($index = $OutputLines.Count - 1; $index -ge 0; $index--) {
        $candidate = $OutputLines[$index].Trim()
        if ($candidate -ne '') {
            return $candidate
        }
    }

    return $null
}

function Get-GeneratedComment {
    param([string]$TrimmedLine)

    if ($TrimmedLine -match '^(package |import |@|[{}]+$)') { return $null }
    if ($TrimmedLine -match '^public\s+class\s+') { return '// Class declaration that groups the related example logic in one place.' }
    if ($TrimmedLine -match '^public\s+static\s+void\s+main\s*\(') { return '// Main method where program execution starts.' }
    if ($TrimmedLine -match '^public\s+static\s+.*\(') { return '// Helper method used to perform a specific part of the program logic.' }
    if ($TrimmedLine -match '^Scanner\s+\w+\s*=\s*new\s+Scanner\s*\(') { return '// Create a Scanner object to read input from the user.' }
    if ($TrimmedLine -match '^(HashMap|Map)<.*>\s+\w+\s*=\s*new\s+HashMap') { return '// Create a HashMap to store keys with their counts or mapped values.' }
    if ($TrimmedLine -match '^Set<.*>\s+\w+\s*=\s*new\s+TreeSet') { return '// Create a TreeSet to remove duplicates automatically and keep values sorted.' }
    if ($TrimmedLine -match '^Set<.*>\s+\w+\s*=\s*new\s+HashSet') { return '// Create a HashSet to store only unique values.' }
    if ($TrimmedLine -match '^StringBuilder\s+\w+\s*=\s*new\s+StringBuilder') { return '// Use StringBuilder to build the final string efficiently.' }
    if ($TrimmedLine -match '^int\s*\[\]\s+\w+\s*=') { return '// Declare and initialize an integer array used in this example.' }
    if ($TrimmedLine -match '^String\s+\w+\s*=') { return '// Store text data that will be processed by the program logic.' }
    if ($TrimmedLine -match '^char\s+\w+\s*=') { return '// Read or store the current character needed for processing.' }
    if ($TrimmedLine -match '^int\s+\w+\s*=') { return '// Initialize a variable that will be used in the logic.' }
    if ($TrimmedLine -match '^double\s+\w+\s*=') { return '// Initialize a numeric variable used by the program.' }
    if ($TrimmedLine -match '^boolean\s+\w+\s*=') { return '// Store a true or false state needed for conditional logic.' }
    if ($TrimmedLine -match '^for\s*\(') {
        if ($TrimmedLine -match ':') { return '// Loop through each element one by one.' }
        return '// Loop through the data using an index or counter.'
    }
    if ($TrimmedLine -match '^while\s*\(') { return '// Continue looping while the given condition remains true.' }
    if ($TrimmedLine -match '^if\s*\(') { return '// Check the condition before deciding whether this block should run.' }
    if ($TrimmedLine -match '^else\s+if\s*\(') { return '// Check another condition if the previous condition was false.' }
    if ($TrimmedLine -match '^else\b') { return '// Execute this block when the earlier conditions do not match.' }
    if ($TrimmedLine -match '^System\.out\.print') { return '// Display information to the console for the user.' }
    if ($TrimmedLine -match '^return\b') { return '// Return the final result back to the caller.' }
    if ($TrimmedLine -match '\.add\s*\(') { return '// Add the current value into the collection.' }
    if ($TrimmedLine -match '\.put\s*\(') { return '// Store or update the current value in the map.' }
    if ($TrimmedLine -match '\.append\s*\(') { return '// Append the current value to the growing result.' }
    if ($TrimmedLine -match '^Arrays\.sort\s*\(') { return '// Sort the array so values are arranged in ascending order.' }
    if ($TrimmedLine -match '^Collections\.sort\s*\(') { return '// Sort the collection into natural order.' }
    if ($TrimmedLine -match '^\w+\s*=\s*\w+\s*[+\-*/]') { return '// Update the variable based on the current calculation.' }

    return $null
}

Get-ChildItem -Path $root -Recurse -Filter '*.java' | ForEach-Object {
    $filePath = $_.FullName
    $lines = Get-Content -Path $filePath
    $outputLines = New-Object 'System.Collections.Generic.List[string]'

    foreach ($line in $lines) {
        $trimmedLine = $line.Trim()

        if ($trimmedLine -eq '') {
            $outputLines.Add($line)
            continue
        }

        if ($trimmedLine -match '^(//|/\*|\*|\*/)' -or $line -match '//') {
            $outputLines.Add($line)
            continue
        }

        $previousNonEmptyLine = Get-PreviousNonEmptyLine -OutputLines $outputLines
        $alreadyCommented = $false
        if ($null -ne $previousNonEmptyLine -and $previousNonEmptyLine -match '^(//|/\*|\*|\*/)') {
            $alreadyCommented = $true
        }

        $generatedComment = Get-GeneratedComment -TrimmedLine $trimmedLine
        if (-not $alreadyCommented -and $null -ne $generatedComment) {
            $indentation = ([regex]::Match($line, '^\s*')).Value
            $outputLines.Add($indentation + $generatedComment)
        }

        $outputLines.Add($line)
    }

    [System.IO.File]::WriteAllLines($filePath, $outputLines)
}

Write-Host 'Comment pass complete.'