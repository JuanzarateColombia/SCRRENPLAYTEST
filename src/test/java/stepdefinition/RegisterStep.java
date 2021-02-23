package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.chrome.ChromeDriver;
import question.RegisterQuestion;
import taks.RegisterTaks;
import ui.RegisterUi;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterStep {
    @Before
    public  void Register () {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^El cliente abre la pagina web y ingresa a button Join Today$")
    public void el_cliente_abre_la_pagina_web_y_ingresa_a_button_join_today() {
        try {
            theActorCalled("cliente").attemptsTo(Open.url("https://www.utest.com/"));
            theActorCalled("cliente").attemptsTo((Click.on(RegisterUi.Button_Join_Today)));

        }
        catch(Exception e) {
            System.out.println("**************************************ERROR****************");
            System.out.println(e);
        }


    }

    @When("^El cliente llena la informacion (.+)  (.+)  (.+)  (.+)  (.+)  (.+) (.+)  (.+)  (.+) (.+)  (.+)  (.+)  (.+)  (.+)  (.+) (.+)  (.+) (.+) (.+) (.+)$")
    public void el_cliente_llena_la_informacion_juan_carlos_godoy_zarate_adioslave_live_com_octuber_Bogota_Colombia_Windows_Spanish_Huawei_SmaKit_S_Android_WindowsColombia_WindowsColombia_true_true_true(String firstname, String lastname, String email, String birthmonth, String birthday, String birthyear, String city, String zip, String country, String computer, String version, String language, String mobile, String model, String operating, String password, String confirmarpassword, String stay, String termofuse, String privacysetting)
    {
        try {
            theActorCalled("cliente").attemptsTo(RegisterTaks.RegistroCompleto(firstname,lastname,email,birthmonth,birthday,birthyear,city,zip,country,computer,version,language,mobile,model,operating,password,confirmarpassword,stay,termofuse,privacysetting));
        }catch (Exception e){
            System.out.println("**************************************ERROR****************");
            System.out.println(e);
        }

    }

   // @When("^  El cliente llena la informacion (.+)  (.+)  (.+)  (.+)  (.+)  (.+) (.+)  (.+)  (.+) (.+)  (.+)  (.+)  (.+)  (.+)  (.+) (.+)  (.+) (.+) (.+) (.+)$")
   // public void el_cliente_llena_la_informacion(String firstname, String lastname, String email, String birthmonth, String birthday, String birthyear, String city, String zip, String country, String computer, String version, String language, String mobile, String model, String operating, String password, String confirmarpassword, String stay, String termofuse, String privacysetting)  {


   // }


    @Then("^Permite el registro con el mensaje  (.+)$")
    public void permite_el_registro_con_el_mensaje(String validatexto) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterQuestion.Validar_text_inicio(validatexto)));
    }

}