package controller;

import repository.DipendenteService;
import repository.RuoloService;
import repository.TitoloStudioService;
import view.VistaUtilita;
class Avvio {

	public static void main(String[] args) {
		DipendenteService dipendenteService = new DipendenteService();
		TitoloStudioService titoloStudioService = new TitoloStudioService();
		RuoloService ruoloService = new RuoloService();
		// I service li dichiariamo all'inizio perché sono i repository
		
		VistaUtilita vistaUtilita = new VistaUtilita();
		
		ControllerDipendenti controllerDipendenti = new ControllerDipendenti(dipendenteService, titoloStudioService, ruoloService, vistaUtilita);
		ControllerRuoli controllerRuoli = new ControllerRuoli(ruoloService, vistaUtilita);
        ControllerTitoliStudio controllerTitoliStudio = new ControllerTitoliStudio(titoloStudioService, vistaUtilita);
        
        
        int scelta;

        do {
            vistaUtilita.menuPrincipale();
            scelta = vistaUtilita.leggiIntero("Scegli:");

            switch (scelta) {

                case 1:
                    controllerDipendenti.Avvio();
                    break;

                case 2:
                    controllerRuoli.Avvio();
                    break;

                case 3:
                    controllerTitoliStudio.Avvio();
                    break;

                case 4:
                    vistaUtilita.visualizzaMessaggio("Esci");
                    break;

                default:
                    vistaUtilita.visualizzaMessaggio("Scelta non valida");
            }

        } while (scelta != 4);
    }

}
