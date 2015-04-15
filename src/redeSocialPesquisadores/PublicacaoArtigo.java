package redeSocialPesquisadores;

/**
 * Classe PublicacaoArtigo, representa a publicação de um artigo por um pesquisador em uma determinada ordem de participação.
 * A decisão de utilizar esta classe foi para representar em uma só entidade a publicação de um artigo e a ordem que
 * o pesquisador participou da publicação do mesmo.
 */
public class PublicacaoArtigo {
    
    private Artigo artigo;
    private Integer ordem;
    
    public Artigo getArtigo() {
    	return this.artigo;
    }
    
    public Integer getOrdem() {
    	return this.ordem;
    }

    public PublicacaoArtigo (Artigo a, Integer o) {
    	this.artigo = a;
        this.ordem = o;
    }
    
}
