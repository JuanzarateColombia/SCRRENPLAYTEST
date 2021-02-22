package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUi;

public class RegisterQuestion implements Question {
    private final String validatexto;
    public RegisterQuestion(String validatexto) {
        this.validatexto = validatexto;
    }



    @Override
    public Object answeredBy(Actor actor) {
        if (
                Text.of(HomeUi.h1_valid_text).viewedBy(actor).asString().equals(validatexto.toString())
        )
        return true;
        else
            return false;
    }
    public static  RegisterQuestion Validar_text_inicio (String validatexto){
        return new RegisterQuestion(validatexto);
    }
}
