package controller;

import model.TitoloStudio;
import repository.TitoloStudioService;
import view.VistaTitoliStudio;
import view.VistaUtilita;

public class ControllerTitoliStudio {

    private TitoloStudioService titoloStudioService;
    private VistaUtilita vistaUtilita;
    

    public ControllerTitoliStudio(TitoloStudioService titoloStudioService,
    		VistaUtilita vistaUtilita) 
    {
        this.titoloStudioService = titoloStudioService;
        this.vistaUtilita = vistaUtilita;
    }

    public void Avvio() {

        int scelta;
        TitoloStudio titolo;
        VistaTitoliStudio vts = new VistaTitoliStudio(vistaUtilita);

        do {
                        
            vts.menuTitoli();
            scelta = vistaUtilita.leggiIntero("Scelta:");

            switch (scelta) {

                case 1:
                    titolo = new TitoloStudio();

                    vts.mascheraInserimentoTitoli(titolo);

                    titoloStudioService.inserisciTitolo(titolo);

                    vistaUtilita.visualizzaMessaggio("Titolo inserito correttamente");
                    break;

                case 2:
                	 vts.visualizzaTitoliStudio(
                             titoloStudioService.leggiTitolo()
                     );
                    break;

                case 3:
                    int id = vistaUtilita.leggiIntero("Inserisci ID:");

                    TitoloStudio trovato = titoloStudioService.cercaPerId(id);

                    if (trovato != null) {
                        vts.schedaTitoloStudio(trovato);
                    } else {
                        vistaUtilita.visualizzaMessaggio("Titolo non trovato");
                    }
                    break;

                case 4:
                    vistaUtilita.visualizzaMessaggio("Uscita dal menu titoli di studio");
                    break;

                default:
                    vistaUtilita.visualizzaMessaggio("Scelta non valida");
            }

        } while (scelta != 4);
    }
}
