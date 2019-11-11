package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {
	
	
	private String url = ""; 

	// TODO - objekt variable
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
		
		super(id, bruker, dato, tekst);
		this.url = url; 
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
		super(id, bruker, dato, likes, tekst);
		this.url = url; 
	}
	
	public String getUrl() {
		//throw new UnsupportedOperationException(TODO.method());
		return url; 
	}

	public void setUrl(String url) {
		//throw new UnsupportedOperationException(TODO.method());
		
		this.url=url; 
		
	}

	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method ());
		return (super.toString().replace("TEKST", "BILDE") + url + "\n");

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
