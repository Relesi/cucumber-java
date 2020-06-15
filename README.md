[![Build Status](https://travis-ci.org/Relesi/cucumber-java.svg?branch=master)](https://travis-ci.org/Relesi/cucumber-java)

# Cucumber-Java

O cucumber é framework em ruby que suporta BDD, o cucumber entende as frases escrita em Gherkin e 
as transforma em “steps”, cada frase vira um bloco de código e dentro de cada um você pode colocar o código.
Tornando assim muito simples a execução e separação de evidencias direcionadas para cada tipo de testes que desejo
dentro do contexto de cada regra de negócio.
 
### Selenium

 * Teste unitário: o objetivo desse teste é garantir que, de forma isolada, o componente testado 
  está se comportando de acordo com o esperado.
  
 * Teste funcional: o objetivo desse teste é garantir que, da visão do usuário, 
  a funcionalidade testada está se comportando de acordo com o esperado.
  
 * Teste de integração: o objetivo desse teste é garantir que, de forma integrada, 
	os componentes testados estão se comportando de acordo com o esperado.


### Git hub

Referências para o desenvolvimento do modelo de testes.

https://github.com/cucumber/cucumber
https://github.com/SeleniumHQ/selenium


### Aplicação hospedada no Heroku

	Massa de dados usada para testes funcionais. 

* https://srbarriga.herokuapp.com/


### Como executar a aplicação

Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.

git clone https://github.com/Relesi/cucumber-java
cd /path/to/your/repo
mvn spring-boot:run


### Instale ChromeDriver - WebDriver for Chrome

O WebDriver suporta as seguintes linguagens: 
Java, C#, Python, Ruby, Perl, PHP e JavaScript. 
Como minha linguagem-mãe é o Java, utilizei o próprio Java para os exemplos que vamos ver a seguir.
O WebDriver permite a utilização de diferentes navegadores, mas para isso precisamos do Driver do navegador.
Por exemplo: Se vamos executar os testes no Chrome, precisamos do executável do ChromeDriver e também precisamos 
especificar qual é o caminho desse executável.

* https://chromedriver.chromium.org/downloads


### Importando o projeto no Eclipse, STS 

No terminal, execute a seguinte operação:

mvn eclipse:eclipse

No Eclipse/STS, importe o projeto como projeto Maven.

Depois que o projeto estiver importado, mude o application para test e execute os seguintes comandos. 

mvn clean install
mvn install 

Maven - update project


