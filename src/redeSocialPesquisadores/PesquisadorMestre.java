package redeSocialPesquisadores;

public class PesquisadorMestre extends Pesquisador {

    private Integer qteAlunosGraduacaoOrientados;

    public Integer getQteAlunosGraduacaoOrientados() {
            return qteAlunosGraduacaoOrientados;
    }


    public PesquisadorMestre(Long id, Integer qteHorasIC, Integer qteHorasED, Integer qteAlunosGraduacao){
        super(id, qteHorasIC, qteHorasED);
        this.qteAlunosGraduacaoOrientados = qteAlunosGraduacao;
    }

    @Override
    public Double calcularPopularidade() {
            
        return this.calcularPopularidadeBase() +
               this.getQteHorasIniciacaoCientifica() +
               this.getQteHorasEstagioDocencia() +
               (10 * this.getQteAlunosGraduacaoOrientados());
    }	
}
