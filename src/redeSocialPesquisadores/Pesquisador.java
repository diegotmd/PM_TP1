package redeSocialPesquisadores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

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
    * Metodo abstrato que calcula a popularidade de um pesquisador.
    * <p>
    * Deve ser implementado pelas classes filhas.
    */
    public abstract Double calcularPopularidade();

    /**
    * Adiciona um artigo e sua ordem de publicacao a lista de publicacoes do pesquisador.
    */
    public void adicionarArtigoPublicado(Artigo a, Integer ordem) {
        PublicacaoArtigo publicacao = new PublicacaoArtigo(a, ordem);
        this.artigosPublicados.add(publicacao);
        return;
    }

    /**
    * Metodo estatico que le um arquivo contendo os pesquisadores e seus dados
    * e carrega uma lista de pesquisadores, que e retornada.
    */
    public static LinkedList<Pesquisador> carregarPesquisadores(String caminhoArquivo) {
        Long idPesquisador;
    	String tagTitulacao;
    	Integer qtdHorasIC;
    	Integer qtdHorasED;
    	Integer numGradOrient;
    	Integer numMestOrient;
    	Integer numDocOrient;
    	String strAux;
    	        
    	LinkedList<Pesquisador> listaPesquisadores = new LinkedList<Pesquisador>();
        Pesquisador pesquisador = null;
        Scanner arqPesquisadores = null;

        try {
        	arqPesquisadores = new Scanner(new FileReader(caminhoArquivo)).useDelimiter("\\;|\\n");
        } catch (FileNotFoundException ex) {
        	// tratar excecao de arquivo não encontrado
        }
        
        while (arqPesquisadores.hasNext()) {
        	idPesquisador = arqPesquisadores.nextLong();
        	tagTitulacao = arqPesquisadores.next();
        	qtdHorasIC = arqPesquisadores.nextInt();
        	qtdHorasED = arqPesquisadores.nextInt();
        	numGradOrient = arqPesquisadores.nextInt();
        	numMestOrient = arqPesquisadores.nextInt();
        	
        	// seleciona último campo como string e retira último caractere antes de converter para inteiro (quebra de linha)
        	strAux = arqPesquisadores.next();
        	numDocOrient = Integer.parseInt(strAux.substring(0, strAux.length() - 1));
        	
        	switch (tagTitulacao) {
        	case "G":
        		pesquisador = new PesquisadorGraduado(idPesquisador, qtdHorasIC, qtdHorasED);
        	break;
        	case "M":
        		pesquisador = new PesquisadorMestre(idPesquisador, qtdHorasIC, qtdHorasED, numGradOrient);
        	break;
        	case "D":
        		pesquisador = new PesquisadorDoutor(idPesquisador, qtdHorasIC, qtdHorasED, numGradOrient, numMestOrient, numDocOrient);
        	break;
        	}
        	
        	listaPesquisadores.add(pesquisador);
        } 
 
        return listaPesquisadores;
    }

    /**
    * Metodo estatico. Le um arquivo contendo as publicacoes de artigos pelos
    * pesquisadores, uma por linha, no formato "id_artigo;id_pesquisador;ordem_publicacao",
    * carregando os dados nas listas de artigos publicados dos pesquisadores.
    * 
    * @param caminhoArquivo caminho completo do arquivo contendo os dados de publicaÃ§Ãµes
    * @param pesquisadores lista de pesquisadores da rede social
    * @param artigos lista de artigos da rede social
    */
    public static void carregarPublicacoes(String caminhoArquivo, LinkedList<Pesquisador> pesquisadores, LinkedList<Artigo> artigos) {
        return;
    }
    
    /**
    * Metodo estatico. Escreve a popularidade dos pesquisadores em um arquivo texto,
    * um registro por linha, no formato "id_pesquisador;popularidade"
    * 
    * @param caminhoArquivo caminho completo do arquivo que sera gerado
    * @param pesquisadores lista de pesquisadores da rede social
    */
    public static void escreverPopularidades(String caminhoArquivo, LinkedList<Pesquisador> pesquisadores) {
        return;
    }

}
