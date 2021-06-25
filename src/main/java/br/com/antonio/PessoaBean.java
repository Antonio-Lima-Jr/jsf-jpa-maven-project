package br.com.antonio;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.antonio.entity.dao.DaoGeneric;
import br.com.antonio.entity.model.Pessoa;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean {

	Pessoa pessoa = new Pessoa();

	private DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();

	public void salvar() {		
		pessoa = daoGeneric.merge(pessoa);
	}
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
