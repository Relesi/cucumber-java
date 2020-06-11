import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

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

	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
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

}
