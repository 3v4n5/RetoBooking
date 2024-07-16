package com.co.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SeleccionarHotel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static SeleccionarHotel elHotel(){
        return Tasks.instrumented(SeleccionarHotel.class);
    }
}
