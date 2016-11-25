package artigotdd.calculadora.teste;

import org.junit.Test;

import artigotdd.calculadora.model.Calculadora;

import static org.junit.Assert.*;

public class CalculadoraTeste {

//	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception{
		
		int valorA = 1;
		int valorB = 2;
				
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);
		
		assertEquals(3, soma);
	}
	
//	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception{
		
		Calculadora calculadora = new Calculadora();
		int valorA = 1;
		int valorB = 2;
		int soma = calculadora.subtrai(valorA, valorB);

		assertEquals(-1, soma);
	}
	
//	@Test
	public void deveriaDividirDoisValoresPassadosSemExcecao() throws Exception {
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);

		assertEquals(3, divisao);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaDividirDoisValoresPassadosCemExcecao() throws Exception {
		int valorA = 6;
		int valorB = 0;
		Calculadora calculadora = new Calculadora();
		int divisao = calculadora.divide(valorA, valorB);

		assertEquals(0, divisao);
	}
}
