package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUi {
    public  static  final Target Button_Join_Today = Target.the("Oprima el boton").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public  static  final Target Input_firstName = Target.the("Ingrese su nombre").located(By.id("firstName"));
    public  static  final Target Input_lastName = Target.the("Ingrese su Apellido").located(By.id("lastName"));
    public  static  final Target Input_email = Target.the("Ingrese su email").located(By.id("email"));
    public  static  final Target Select_birthMonth = Target.the("Ingrese su mes").located(By.cssSelector("select#birthMonth"));
    public  static  final Target Select_birthDay = Target.the("Ingrese su dia").located(By.cssSelector("select#birthDay"));
    public  static  final Target Select_birthYear = Target.the("Ingrese su año").located(By.cssSelector("select#birthYear"));
    public  static  final Target Button_Next_address = Target.the("Oprima el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public  static  final Target Input_city = Target.the("Ingrese su ciudad").located(By.id("city"));
    public  static  final Target Input_zip = Target.the("Ingrese su codigo postal").located(By.id("zip"));
    public  static  final Target Input_Country = Target.the("Ingrese su nombre").locatedBy("div.ui-select ul li div");
    public  static  final Target Button_Next_devices = Target.the("Oprima el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public  static  final Target Input_Your_computer = Target.the("Ingrese version de computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public  static  final Target Input_Version = Target.the("ingrese la version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));
    public  static  final Target Input_Language = Target.the("ingrese el lenguaje").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));
    public  static  final Target Input_Your_Mobile_Device = Target.the("Ingrese version de celular").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public  static  final Target Input_Model = Target.the("ingrese el modelo").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public  static  final Target Input_Operating_System = Target.the("ingrese  el operador del sistema").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public  static  final Target Button_last_step = Target.the("Oprima el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public  static  final Target Input_password = Target.the("Ingrese la contraseña").located(By.id("password"));
    public  static  final Target Input_confirmPassword = Target.the("Confirme la contraseña").located(By.id("confirmPassword"));
    public  static  final Target Input_checkbox_Stay = Target.the("acepta condiciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public  static  final Target Input_checkbox_terms_uTest = Target.the("acepta terminos").located(By.id("termOfUse"));
    public  static  final Target Input_checkbox_Privacy_y_security = Target.the("acepta privacidad y securidad").located(By.id("privacySetting"));
    public  static  final Target Button_complete_setup = Target.the("Oprima el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div/a"));




}
