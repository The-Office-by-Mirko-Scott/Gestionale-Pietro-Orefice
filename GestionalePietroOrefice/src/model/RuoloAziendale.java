package model;

import java.util.Objects;

public class RuoloAziendale {
	private int id;
	private String ruolo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRuoloAziendale() {
		return ruolo;
	}
	public void setRuoloAziendale(String ruolo) {
		this.ruolo = ruolo;
	}
	
	public RuoloAziendale() {}
	
	public RuoloAziendale(int id, String ruolo) {
		this.id = id;
		this.ruolo = ruolo;
	}
	
	public RuoloAziendale(RuoloAziendale ruolo) {
		this.id = ruolo.id;
		this.ruolo = ruolo.ruolo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, ruolo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RuoloAziendale other = (RuoloAziendale) obj;
		return id == other.id && Objects.equals(ruolo, other.ruolo);
	}
	
}
