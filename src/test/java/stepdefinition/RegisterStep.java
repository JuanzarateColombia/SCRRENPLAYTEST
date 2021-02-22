package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.RegisterQuestion;
import taks.RegisterTaks;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStep {
    @Before
    public  void Register () {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^El cliente abre la pagina web y ingresa a button Join Today$")
    public void el_cliente_abre_la_pagina_web_y_ingresa_a_button_join_today() {
        theActorCalled("cliente").attemptsTo(Open.url("https://www.utest.com/"));

    }

    @When("^  El cliente llena la informacion (.+)  (.+)  (.+)  (.+)  (.+)  (.+) (.+)  (.+)  (.+) (.+)  (.+)  (.+)  (.+)  (.+)  (.+) (.+)  (.+) (.+) (.+) (.+)$")
    public void el_cliente_llena_la_informacion(String firstname, String lastname, String email, String birthmonth, String birthday, String birthyear, String city, String zip, String country, String computer, String version, String language, String mobile, String model, String operating, String password, String confirmarpassword, String stay, String termofuse, String privacysetting)  {
        theActorCalled("cliente").attemptsTo(RegisterTaks.RegistroCompleto(firstname,lastname,email,birthmonth,birthday,birthyear,city,zip,country,computer,version,language,mobile,model,operating,password,confirmarpassword,stay,termofuse,privacysetting));
    }


    @Then("^Permite el registro con el mensaje  (.+)$")
    public void permite_el_registro_con_el_mensaje(String validatexto) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterQuestion.Validar_text_inicio(validatexto)));
    }

}