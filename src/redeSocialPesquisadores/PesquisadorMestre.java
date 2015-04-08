package redeSocialPesquisadores;

public class PesquisadorMestre extends Pesquisador {

	private Integer qteAlunosGraduacaoOrientados;
	
	public Integer getQteAlunosGraduacaoOrientados() {
		return qteAlunosGraduacaoOrientados;
	}

	public void setQteAlunosGraduacaoOrientados(
			Integer qteAlunosGraduacaoOrientados) {
		this.qteAlunosGraduacaoOrientados = qteAlunosGraduacaoOrientados;
	}
	
	@Override
	public Double calcularPopularidade() {
		// TODO Auto-generated method stub
		return null;
	}	

}
