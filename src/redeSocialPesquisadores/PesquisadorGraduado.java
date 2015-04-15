package redeSocialPesquisadores;

/**
 * Classe PesquisadorGraduado, representa pesquisadores que são somente graduados. Possui uma forma específica de cálculo da popularidade na rede social.
 */
public class PesquisadorGraduado extends Pesquisador {

    public PesquisadorGraduado(Long id, Integer qteHorasIC, Integer qteHorasED){
        super(id, qteHorasIC, qteHorasED);
    }	
    
    @Override
    public Double calcularPopularidade() {
        // TODO Auto-generated method stub
        return this.calcularPopularidadeBase() +
               this.getQteHorasIniciacaoCientifica() +
               this.getQteHorasEstagioDocencia();
    }

}
