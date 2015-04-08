package redeSocialPesquisadores;

import java.util.LinkedList;

public class Artigo {

	private Long idArtigo;
	private Veiculo veiculoPublicado;
	private LinkedList<Artigo> citadoPorArtigos;
	
	public Long getIdArtigo() {
		return idArtigo;
	}

	public void setIdArtigo(Long idArtigo) {
		this.idArtigo = idArtigo;
	}

	public Veiculo getVeiculoPublicado() {
		return veiculoPublicado;
	}

	public void setVeiculoPublicado(Veiculo veiculoPublicado) {
		this.veiculoPublicado = veiculoPublicado;
	}
	
	public Double calcularQualidade(){
		return 0.0;
	}
	
	public void adicionarCitacao(Artigo artigo){
		return;
	}
	
	public static LinkedList<Artigo> carregarArtigos(String caminhoArquivo){
		LinkedList<Artigo> artigos = new LinkedList<Artigo>(); 
		return artigos;
	}
	
	public static void carregarCitacoes(String caminhoArquivo, LinkedList<Artigo> artigos){
		return;
	}
	
}
