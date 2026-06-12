package repository;

import java.util.ArrayList;
import java.util.List; 
import model.Dipendente;
import java.util.stream.Collectors;

public class DipendenteService {

    ArrayList<Dipendente> dipendenti = new ArrayList<>();

    public void inserisciDipendente(Dipendente dipendente) {
        dipendenti.add(dipendente);
    }

    public List<Dipendente> leggi(){
        return dipendenti;
    }
    
    // Ricerca
    public Dipendente cercaPerId(int id) {
        for (Dipendente dipendente : dipendenti) {
            if(dipendente.getId() == id) {
                return dipendente;
            }
        }
        return null;
    }

    // Eliminazione
    public boolean eliminaDipendente(int id) {
        Dipendente trovato = cercaPerId(id);
        if (trovato != null) {
            dipendenti.remove(trovato);
            return true; 
        }
        return false; // Dipendente non trovato
    }
    
    // Modifica 
    public boolean modificaDipendente(int idVecchio, Dipendente dipendenteModificato) {
        Dipendente vecchio = cercaPerId(idVecchio);
        if (vecchio != null) {
            int indice = dipendenti.indexOf(vecchio); // Trova la posizione (indice)
            
            dipendenti.set(indice, dipendenteModificato); // Sostituisce
            return true;
        }
        return false; // Vecchio dipendente non trovato
    }
    
 // Ricerca per Nome
    public List<Dipendente> cercaPerNome(String nomeDaCercare) {
        return dipendenti.stream()
                .filter(d -> d.getNome().equalsIgnoreCase(nomeDaCercare))
                .collect(Collectors.toList());
    }

    // Ricerca per Cognome
    public List<Dipendente> cercaPerCognome(String cognomeDaCercare) {
        return dipendenti.stream()
                .filter(d -> d.getCognome().equalsIgnoreCase(cognomeDaCercare))
                .collect(Collectors.toList());

}
}
