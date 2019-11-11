package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private String tekst = "";
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		super(id, bruker, dato);
		this.tekst= tekst; 
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		super(id, bruker, dato, likes);
		this.tekst= tekst; 
	}
	
	public String getTekst() {
		
		return tekst; 
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst; 
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
		return ("TEKST\n" + super.toString() + tekst + "\n");
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
