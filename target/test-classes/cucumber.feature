#language: pt

Funcionalidade: Cucumber 
  	I want run cucumber


Cenário: Must run espcifications 
	Dado creat file
	Quando Run
	Então The especification must with success
	
Cenário: Must increment the contactor
	Dado that the contactor value  is 15
	Quando I increment in 3
	Então The value contactor It will be 18
	
Cenário: Must increment the contactor
	Dado that the contactor value  is 123
	Quando I increment in 35
	Então The value contactor It will be 158
	
Cenário: Deve calcular atraso na entrega 
	Dado que a entrega é dia 05/04/2018
	Quando a entrega atrasar em 2 dias
	Então a entrega sera efetuada em 07/04/2018
		
Cenário: Deve calcular atraso no prazo de entrega china
	Dado que o prazo é dia 05/04/2018
	Quando a entrega atrasar em 2 meses  
	Então a entrega sera efetuada em 05/06/2018
		
		
		
		
