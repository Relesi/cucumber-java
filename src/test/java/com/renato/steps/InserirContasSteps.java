package com.renato.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class InserirContasSteps {

	private WebDriver driver;

	@Dado("que estou acessando a aplicação")
	public void queEstouAcessandoAAplicação() {
		System.setProperty("webdriver.chrome.driver", "/Users/r.lessa.da.silva/Downloads/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
	}

	@Quando("informo o usuário {string}")
	public void informoOUsuário(String arg1) {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@Quando("a senha {string}")
	public void aSenha(String arg1) {
		driver.findElement(By.name("senha")).sendKeys(arg1);
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Então("visualizo a página inicial")
	public void visualizoAPáginaInicial() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Bem vindo, rock!", texto);

	}

	@Quando("seleciono Contas")
	public void selecionoContas() {
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("seleciono Adicionar")
	public void selecionoAdicionar() {
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("informo a conta {string}")
	public void informoAConta(String arg1) {
		driver.findElement(By.id("nome")).sendKeys(arg1);
	}

	@Quando("seleciono Salvar")
	public void selecionoSalvar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Então("a conta é inserida com sucesso")
	public void aContaÉInseridaComSucesso() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);
	}

	@Então("sou notificado que o nome da conta é obrigatório")
	public void souNotificarQueONomeDaContaÉObrigatório() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta", texto);
	}

	@Então("sou notificado que já existe uma conta com esse nome")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", texto);
	}

	@Então("recebo a mensagem {string}")
	public void receboAMensagem(String arg1) {
		String texto = driver.findElement(By.xpath("//div[starts-with(@class, 'alert alert-']")).getText();
		Assert.assertEquals(arg1, texto);
	}

	// HOOKS

	@Before(order = 10)
	public void inicio() {
		System.out.println("Começando aqui");
	}
	
	@Before(order = 0)
	public void inicio2() {
		System.out.println("Começando aqui parte 2");
	}

	//Cucumber injeta cenario
	@After(order = 1, value = {"@funcionais"})
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 0, value = {"@funcionais"})
	public void fecharBrowser() {
		driver.quit();
		System.out.println("terminando");
	}

}
