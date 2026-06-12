package view;
import java.util.ArrayList;
import model.*;

public class VistaDipendenti {


	public void menuDipendenti() {
		System.out.println("#### MENU DIPENDENTI ####");
		System.out.println("1) Inserisci");
		System.out.println("2) Visualizza");
		System.out.println("3) Cerca");
		System.out.println("4) Ritorna al menu principale");
		System.out.println("###############");
		System.out.println();
	}

		public void mascheraInserimento(
				VistaUtilita vistaUtilita,
				ArrayList<TitoloStudio> titoli,
				ArrayList<RuoloAziendale> ruoli,
				Dipendente dipendente) {

			dipendente.setId(vistaUtilita.leggiIntero("ID: "));
			dipendente.setNome(vistaUtilita.leggiStringa("Nome: "));
			dipendente.setCognome(vistaUtilita.leggiStringa("Cognome: "));
			dipendente.setLuogoNascita(vistaUtilita.leggiStringa("Luogo di nascita: "));
			dipendente.setDataNascita(vistaUtilita.leggiStringa("Data di nascita: "));
			dipendente.setCf(vistaUtilita.leggiStringa("Codice fiscale: "));
			dipendente.setSesso(vistaUtilita.leggiStringa("Sesso(m/f/a): "));
			dipendente.setStipendio(vistaUtilita.leggiDecimale("Stipendio: "));
			
			System.out.println("----- SCEGLI TITOLO DI STUDIO -----");
			
			for(TitoloStudio titolo:titoli) {
				System.out.println(titolo.getId()+"-"+titolo.getTitoloStudio());
			}
			
			int idTitolo = vistaUtilita.leggiIntero("Inserisci ID titolo scelto: ");
			dipendente.setIdTitolo(idTitolo);
			
			System.out.println("----- SCEGLI RUOLO AZIENDALE -----");
		
			for(RuoloAziendale ruolo:ruoli) {
				System.out.println(ruolo.getId()+"-"+ruolo.getRuoloAziendale());
			}
			
			int idRuolo = vistaUtilita.leggiIntero("Inserisci ID ruolo scelto: ");
			dipendente.setIdRuolo(idRuolo);
			
			}
		

			public void schedaDipendente(Dipendente dipendente) {
				System.out.println("#### SCHEDA DIPENDENTE ####");
				System.out.println("ID: " + dipendente.getId());
				System.out.println("Nome: " + dipendente.getNome());
				System.out.println("Cognome: " + dipendente.getCognome());
				System.out.println("Luogo di nascita: " + dipendente.getLuogoNascita());
				System.out.println("Data di nascita: " + dipendente.getDataNascita());
				System.out.println("Codice fiscale: " + dipendente.getCf());
				System.out.println("Sesso: " + dipendente.getSesso());
				System.out.println("Stipendio: " + dipendente.getStipendio());
				System.out.println("Titolo di studio: " + dipendente.getIdTitolo());
				System.out.println("Ruolo Aziendale: " + dipendente.getIdRuolo());
				System.out.println("###########################");	
				System.out.println();
			}
			
			public void visualizzaDipendenti(ArrayList<Dipendente> dipendenti) {
				for (int i = 0; i < dipendenti.size(); i++) {
			        schedaDipendente(dipendenti.get(i));
			    }
			}
		}
