package redeSocialPesquisadores;

import java.util.LinkedList;

public class Artigo {

    private Long idArtigo;
    private Veiculo veiculoPublicado;
    private LinkedList<Artigo> citadoPorArtigos;

    public Artigo(Long id, Veiculo veiculo){
        this.idArtigo = id;
        this.veiculoPublicado = veiculo;
        citadoPorArtigos = new LinkedList<Artigo>();
    }
    
    public Long getIdArtigo() {
        return idArtigo;
    }

    public Veiculo getVeiculoPublicado() {
        return veiculoPublicado;
    }

    public Double calcularQualidade(){
        return 0.0;
    }

    /**
    * Adiciona um registro à lista de artigos que citaram esta instância de artigo.
    * 
    * @param artigo Artigo citador.
    */
    public void adicionarCitacao(Artigo artigo){
        citadoPorArtigos.add(artigo);
        return;
    }

    /**
    * Metodo estatico. Le o conteudo de um arquivo contendo os artigos no formato
    * "id_artigo;id_veiculo_publicador"
    * 
    * @param artigo Artigo citador.
    * @param veiculos Lista de veiculos existentes na rede social.
    */
    public static LinkedList<Artigo> carregarArtigos(String caminhoArquivo, LinkedList<Veiculo> veiculos){
        LinkedList<Artigo> artigos = new LinkedList<Artigo>(); 
        return artigos;
    }

    /**
    * Metodo estatico. Le o conteudo de um arquivo contendo as citacoes no formato
    * "id_artigo_citado;id_artigo_citador", e carrega os dados na lista de artigos
    * existentes na rede social, recebido como parametro.
    * 
    * @param artigo Artigo citador.
    * @param veiculos Lista de veiculos existentes na rede social.
    */
    public static void carregarCitacoes(String caminhoArquivo, LinkedList<Artigo> artigos){
        return;
    }
    
    /**
    * Metodo estatico. Escreve a qualidade dos artigos em um arquivo texto,
    * um registro por linha, no formato "id_artigo;qualidade"
    * 
    * @param caminhoArquivo caminho completo do arquivo que sera gerado
    * @param artigos lista de veiculos da rede social
    */
    public static void escreverQualidadeArtigos(String caminhoArquivo, LinkedList<Artigo> artigos) {
        return;
    }
	
}
