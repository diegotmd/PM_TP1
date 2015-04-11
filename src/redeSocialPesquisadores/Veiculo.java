package redeSocialPesquisadores;

import java.util.LinkedList;

public abstract class Veiculo {

    private Long idVeiculo;
    private LinkedList<Artigo> artigosPublicados;

    public Veiculo(Long id){
        this.idVeiculo = id;
    }

    /**
    * Metodo abstrato. Calcula fator de impacto de um veiculo.
    * Deve ser implementado pelas classes filhas.
    * 
    */
    public abstract Double calcularFatorImpacto();

    /**
    * Metodo estatico. Le um arquivo contendo os veiculos,
    * um por linha, no formato "id_veiculo;tipo_veiculo",
    * carregando os dados em uma lista de veiculos, que e retornada. 
    * 
    * @param caminhoArquivo caminho completo do arquivo contendo os dados de veiculos
    */
    public static LinkedList<Veiculo> carregarVeiculos(String caminhoArquivo){
        LinkedList<Veiculo> veiculos = new LinkedList<Veiculo>(); 
        return veiculos;
    }
        
    /**
    * Metodo estatico. Escreve o fator de impacto dos veiculos em um arquivo texto,
    * um registro por linha, no formato "id_veiculo;fator_impacto"
    * 
    * @param caminhoArquivo caminho completo do arquivo que sera gerado
    * @param veiculos lista de veiculos da rede social
    */
    public static void escreverFatorImpactoVeiculos(String caminhoArquivo, LinkedList<Veiculo> veiculos) {
        return;
    }
}
