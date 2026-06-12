package model;

public class Persona {
    private String nome;
    private String cognome;

    
    // Costruttore standard
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    
    // Costruttore di copia
    public Persona(Persona altra) {
        this.nome = altra.nome;
        this.cognome = altra.cognome;
    }

    
    // Getter e Setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    
    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}

