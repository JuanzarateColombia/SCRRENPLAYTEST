package taks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import ui.RegisterUi;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RegisterTaks implements Task {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String birthMonth;
    private final String birthDay;
    private final String birthYear;
    private final String city;
    private final String zip;
    private final String country;
    private final String computer;
    private final String version;
    private final String language;
    private final String mobile;
    private final String model;
    private final String operating;
    private final String password;
    private final String confirmarpassword;
    private final String stay;
    private final String termOfUse;
    private final String privacySetting;

    public RegisterTaks(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String city, String zip, String country, String computer, String version, String language, String mobile, String model, String operating, String password, String confirmarpassword, String stay, String termOfUse, String privacySetting) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.operating = operating;
        this.password = password;
        this.confirmarpassword = confirmarpassword;
        this.stay = stay;
        this.termOfUse = termOfUse;
        this.privacySetting = privacySetting;
    }


    public <T extends Actor> void seleccionar(T actor) {
        actor.attemptsTo(Click.on(RegisterUi.Button_Join_Today));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(RegisterUi.Input_firstName ));
        actor.attemptsTo(Enter.theValue(lastName).into(RegisterUi.Input_lastName ));
        actor.attemptsTo(Enter.theValue(email).into(RegisterUi.Input_email ));
        actor.attemptsTo(SelectFromOptions.byVisibleText(birthMonth).from(RegisterUi.Select_birthMonth));
        actor.attemptsTo(SelectFromOptions.byVisibleText(birthDay).from(RegisterUi.Select_birthDay));
        actor.attemptsTo(SelectFromOptions.byVisibleText(birthYear).from(RegisterUi.Select_birthYear));
        actor.attemptsTo(Click.on(RegisterUi.Button_Next_address));
        actor.attemptsTo(Enter.theValue(city).into(RegisterUi.Input_city ));
        actor.attemptsTo(Enter.theValue(zip).into(RegisterUi.Input_zip ));
        actor.attemptsTo(SelectFromOptions.byVisibleText(country).from(RegisterUi.Input_Country));
        actor.attemptsTo(Click.on(RegisterUi.Button_Next_devices));
        actor.attemptsTo(Enter.theValue(computer).into(RegisterUi.Input_Your_computer ));
        actor.attemptsTo(Enter.theValue(version).into(RegisterUi.Input_Version ));
        actor.attemptsTo(Enter.theValue(language).into(RegisterUi.Input_Language ));
        actor.attemptsTo(Enter.theValue(mobile).into(RegisterUi.Input_Your_Mobile_Device ));
        actor.attemptsTo(Enter.theValue(model).into(RegisterUi.Input_Model ));
        actor.attemptsTo(Enter.theValue(operating).into(RegisterUi.Input_Operating_System ));
        actor.attemptsTo(Click.on(RegisterUi.Button_last_step));
        actor.attemptsTo(Enter.theValue(password).into(RegisterUi.Input_password ));
        actor.attemptsTo(Enter.theValue(confirmarpassword).into(RegisterUi.Input_confirmPassword ));
        actor.attemptsTo(Enter.theValue(stay).into(RegisterUi.Input_checkbox_Stay ));
        actor.attemptsTo(Enter.theValue(termOfUse).into(RegisterUi.Input_checkbox_terms_uTest ));
        actor.attemptsTo(Enter.theValue(privacySetting).into(RegisterUi.Input_checkbox_Privacy_y_security ));
        actor.attemptsTo(Click.on(RegisterUi.Button_complete_setup));

    }
    public static Performable RegistroCompleto (String firstname, String lastname, String email, String birthmonth, String birthday, String birthyear, String city, String zip, String country, String computer, String version, String language, String mobile, String model, String operating, String password, String confirmarpassword, String stay, String termofuse, String privacysetting) {
        return instrumented(RegisterTaks.class,firstname,lastname,email,birthmonth,birthday,birthyear,city,zip,country,computer,version,language,mobile,model,operating,password,confirmarpassword,stay,termofuse,privacysetting);
    }
}
