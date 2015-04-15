package redeSocialPesquisadores;

/**
 * Classe Revista, representa um tipo de Veículo de publicação, possui a própria forma de cálculo do fato de impacto.
 */
public class Revista extends Veiculo {

    public Revista(Long id){
        super(id);
    }
    
    @Override
    public Double calcularFatorImpacto() {
        return this.calcularFatorImpactoBase() + 2.0;
    }
}
