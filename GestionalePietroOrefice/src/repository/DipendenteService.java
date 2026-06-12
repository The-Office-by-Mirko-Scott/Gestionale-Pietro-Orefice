package repository;

import java.util.ArrayList;
import model.Dipendente;

public class DipendenteService {
	
	ArrayList<Dipendente> dipendenti = new ArrayList<>();
	
	public void inserisciDipendente(Dipendente dipendente) {
		dipendenti.add(dipendente);		
	}
	
	public ArrayList<Dipendente> leggi(){
		return dipendenti;
	}
	
	public Dipendente cercaPerId(int id) {
		for (Dipendente dipendente : dipendenti) {
			if (dipendente.getId()==id){
				return dipendente;				
			}			
		}
		return null;
	}

}