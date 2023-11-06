package giocattolaio;

import java.util.List;
import java.util.Scanner;

public abstract class RegistroVendite {
	
	Scanner scannerInt = new Scanner(System.in);
	Scanner scannerLine = new Scanner(System.in);
	
	public void acquistaGioco(Cliente cliente, List<Giocattolo> giochiDisponibili, List<Giocattolo> acquisto) {
		System.out.println("inserisci id del gioco che vuoi acquistare");
		Long id = scannerInt.nextLong();
		
		for(Giocattolo giocattolo: giochiDisponibili) {
			if(giocattolo.getId() == id) {
				acquisto.add(giocattolo);
			}
		}
		
	}
}
