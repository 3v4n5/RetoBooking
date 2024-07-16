package com.co.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loginBooking.feature",
        glue = "com.co.booking.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@filtro"
)
public class LoginBookingRunner {

}
