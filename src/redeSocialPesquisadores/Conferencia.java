package redeSocialPesquisadores;

public class Conferencia extends Veiculo {

    public Conferencia(Long id){
        super(id);
    }

    @Override
    public Double calcularFatorImpacto() {
        return this.calcularFatorImpactoBase() + 1.0;
    }
}
