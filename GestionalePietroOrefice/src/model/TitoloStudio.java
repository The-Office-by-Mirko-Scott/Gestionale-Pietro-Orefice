package model;

import java.util.Objects;

public class TitoloStudio {
	private int id;
	private String titolo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitoloStudio() {
		return titolo;
	}
	public void setTitoloStudio(String titolo) {
		this.titolo = titolo;
	}
	
	public TitoloStudio() {}
	
	public TitoloStudio(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}
	
	public TitoloStudio(TitoloStudio titolo) {
		this.id = titolo.id;
		this.titolo = titolo.titolo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, titolo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TitoloStudio other = (TitoloStudio) obj;
		return id == other.id && Objects.equals(titolo, other.titolo);
	}
		
}
