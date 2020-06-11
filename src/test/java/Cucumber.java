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
	
	private int contador = 0;
	
	@Dado("^that the contactor value  is (\\d+)$")
	public void that_the_contactor_value_is(int arg1) throws Throwable {
	  contador = arg1;
	}

	@Quando("^I increment in (\\d+)$")
	public void i_increment_in(int arg1) throws Throwable {
		contador  = contador + arg1;
	   
	}

	@Então("^The value contactor It will be (\\d+)$")
	public void the_value_contactor_It_will_be(int arg1) throws Throwable {
	   System.out.println(arg1);
	   System.out.println(contador);
	   System.out.println(arg1 == contador);
	}

}
