package redeSocialPesquisadores;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        LinkedList<Artigo> artigosRedeSocial;
        LinkedList<Veiculo> veiculosRedeSocial;
        LinkedList<Pesquisador> pesquisadoresRedeSocial;
        
        try {
            // le pesquisadores do arquivo
            pesquisadoresRedeSocial = Pesquisador.carregarPesquisadores("entrada15\\pesquisadores.txt");
            
            // le veiculos do arquivo
            veiculosRedeSocial = Veiculo.carregarVeiculos("entrada15\\veiculos.txt");
            
            // le artigos do arquivo
            artigosRedeSocial = Artigo.carregarArtigos("entrada15\\artigos_veiculos.txt", veiculosRedeSocial);
            
            // le publicacoes de artigos pelos pesquisadores
            Pesquisador.carregarPublicacoes("entrada15\\grafo_artigos_pesquisadores.txt", pesquisadoresRedeSocial, artigosRedeSocial);
            
            // le citacoes entre os artigos
            Artigo.carregarCitacoes("entrada15\\grafo_citacoes.txt", artigosRedeSocial);
            
            // escreve popularidade dos pesquisadores
            Pesquisador.escreverPopularidades("entrada15\\popularidade_pesquisador.txt", pesquisadoresRedeSocial);
            
            // escreve fator de impacto dos veiculos
            Veiculo.escreverFatorImpactoVeiculos("entrada15\\fatorImpacto_veiculo.txt", veiculosRedeSocial);
            
            // escreve qualidade dos artigos
            Artigo.escreverQualidadeArtigos("entrada15\\pontuacao_artigo.txt", artigosRedeSocial);
        }
        catch (IOException ex) {
        	System.out.println("Erro de leitura/escrita de arquivo: \r\n" + ex.getMessage());
        }
        catch (Exception ex) {
        	System.out.println("Erro na execucao: \r\n" + ex.getMessage());
        }


    }

}
