package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    private static WebDriver createChrome() {
        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        //execução sem modo heacless
        WebDriver driver = new ChromeDriver();

        //Maximizar a tela
        driver.manage().window().maximize();

        //navegando par a pagina
        driver.get("http://mantis-prova.base2.com.br");

        //atualizar a pagina
        driver.navigate().refresh();

        return driver;
    }

    //----------------Test setup----------------//
    @Before
    public void setupTest(){
        //abrir pagina
        driver = createChrome();
    }

    @After
    public void tearDown(){
        //fechar pagina
        driver.quit();
    }
}
