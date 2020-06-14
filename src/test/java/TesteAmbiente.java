import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteAmbiente {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/r.lessa.da.silva/Downloads/drivers/chromedriver");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.get("http://renato.relesi.com.br/");
			
	}

}

