package view;

import java.util.ArrayList;

import model.RuoloAziendale;

public class VistaRuoli {
	
	private VistaUtilita vistaUtilita;
	
	public void menuRuoli() {
		System.out.println("#### MENU RUOLI AZIENDALI ####");
		System.out.println("1) Inserisci");
		System.out.println("2) Visualizza");
		System.out.println("3) Cerca");
		System.out.println("4) Ritorna al menu principale");
		System.out.println("###############");
		System.out.println();
	}
	
	public void mascheraInserimentoRuoli(RuoloAziendale ruolo) {
		ruolo.setId(vistaUtilita.leggiIntero("ID: "));
		ruolo.setRuoloAziendale(vistaUtilita.leggiStringa("Ruolo Aziendale: "));
	}
	
	public void schedaRuoloAziendale(RuoloAziendale ruolo) {
		System.out.println("#### SCHEDA RUOLO ####");
		System.out.println("ID: " + ruolo.getId());
		System.out.println("Ruolo: " + ruolo.getRuoloAziendale());
		System.out.println("###########################");
		System.out.println();
	}
	
	public void visualizzaRuoloAziendale(ArrayList<RuoloAziendale> ruoli) {
		for (int i = 0; i < ruoli.size(); i++) {
	        schedaRuoloAziendale(ruoli.get(i));
	    }
	}
	
	public VistaRuoli (VistaUtilita vistaUtilita) {
		this.vistaUtilita = vistaUtilita;
	}

}
