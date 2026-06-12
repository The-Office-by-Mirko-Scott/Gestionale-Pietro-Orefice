package repository;

import java.util.HashMap;
import java.util.Map;
import model.Dipendente;

public class DipendenteService {
    private Map<String, Dipendente> persone = new HashMap<>();

    
    public void create(String matricola, Dipendente d) {
        persone.put(matricola, d);
    }

    
    public Dipendente read(String matricola) {
        return persone.get(matricola);
    }

    
    public void update(String matricola, Dipendente nuovoDipendente) {
        if (persone.containsKey(matricola)) {
            persone.replace(matricola, nuovoDipendente);
        } else {
            System.out.println("Matricola " + matricola + " non trovata. Impossibile aggiornare.");
        }
    }


    public void delete(String matricola) {
        persone.remove(matricola);
    }
}