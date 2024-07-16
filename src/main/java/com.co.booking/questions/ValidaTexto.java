package com.co.booking.questions;

import com.co.booking.ui.LoginBooking;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidaTexto implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LoginBooking.TITLE).asString();
    }

    public static ValidaTexto cuenta (){
        return new ValidaTexto();
    }
}
