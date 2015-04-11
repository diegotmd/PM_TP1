package redeSocialPesquisadores;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        LinkedList<Artigo> artigosRedeSocial;
        LinkedList<Veiculo> veiculosRedeSocial;
        LinkedList<Pesquisador> pesquisadoresRedeSocial;
        
        // le pesquisadores do arquivo
        pesquisadoresRedeSocial = Pesquisador.carregarPesquisadores("pesquisadores.txt");
        
        // le veiculos do arquivo
        veiculosRedeSocial = Veiculo.carregarVeiculos("veiculos.txt");
        
        // le artigos do arquivo
        artigosRedeSocial = Artigo.carregarArtigos("artigos_veiculos.txt", veiculosRedeSocial);
        
        // le publicacoes de artigos pelos pesquisadores
        Pesquisador.carregarPublicacoes("grafo_artigos_pesquisadores.txt", pesquisadoresRedeSocial, artigosRedeSocial);
        
        // le citacoes entre os artigos
        Artigo.carregarCitacoes("grafo_citacoes.txt", artigosRedeSocial);
        
        // escreve popularidade dos pesquisadores
        Pesquisador.escreverPopularidades("popularidade_pesquisador.txt", pesquisadoresRedeSocial);
        
        // escreve fator de impacto dos veiculos
        Veiculo.escreverFatorImpactoVeiculos("fatorImpacto_veiculo.txt", veiculosRedeSocial);
        
        // escreve qualidade dos artigos
        Artigo.escreverQualidadeArtigos("pontuacao_artigo.txt", artigosRedeSocial);

    }

}
