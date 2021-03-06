package cruzeirao.models;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {
	private long numeroInscricao;
	private boolean pagamento, inscricaoValida;
	private Inscrito tecnico, auxiliar, preparadorFisico, massagista;
	private Categoria categoria;
	private Equipe equipe;
	private List<Inscrito> jogadores = new ArrayList<Inscrito>();
	private List<Inscrito> suspensoProximaPartida = new ArrayList<Inscrito>();
	private List<Partida> partidas = new ArrayList<Partida>();
	
	public long getNumeroInscricao() {
		return numeroInscricao;
	}
	public void setNumeroInscricao(long numeroInscricao) {
		this.numeroInscricao = numeroInscricao;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isInscricaoValida() {
		return inscricaoValida;
	}
	public void setInscricaoValida(boolean inscricaoValida) {
		this.inscricaoValida = inscricaoValida;
	}
	public Inscrito getTecnico() {
		return tecnico;
	}
	public void setTecnico(Inscrito tecnico) {
		this.tecnico = tecnico;
	}
	public Inscrito getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Inscrito auxiliar) {
		this.auxiliar = auxiliar;
	}
	public Inscrito getPreparadorFisico() {
		return preparadorFisico;
	}
	public void setPreparadorFisico(Inscrito preparadorFisico) {
		this.preparadorFisico = preparadorFisico;
	}
	public Inscrito getMassagista() {
		return massagista;
	}
	public void setMassagista(Inscrito massagista) {
		this.massagista = massagista;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public List<Inscrito> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Inscrito> jogadores) {
		this.jogadores = jogadores;
	}
	public List<Inscrito> getSuspensoProximaPartida() {
		return suspensoProximaPartida;
	}
	public void setSuspensoProximaPartida(List<Inscrito> suspensoProximaPartida) {
		this.suspensoProximaPartida = suspensoProximaPartida;
	}
	public List<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
	
}
