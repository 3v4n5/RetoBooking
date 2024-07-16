package com.co.booking.stepdefinitions;

import com.co.booking.tasks.Reserva;
import com.co.booking.tasks.SeleccionarHotel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import org.openqa.selenium.WebDriver;

import static com.co.booking.utils.Constantes.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReservaBookingStepDefinition {
    WebDriver hisDriver;

    @Before
    public void setUp() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Dado("el usuario esta en el sitio de booking")
    public void elUsuarioEstaEnElSitioDeBooking() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @Cuando("el usuario selecciona los filtros de busqueda")
    public void elUsuarioSeleccionaLosFiltrosDeBusqueda() {
        theActorInTheSpotlight().attemptsTo(Reserva.elHotel());
    }

    @Entonces("el usuario visualiza el hotel")
    public void elUsuarioVisualizaElHotel() {
        theActorInTheSpotlight().attemptsTo(SeleccionarHotel.elHotel());
    }
}
