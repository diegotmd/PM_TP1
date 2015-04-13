package redeSocialPesquisadores;

public class Revista extends Veiculo {

    public Revista(Long id){
        super(id);
    }
    
    @Override
    public Double calcularFatorImpacto() {
        return this.calcularFatorImpactoBase() + 2.0;
    }

}
