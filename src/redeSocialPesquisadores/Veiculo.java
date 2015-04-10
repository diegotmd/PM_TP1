package redeSocialPesquisadores;

import java.util.LinkedList;

public abstract class Veiculo {

    private Long idVeiculo;
    private LinkedList<Artigo> artigosPublicados;

    public Veiculo(Long id){
        this.idVeiculo = id;
    }

    /**
    * Método abstrato. Calcula fator de impacto de um veículo.
    * Deve ser implementado pelas classes filhas.
    * 
    */
    public abstract Double calcularFatorImpacto();

    /**
    * Método estático. Lê um arquivo contendo os veículos,
    * um por linha, no formato "id_veiculo;tipo_veiculo",
    * carregando os dados em uma lista de veiculos, que é retornada. 
    * 
    * @param caminhoArquivo caminho completo do arquivo contendo os dados de veículos
    */
    public static LinkedList<Veiculo> carregarVeiculos(String caminhoArquivo){
        LinkedList<Veiculo> veiculos= new LinkedList<Veiculo>(); 
        return veiculos;
    }
        
    /**
    * Método estático. Escreve o fator de impacto dos veículos em um arquivo texto,
    * um registro por linha, no formato "id_veiculo;fator_impacto"
    * 
    * @param caminhoArquivo caminho completo do arquivo que será gerado
    * @param veiculos lista de veículos da rede social
    */
    public static void escreverFatorImpactoVeiculos(String caminhoArquivo, LinkedList<Veiculo> veiculos) {
        return;
    }
}
