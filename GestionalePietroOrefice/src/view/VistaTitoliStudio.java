package view;

import java.util.ArrayList;

import model.TitoloStudio;

public class VistaTitoliStudio {
	private VistaUtilita vistaUtilita;
	
	public void menuTitoli() {
		System.out.println("#### MENU TITOLI DI STUDIO ####");
		System.out.println("1) Inserisci");
		System.out.println("2) Visualizza");
		System.out.println("3) Cerca");
		System.out.println("4) Ritorna al menu principale");
		System.out.println("###############");
		System.out.println();
	}
	
	public void mascheraInserimentoTitoli(TitoloStudio titolo) {
		titolo.setId(vistaUtilita.leggiIntero("ID: "));
		titolo.setTitoloStudio(vistaUtilita.leggiStringa("Titolo di Studio: "));
	}
	
	public void schedaTitoloStudio(TitoloStudio titolo) {
		System.out.println("#### SCHEDA TITOLO ####");
		System.out.println("ID: " + titolo.getId());
		System.out.println("Ruolo: " + titolo.getTitoloStudio());
		System.out.println("###########################");
		System.out.println();
	}
	
	public void visualizzaTitoliStudio(ArrayList<TitoloStudio> titoli) {
		for (int i = 0; i < titoli.size(); i++) {
	        schedaTitoloStudio(titoli.get(i));
	        }
	}
	
	public VistaTitoliStudio(VistaUtilita vistaUtilita) {
		this.vistaUtilita = vistaUtilita;
	}
}
