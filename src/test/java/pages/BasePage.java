package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
        protected static WebDriver driver;
        // private static Actions action; 

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        static{
            WebDriverManager.chromedriver().setup(); // Configura el WebDriver para Chrome usando WebDriverManager
            driver = new ChromeDriver();  //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
            driver.manage().window().maximize();  // Maximize the browser window
        }

        public BasePage(WebDriver driver) {
            BasePage.driver = driver; // Asigna el WebDriver pasado como parámetro a la variable estática driver
        }

        public static void navigateTo(String url) {
            driver.get(url); // Usa el WebDriver para navegar a la URL especificada
        }

            //metodo p cerrar el browser
        public static void closeBrowser(){ 
            driver.quit(); //el quit cierra el driver
        }
}
