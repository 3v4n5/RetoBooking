package com.co.booking.tasks;

import com.co.booking.models.Credenciales;
import com.co.booking.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginBooking implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(Constantes.USER).into(com.co.booking.ui.LoginBooking.INPUT_USER));
        actor.attemptsTo(Click.on(com.co.booking.ui.LoginBooking.BTN_CONTINUAR));
        actor.attemptsTo(Enter.theValue(Constantes.PASS).into(com.co.booking.ui.LoginBooking.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(com.co.booking.ui.LoginBooking.BTN_INICIARSESION));

    }

    public static LoginBooking whitCredentials(){
        return Tasks.instrumented(LoginBooking.class);
    }
}
