import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Cucumber {

	@Dado("^creat file$")
	public void creatFile() throws Throwable {
		System.out.println("qualquer coisa");
		
	}

	@Quando("^Run$")
	public void run() throws Throwable {
		
	}

	@Então("^The especification must with success$")
	public void theEspecificationMustWithSuccess() throws Throwable {
		
	}

}
