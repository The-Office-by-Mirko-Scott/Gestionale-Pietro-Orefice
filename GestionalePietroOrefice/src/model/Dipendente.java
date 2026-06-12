package model;

import java.util.Objects;

public class Dipendente {
	private int id;
	private String nome;
	private String cognome;
	private String luogoNascita;
	private String dataNascita;
	private String cf;
	private String sesso;	
	private double stipendio;
	private int idTitolo;
	private int idRuolo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public int getIdTitolo() {
		return idTitolo;
	}
	public void setIdTitolo(int idTitolo) {
		this.idTitolo = idTitolo;
	}
	public int getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}
	
	
	
	@Override
	public String toString() {
		return id + ";" + nome + ";" + cognome + ";" + luogoNascita
				+ ";" + dataNascita + ";" + cf + ";" + sesso + ";" + stipendio
				+ ";" + idTitolo + ";" + idRuolo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cf, cognome, dataNascita, id, idRuolo, idTitolo, luogoNascita, nome, sesso, stipendio);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		return Objects.equals(cf, other.cf) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(dataNascita, other.dataNascita) && id == other.id && idRuolo == other.idRuolo
				&& idTitolo == other.idTitolo && Objects.equals(luogoNascita, other.luogoNascita)
				&& Objects.equals(nome, other.nome) && Objects.equals(sesso, other.sesso)
				&& Double.doubleToLongBits(stipendio) == Double.doubleToLongBits(other.stipendio);
	}
	public Dipendente() {} 
	// Costruttore base. 
	//E' l'unico metodo che ha lo stesso nome della classe e non è indicato il tipo restituito.	
	
	
	public Dipendente(int id, String nome, String cognome, String luogoNascita, String dataNascita, String cf,
			String sesso, double stipendio, int idTitolo, int idRuolo) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.dataNascita = dataNascita;
		this.cf = cf;
		this.sesso = sesso;
		this.stipendio = stipendio;
		this.idTitolo = idTitolo;
		this.idRuolo = idRuolo;
	}// Costruttore parametrizzato che crea oggetti già popolati
	
	
	//public Dipendente (Dipendente dipendente) {
		//this.id = dipendente.id;
		//this.nome = dipendente.nome;
		//this.cognome = dipendente.cognome;
		//this.luogoNascita = dipendente.luogoNascita;
		//this.dataNascita = dipendente.dataNascita;
		//this.cf = dipendente.cf;
		//this.sesso = dipendente.sesso;
		//this.stipendio = dipendente.stipendio;
		//this.idTitolo = dipendente.idTitolo;
		//this.idRuolo = dipendente.idRuolo;
	}// Costruttore copia
	