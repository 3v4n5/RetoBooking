package com.co.booking.models;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;

public class Credenciales {

    private String user =
            EnvironmentSpecificConfiguration
                    .from(Serenity.environmentVariables())
                    .getProperty("environments.credentials.webdriver.credentials.user");
    private String password = EnvironmentSpecificConfiguration
            .from(Serenity.environmentVariables())
            .getProperty("environments.credentials.webdriver.credentials.pass");;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
