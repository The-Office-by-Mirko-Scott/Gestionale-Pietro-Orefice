package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import model.Dipendente;

public class DipendenteService {

    private Map<Integer, Dipendente> persone = new HashMap<>();

    public void inserisciDipendente(Dipendente p) {
        persone.put(p.getId(), p);
    }

    public List<Dipendente> leggi(){
        return persone.values().stream().collect(Collectors.toList());
    }
    
    // ID (Cerca per matricola)
    public Dipendente cercaPerId(int id) {
        Dipendente p = persone.get(id); 
        return p;
    }

    // Eliminazione
    public boolean eliminaDipendente(int id) {
        if (persone.containsKey(id)) {
            persone.remove(id);
            return true;
        }
        return false;
    }
    
    // Modifica 
    public boolean modificaDipendente(int idVecchio, Dipendente dipendenteModificato) {
        if (persone.containsKey(idVecchio)) {
            persone.put(idVecchio, dipendenteModificato);
            return true;
        }
        return false;
    }
    
    // Ricerca per Nome
    public List<Dipendente> cercaPerNome(String nomeDaCercare) {
        return persone.values().stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nomeDaCercare)) // Usiamo 'p' nel filtro
                .collect(Collectors.toList());
    }

    // Ricerca per Cognome
    public List<Dipendente> cercaPerCognome(String cognomeDaCercare) {
        return persone.values().stream()
                .filter(p -> p.getCognome().equalsIgnoreCase(cognomeDaCercare)) // Usiamo 'p' nel filtro
                .collect(Collectors.toList());
    }
}
