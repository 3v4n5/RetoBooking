package com.co.booking.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reserva {

    public static final Target X = Target.the("Ignorar Inicio de sesion").located(By.xpath("//*[@id=\"b2indexPage\"]/div[37]/div/div/div/div[1]/div[1]/div/button/span/span/svg/path"));
    public static final Target DESTINO = Target.the("Destino").located(By.xpath("//input[@name='ss']"));
    public static final Target CALENDARIO = Target.the("Calendario").located(By.xpath("//span[text()='Fecha de entrada']"));
    public static final Target CHECK_IN = Target.the("Checkin").located(By.xpath("//span[@data-date='2024-07-18']"));
    public static final Target CHECK_OUT = Target.the("Checkout").located(By.xpath("//span[@data-date='2024-07-25']"));
    public static final Target SELECT_HABITACIONES = Target.the("Selecciona habitaciones y personas").located(By.xpath("//span[text()='2 adultos · 0 niños · 1 habitación']"));
    public static final Target ADULTOS = Target.the("Adultos").located(By.xpath("//*[@id=':rk:']/div/div[1]/div[2]/button[2]/span/span/svg/path"));
    public static final Target NINOS = Target.the("Niños").located(By.xpath("//*[@id=':rk:']/div/div[2]/div[2]/button[2]/span/span/svg/path"));
    public static final Target NINO_1 = Target.the("Niño 1").located(By.xpath("//select[@id=':r43:']"));
    public static final Target NINO_2 = Target.the("Niño 2").located(By.xpath("//select[@id=':r44:']"));
    public static final Target NUM_HABITACIONES = Target.the("Numero Habitaciones").located(By.xpath("//*[@id=':rk:']/div/div[3]/div[2]/button[2]/span/span/svg/path"));
    public static final Target BTN_LISTO = Target.the("Boton de comfirmacion").located(By.xpath("//*[@id=':rk:']/button"));
    public static final Target BTN_BUSCAR = Target.the("Boton Buscar").located(By.xpath("//span[text()='Buscar']"));
    public static final Target ESTRELLAS = Target.the("4 Estrellas").located(By.xpath("//div[text()='4 estrellas']']"));

}
