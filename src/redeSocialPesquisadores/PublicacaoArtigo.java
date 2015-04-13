package redeSocialPesquisadores;

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
