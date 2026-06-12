package model;

public class Dipendente extends Persona {
    public Dipendente(String nome, String cognome) {
        super(nome, cognome);
    }
    
    
    public Dipendente(Persona persona) {
        super(persona);
    }
}