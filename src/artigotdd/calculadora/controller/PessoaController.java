package artigotdd.calculadora.controller;

import artigotdd.calculadora.dao.PessoaDAO;
import artigotdd.calculadora.model.GeradorDeLog;
import artigotdd.calculadora.model.Pessoa;

public class PessoaController {

	private PessoaDAO pessoaDAO;
	private GeradorDeLog log;

	public PessoaController(GeradorDeLog log) {
		this.pessoaDAO = new PessoaDAO();
		this.log = log;
	}

	public void exclui(Pessoa pessoa) {
		PessoaDAO.exclui(pessoa);
		log.criaLog(pessoa.getNome());
	}
}
