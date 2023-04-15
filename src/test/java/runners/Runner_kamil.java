package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // test çalıştırıcı notasyonu
@CucumberOptions( // Seneryoların nerede ve nasıl çalışacağı, hangi raporun kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {"html:src/test/resources/reports/kamilReports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@US05_TC01",
        dryRun = false //Seneryonun adımlarını kontrol eder ve çalıştığını görürüz

)
public class Runner_kamil {

}