package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUi {
    public  static  final Target h1_valid_text = Target.the("El cliente ingresga a home ").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}


