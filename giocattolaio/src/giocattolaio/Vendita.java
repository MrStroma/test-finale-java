package giocattolaio;

import java.util.List;

public class Vendita {
	
	
	private Long id;
	
	private List<Giocattolo> giocattolo;
	
	private List<Cliente> clienti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Giocattolo> getGiocattolo() {
		return giocattolo;
	}

	public void setGiocattolo(List<Giocattolo> giocattolo) {
		this.giocattolo = giocattolo;
	}

	public List<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(List<Cliente> clienti) {
		this.clienti = clienti;
	}
	
	
}
