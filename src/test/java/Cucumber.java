import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.Transform;
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
		contador = contador + arg1;

	}

	@Então("^The value contactor It will be (\\d+)$")
	public void the_value_contactor_It_will_be(int arg1) throws Throwable {
		Assert.assertEquals(contador, arg1);
	}

	Date entrega = new Date();

	@Dado("^que a entrega é dia (.*)$")
	public void queAEntregaÉDia(@Transform(DateConverter.class)Date data) throws Throwable {
		entrega = data;
		System.out.println(entrega);
		// fazer apresentação do mes

	}

	// ^a entrega atrasar em (\\d+) dias$
	//^a entrega atrasar em (\\d+) (.+)$
	
	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}

		entrega = cal.getTime();
	}

	@Então("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}
	
	
	
	//novo cenarios
	


	@Dado("^que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String arg1) throws Throwable {
	    
	}

	@Dado("^que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
	   
	}

	@Dado("^que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
	 
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}+-\\d{4})")
	public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {
	
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	 
	}

	@Então("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
	  
	}

}
