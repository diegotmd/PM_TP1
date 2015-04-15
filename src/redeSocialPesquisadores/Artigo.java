package redeSocialPesquisadores;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Classe Artigo, representa artigos publicados por pesquisadores em veículos.
 */
 
public class Artigo implements Comparable<Artigo> {

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

    public Double calcularQualidade() {
        Double fatorImpactoVeiculo = veiculoPublicado.calcularFatorImpacto();
        Double qteCitacoes = (double) this.quantidadeDeCitacoes();
        return fatorImpactoVeiculo * qteCitacoes;
    }
    
    public Integer quantidadeDeCitacoes() {
        return citadoPorArtigos.size();
    }

    /**
    * Adiciona um registro a lista de artigos que citaram esta instancia de artigo.
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
        Long idArtigo;
        Long idVeiculo;
    	
    	LinkedList<Artigo> artigos = new LinkedList<Artigo>(); 
        Artigo artigo = null;
        Scanner arqArtigosVeiculos = null;

        try {
        	arqArtigosVeiculos = new Scanner(new FileReader(caminhoArquivo)).useDelimiter("\\;|\\r\n");
        } catch (FileNotFoundException ex) {
        	// tratar excecao de arquivo nao encontrado
        }
        
        while (arqArtigosVeiculos.hasNextLong()) {
        	idArtigo = arqArtigosVeiculos.nextLong();
        	idVeiculo = arqArtigosVeiculos.nextLong();
        	
        	// encontra veiculo, cria artigo e associa a lista de artigos do veiculo
        	for (Veiculo veiculo : veiculos) {
        		if (veiculo.getIdVeiculo().equals(idVeiculo)) {
        			artigo = new Artigo(idArtigo, veiculo);
        			veiculo.adicionarArtigoPublicado(artigo);
        		}
        	}
        	
        	artigos.add(artigo);
        }
        
        arqArtigosVeiculos.close();
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
    public static void carregarCitacoes(String caminhoArquivo, LinkedList<Artigo> artigos) throws IOException {
        Long idArtigo, idArtigoCitador;
    	
        Artigo artigo = null;
        Artigo artigoCitador = null;
        Scanner arqCitacoesArtigos = null;

        try {
            arqCitacoesArtigos = new Scanner(new FileReader(caminhoArquivo)).useDelimiter("\\;|\\r\n");
        } catch (IOException ex) {
        	throw ex;
        }
        
        while (arqCitacoesArtigos.hasNextLong()) {
            idArtigo = arqCitacoesArtigos.nextLong();
            idArtigoCitador = arqCitacoesArtigos.nextLong();

            for (Artigo a : artigos) {
                if (a.getIdArtigo().equals(idArtigo)) {
                    artigo = a;
                }
                else if (a.getIdArtigo().equals(idArtigoCitador)) {
                    artigoCitador = a;
                }
            }
            
            // adiciona artigo citador na lista
            artigo.adicionarCitacao(artigoCitador);
        }
        
        arqCitacoesArtigos.close();
        return;
    }
    
    /**
    * Metodo estatico. Escreve a qualidade dos artigos em um arquivo texto,
    * um registro por linha, no formato "id_artigo;qualidade"
    * 
    * @param caminhoArquivo caminho completo do arquivo que sera gerado
    * @param artigos lista de veiculos da rede social
     * @throws IOException 
    */
    public static void escreverQualidadeArtigos(String caminhoArquivo, LinkedList<Artigo> artigos) throws IOException {
    	
    	BufferedWriter output = null;
        
        try {
            output = new BufferedWriter(new FileWriter(caminhoArquivo, false));        
            
            Collections.sort(artigos);
            
            for (Artigo a : artigos) {
                output.append(a.getIdArtigo()+ ";" + String.format(Locale.ENGLISH, "%.4f", a.calcularQualidade()));
                output.newLine();
            }

            output.flush();
            output.close();
        } catch (IOException ex) {
        	// tratar excecao de arquivo nao encontrado
        	throw ex;
        }
        
        return;
    }

    /**
     * Sobrescrita do metodo compareTo da interface Comparable<T> para realizar a ordenacao dos artigos
     * */
    @Override
    public int compareTo(Artigo artigoComparado) {
        if (this.idArtigo < artigoComparado.idArtigo) {
            return -1;
        } else if (this.idArtigo > artigoComparado.idArtigo) {
            return 1;
        }
        return 0;
    }
}
