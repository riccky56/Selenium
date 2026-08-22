package Petsmart;

import org.testng.annotations.DataProvider;

// Class declaration that groups the related example logic in one place.
public class DataProviderExample {

    @DataProvider(name = "loginData")
    
    public Object[][] provideLoginData() {
    	
        // Return the final result back to the caller.
        return new Object[][] {
            { "user1", "password1" },
            { "user2", "password2" },
            { "user3", "password3" }
        };
    }
}
