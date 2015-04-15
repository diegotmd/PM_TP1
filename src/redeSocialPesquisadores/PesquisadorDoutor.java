package redeSocialPesquisadores;

/**
 * Classe PesquisadorDoutor, representa pesquisadores que são doutores. Possui uma forma específica de cálculo da popularidade na rede social.
 */
public class PesquisadorDoutor extends Pesquisador {

    private Integer qteAlunosGraduacaoOrientados;
    private Integer qteAlunosMestradoOrientados;
    private Integer qteAlunosDouturadoOrientados;

    public Integer getQteAlunosGraduacaoOrientados() {
        return qteAlunosGraduacaoOrientados;
    }

    public Integer getQteAlunosMestradoOrientados() {
        return qteAlunosMestradoOrientados;
    }

    public Integer getQteAlunosDouturadoOrientados() {
        return qteAlunosDouturadoOrientados;
    }

    public PesquisadorDoutor(Long id, Integer qteHorasIC, Integer qteHorasED, Integer qteAlunosGraduacao, Integer qteAlunosMestrado, Integer qteAlunosDoutorado){
        super(id, qteHorasIC, qteHorasED);
        this.qteAlunosGraduacaoOrientados = qteAlunosGraduacao;
        this.qteAlunosMestradoOrientados = qteAlunosMestrado;
        this.qteAlunosDouturadoOrientados = qteAlunosDoutorado;
    }

    @Override
    public Double calcularPopularidade() {
        // TODO Auto-generated method stub
        return this.calcularPopularidadeBase() +
               this.getQteHorasIniciacaoCientifica() +
               this.getQteHorasEstagioDocencia() +
               (10 * this.getQteAlunosGraduacaoOrientados()) +
               (20 * this.getQteAlunosMestradoOrientados()) +
               (30 * this.getQteAlunosDouturadoOrientados());
    }	
}
