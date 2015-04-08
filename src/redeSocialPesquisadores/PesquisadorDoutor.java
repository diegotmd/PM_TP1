package redeSocialPesquisadores;

public class PesquisadorDoutor extends Pesquisador {

	private Integer qteAlunosMestradoOrientados;
	private Integer qteAlunosDouturadoOrientados;
	
	public Integer getQteAlunosMestradoOrientados() {
		return qteAlunosMestradoOrientados;
	}

	public void setQteAlunosMestradoOrientados(
			Integer qteAlunosMestradoOrientados) {
		this.qteAlunosMestradoOrientados = qteAlunosMestradoOrientados;
	}

	public Integer getQteAlunosDouturadoOrientados() {
		return qteAlunosDouturadoOrientados;
	}

	public void setQteAlunosDouturadoOrientados(
			Integer qteAlunosDouturadoOrientados) {
		this.qteAlunosDouturadoOrientados = qteAlunosDouturadoOrientados;
	}

	@Override
	public Double calcularPopularidade() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
