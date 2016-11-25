package artigotdd.calculadora.teste;

import org.junit.Test;

import static org.junit.Assert.*;

import artigotdd.calculadora.controller.PessoaController;
import artigotdd.calculadora.model.LogMock;
import artigotdd.calculadora.model.Pessoa;

public class PessoaTeste {
	
	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida() throws Exception{
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alexandre");

		LogMock nossoLogMock = new LogMock();
		PessoaController pessoaController = new PessoaController(nossoLogMock);
		pessoaController.exclui(pessoa);

		assertEquals(pessoa.getNome(), nossoLogMock.getNome());
	}

}
