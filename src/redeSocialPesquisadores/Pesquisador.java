package redeSocialPesquisadores;

import java.util.LinkedList;

public abstract class Pesquisador {
	
    private final Long idPesquisador;
    private final Integer qteHorasIniciacaoCientifica;
    private final Integer qteHorasEstagioDocencia;
    private final LinkedList<PublicacaoArtigo> artigosPublicados; 

    public Pesquisador (Long id, Integer qteHorasIC, Integer qteHorasED) {
        this.idPesquisador = id;
        this.qteHorasIniciacaoCientifica = qteHorasIC;
        this.qteHorasEstagioDocencia = qteHorasED;
        artigosPublicados = new LinkedList<PublicacaoArtigo>();
    }

    public Long getIdPesquisador() {
            return idPesquisador;
    }

    public Integer getQteHorasIniciacaoCientifica() {
            return qteHorasIniciacaoCientifica;
    }

    public Integer getQteHorasEstagioDocencia() {
            return qteHorasEstagioDocencia;
    }

    /**
    * Calcula o peso de um pesquisador conforme os artigos por ele publicados.
    */
    public Double calcularPeso() {
        // Calcula o peso de um pesquisador conforme os artigos por ele publicados
        Integer peso;

        // para cada artigo publicado, soma (1/ordem)
        return 0.0;
    }

    /**
    * Método abstrato que calcula a popularidade de um pesquisador.
    * <p>
    * Deve ser implementado pelas classes filhas.
    */
    public abstract Double calcularPopularidade();

    /**
    * Adiciona um artigo e sua ordem de publicação à lista de publicações do pesquisador.
    */
    public void adicionarArtigoPublicado(Artigo a, Integer ordem) {
        PublicacaoArtigo publicacao = new PublicacaoArtigo(a, ordem);
        this.artigosPublicados.add(publicacao);
        return;
    }

    /**
    * Método estático que lê um arquivo contendo os pesquisadores e seus dados
    * e carrega uma lista de pesquisadores, que é retornada.
    */
    public static LinkedList<Pesquisador> carregarPesquisadores(String caminhoArquivo) {
        LinkedList<Pesquisador> listaPesquisadores = new LinkedList<Pesquisador>();
        return listaPesquisadores;
    }

    /**
    * Método estático. Lê um arquivo contendo as publicações de artigos pelos
    * pesquisadores, uma por linha, no formato "id_artigo;id_pesquisador;ordem_publicacao",
    * carregando os dados nas listas de artigos publicados dos pesquisadores.
    * 
    * @param caminhoArquivo caminho completo do arquivo contendo os dados de publicações
    * @param pesquisadores lista de pesquisadores da rede social
    * @param artigos lista de artigos da rede social
    */
    public static void carregarPublicacoes(String caminhoArquivo, LinkedList<Pesquisador> pesquisadores, LinkedList<Artigo> artigos) {
        return;
    }
    
    /**
    * Método estático. Escreve a popularidade dos pesquisadores em um arquivo texto,
    * um registro por linha, no formato "id_pesquisador;popularidade"
    * 
    * @param caminhoArquivo caminho completo do arquivo que será gerado
    * @param pesquisadores lista de pesquisadores da rede social
    */
    public static void escreverPopularidades(String caminhoArquivo, LinkedList<Pesquisador> pesquisadores) {
        return;
    }

}
