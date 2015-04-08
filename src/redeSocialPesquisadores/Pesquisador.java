package redeSocialPesquisadores;

import java.util.LinkedList;

public abstract class Pesquisador {
	
	private Long idPesquisador;
	private Integer qteHorasIniciacaoCientifica;
	private Integer qteHorasEstagioDocencia;
	private LinkedList<PublicacaoArtigo> artigosPublicados; 
	
	public Long getIdPesquisador() {
		return idPesquisador;
	}
	
	public void setIdPesquisador(Long idPesquisador) {
		this.idPesquisador = idPesquisador;
	}
	
	public Integer getQteHorasIniciacaoCientifica() {
		return qteHorasIniciacaoCientifica;
	}
	
	public void setQteHorasIniciacaoCientifica(
			Integer qteHorasIniciacaoCientifica) {
		this.qteHorasIniciacaoCientifica = qteHorasIniciacaoCientifica;
	}

	public Integer getQteHorasEstagioDocencia() {
		return qteHorasEstagioDocencia;
	}

	public void setQteHorasEstagioDocencia(Integer qteHorasEstagioDocencia) {
		this.qteHorasEstagioDocencia = qteHorasEstagioDocencia;
	}
	
	public Double calcularPeso() {
		return 0.0;
	}
	
	public abstract Double calcularPopularidade();
	
	public void adicionarArtigoPublicado(Artigo a, Integer ordem) {
		return;
	}
	
	public static LinkedList<Pesquisador> carregarPesquisadores(String caminhoArquivo) {
		LinkedList<Pesquisador> listaPesquisadores = new LinkedList<Pesquisador>();
		return listaPesquisadores;
	}
	
	public static void carregarPublicacoes(String caminhoArquivo, LinkedList<Pesquisador> pesquisadores) {
		return;
	}

}
