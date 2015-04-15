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
            pesquisadoresRedeSocial = Pesquisador.carregarPesquisadores(args[0]);
            
            // le veiculos do arquivo
            veiculosRedeSocial = Veiculo.carregarVeiculos(args[1]);
            
            // le artigos do arquivo
            artigosRedeSocial = Artigo.carregarArtigos(args[2], veiculosRedeSocial);
            
            // le publicacoes de artigos pelos pesquisadores
            Pesquisador.carregarPublicacoes(args[3], pesquisadoresRedeSocial, artigosRedeSocial);
            
            // le citacoes entre os artigos
            Artigo.carregarCitacoes(args[4], artigosRedeSocial);
            
            // escreve popularidade dos pesquisadores
            Pesquisador.escreverPopularidades(args[5], pesquisadoresRedeSocial);
            
            // escreve fator de impacto dos veiculos
            Veiculo.escreverFatorImpactoVeiculos(args[6], veiculosRedeSocial);
            
            // escreve qualidade dos artigos
            Artigo.escreverQualidadeArtigos(args[7], artigosRedeSocial);
        }
        catch (IOException ex) {
        	System.out.println("Erro de leitura/escrita de arquivo: \r\n" + ex.getMessage());
        }
        catch (Exception ex) {
        	System.out.println("Erro na execucao: \r\n" + ex.getMessage());
        }


    }

}
