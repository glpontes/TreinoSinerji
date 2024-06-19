import app.Calculadora;
import app.calculo.CalculadoraImpl;

module appCalculo1 {
	
	requires transitive appLoggin;
	exports app.calculo;
	
	exports app.calculo.interno
		to appFinanceiro1;
	
	opens app.calculo 
		to appLoggin, appFinanceiro1;
	
	requires appApi;
	provides Calculadora
		with CalculadoraImpl;
}