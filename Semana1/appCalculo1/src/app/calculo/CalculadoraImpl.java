package app.calculo;

import app.Calculadora;
import app.calculo.interno.OperacoesAritimeticas;
import app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";
	
	private OperacoesAritimeticas opAritmeticas = new OperacoesAritimeticas();
	
	public double soma (double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
	public Class<Logger> getLoggerClass(){
		return Logger.class;
	}
	
	public String getId() {
		return id;
	}
}
