package com.co.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ui.Select;

import static com.co.booking.ui.Reserva.*;

public class Reserva implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(X));
        actor.attemptsTo(Enter.theValue("Cartagena de Indias").into(DESTINO));
        actor.attemptsTo(Click.on(CALENDARIO));
        actor.attemptsTo(Click.on(CHECK_IN));
        actor.attemptsTo(Click.on(CHECK_OUT));
        actor.attemptsTo(Click.on(SELECT_HABITACIONES));
        actor.attemptsTo(Click.on(ADULTOS));
        actor.attemptsTo(DoubleClick.on(NINOS));
        actor.attemptsTo((Performable) Select.option("2 años").from(NINO_1));
        actor.attemptsTo((Performable) Select.option("3 años").from(NINO_2));
        actor.attemptsTo(Click.on(NUM_HABITACIONES));
        actor.attemptsTo(Click.on(BTN_LISTO));
        actor.attemptsTo(Click.on(BTN_BUSCAR));
        actor.attemptsTo(Click.on(ESTRELLAS));
    }

    public static Reserva elHotel(){
        return Tasks.instrumented(Reserva.class);
    }
}
