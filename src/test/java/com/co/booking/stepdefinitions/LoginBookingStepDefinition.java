package com.co.booking.stepdefinitions;


import com.co.booking.questions.ValidaTexto;
import com.co.booking.tasks.LoginBooking;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.netty.handler.codec.MessageAggregationException;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static com.co.booking.utils.Constantes.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
public class LoginBookingStepDefinition {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Dado("abre el sitio web de booking")
    public void abreElSitioWebDeBooking() {
        theActorInTheSpotlight().wasAbleTo(Open.url(BASE_URL));
    }

    @Cuando("ingresa las credenciales")
    public void ingresaLasCredenciales() {
        theActorInTheSpotlight().attemptsTo(LoginBooking.whitCredentials());
    }

    @Entonces("visualizara el titulo de la pagina")
    public void visualizaraElTituloDeLaPagina() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaTexto.cuenta()
                ,Matchers.is("Tu cuenta")));
    }

}
