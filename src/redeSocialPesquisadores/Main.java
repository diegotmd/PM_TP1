package redeSocialPesquisadores;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        LinkedList<Artigo> artigosRedeSocial;
        LinkedList<Veiculo> veiculosRedeSocial;
        LinkedList<Pesquisador> pesquisadoresRedeSocial;
        
        // lê pesquisadores do arquivo
        pesquisadoresRedeSocial = Pesquisador.carregarPesquisadores("pesquisadores.txt");
        
        // lê veículos do arquivo
        veiculosRedeSocial = Veiculo.carregarVeiculos("veiculos.txt");
        
        // lê artigos do arquivo
        artigosRedeSocial = Artigo.carregarArtigos("artigos_veiculos.txt", veiculosRedeSocial);
        
        // lê publicações de artigos pelos pesquisadores
        Pesquisador.carregarPublicacoes("grafo_artigos_pesquisadores.txt", pesquisadoresRedeSocial, artigosRedeSocial);
        
        // lê citações entre os artigos
        Artigo.carregarCitacoes("grafo_citacoes.txt", artigosRedeSocial);
        
        // escreve popularidade dos pesquisadores
        Pesquisador.escreverPopularidades("popularidade_pesquisador.txt", pesquisadoresRedeSocial);
        
        // escreve fator de impacto dos veículos
        Veiculo.escreverFatorImpactoVeiculos("fatorImpacto_veiculo.txt", veiculosRedeSocial);
        
        // escreve qualidade dos artigos
        Artigo.escreverQualidadeArtigos("pontuacao_artigo.txt", artigosRedeSocial);

    }

}
