package redeSocialPesquisadores;

import java.util.LinkedList;

public abstract class Veiculo {

	private Long idVeiculo;
	private LinkedList<Artigo> artigosPublicados;
	
	public abstract Double calcularFatorImpacto();
	
	public static LinkedList<Veiculo> carregarVeiculos(String caminhoArquivo){
		LinkedList<Veiculo> veiculos= new LinkedList<Veiculo>(); 
		return veiculos;
	}
}
