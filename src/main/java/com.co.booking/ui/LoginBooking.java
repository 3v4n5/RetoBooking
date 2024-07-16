package com.co.booking.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginBooking {

    //public static final Target BTN_LOGIN = Target.the("Boton inicio de sesion").located(By.xpath("//a[@data-testid='header-sign-in-button']"));
    public static final Target INPUT_USER = Target.the("Input username").located(By.id("username"));
    public static final Target BTN_CONTINUAR = Target.the("Boton continuar con email").located(By.xpath("//button[@type='submit']"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.id("password"));
    public static final Target BTN_INICIARSESION = Target.the("Iniciar sesion").located(By.xpath("//span[text()='Iniciar sesión']"));
    public static final Target TITLE = Target.the("Acceso a Cuenta").located(By.xpath("//div[text()='Tu cuenta']"));
}
