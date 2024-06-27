package main.java;

public class Reclamacao extends Manifestacao {
	
	@Override
	public TipoManifestacao getTipo() {
		return TipoManifestacao.RECLAMACAO;
	}

}
