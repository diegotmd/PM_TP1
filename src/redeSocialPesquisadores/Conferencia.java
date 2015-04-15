package redeSocialPesquisadores;

/**
 * Classe Conferencia, representa um tipo de Veículo de publicação, possui a própria forma de cálculo do fato de impacto.
 */
public class Conferencia extends Veiculo {

    public Conferencia(Long id){
        super(id);
    }

    @Override
    public Double calcularFatorImpacto() {
        return this.calcularFatorImpactoBase() + 1.0;
    }
}
