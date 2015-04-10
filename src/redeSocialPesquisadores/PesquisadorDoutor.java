package redeSocialPesquisadores;

public class PesquisadorDoutor extends Pesquisador {

	private Integer qteAlunosMestradoOrientados;
	private Integer qteAlunosDouturadoOrientados;
	
	public Integer getQteAlunosMestradoOrientados() {
            return qteAlunosMestradoOrientados;
	}

	public Integer getQteAlunosDouturadoOrientados() {
            return qteAlunosDouturadoOrientados;
	}
        
        public PesquisadorDoutor(Long id, Integer qteHorasIC, Integer qteHorasED, Integer qteAlunosMestrado, Integer qteAlunosDoutorado){
            super(id, qteHorasIC, qteHorasED);
            this.qteAlunosMestradoOrientados = qteAlunosMestrado;
            this.qteAlunosDouturadoOrientados = qteAlunosDoutorado;
        }

	@Override
	public Double calcularPopularidade() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
