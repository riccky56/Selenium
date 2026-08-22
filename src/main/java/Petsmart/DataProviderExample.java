package Petsmart;

import org.testng.annotations.DataProvider;

// Provides sample username/password combinations for data-driven login tests.
public class DataProviderExample {

    @DataProvider(name = "loginData")
    
    public Object[][] provideLoginData() {
    	
		// Each row represents one test iteration with username and password.
        return new Object[][] {
            { "user1", "password1" },
            { "user2", "password2" },
            { "user3", "password3" }
        };
    }
}
