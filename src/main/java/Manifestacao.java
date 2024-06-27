package main.java;

public class Manifestacao {
	private int codigo;
	private String nome;
	private String descricao;
	private TipoManifestacao tipo;
	
	public Manifestacao() {
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int novoCodigo) {
		this.codigo = novoCodigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String novaDescricao) {
		this.descricao = novaDescricao;
	}
	public TipoManifestacao getTipo () {
		return tipo;
	}
	public void setTipo(TipoManifestacao novoTipo) {
		this.tipo = novoTipo;
	}

	@Override
	public String toString() {
		return "Manifestacao [codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", tipo=" + tipo
				+ "]";
	}
	
	
}
