package hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_urls.SchoolBaseUrl.schoolSetUp;

public class Hooks {

    @Before()
    public void beforeApi(){
        schoolSetUp();
    }

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_"+scenario.getName());

        }
        Driver.closeDriver();
    }
}
