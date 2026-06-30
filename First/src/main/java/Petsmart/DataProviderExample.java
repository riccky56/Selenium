package Petsmart;

import org.testng.annotations.DataProvider;

public class DataProviderExample {

    @DataProvider(name = "loginData")
    
    public Object[][] provideLoginData() {
    	
        return new Object[][] {
            { "user1", "password1" },
            { "user2", "password2" },
            { "user3", "password3" }
        };
    }
}