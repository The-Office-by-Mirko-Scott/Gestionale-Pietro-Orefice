package controller;
import model.Dipendente;
import repository.DipendenteService;
import repository.RuoloService;
import repository.TitoloStudioService;
import view.VistaDipendenti;
import view.VistaUtilita;

public class ControllerDipendenti {

    private DipendenteService dipendenteService;
    private TitoloStudioService titoloStudioService;
    private RuoloService ruoloService;
    private VistaDipendenti vistaDipendenti;
    private VistaUtilita vistaUtilita;

    
    
    public ControllerDipendenti(
            DipendenteService dipendenteService,
            TitoloStudioService titoloStudioService,
            RuoloService ruoloService,
            VistaUtilita vistaUtilita) {

        this.dipendenteService = dipendenteService;
        this.titoloStudioService = titoloStudioService;
        this.ruoloService = ruoloService;
        this.vistaUtilita = vistaUtilita;
    }
    
    public void Avvio() {

        int scelta;
        Dipendente dipendente;
        vistaDipendenti = new VistaDipendenti();

        do {
            vistaDipendenti.menuDipendenti();
            scelta = vistaUtilita.leggiIntero("Scelta:");

            switch (scelta) {

            case 1:
            	
            	if (titoloStudioService.leggiTitolo().isEmpty()) {
                    vistaUtilita.visualizzaMessaggio(
                        "Nessun titolo di studio registrato. Inserire prima almeno un titolo di studio."
                    );
                    break;
                }

                if (ruoloService.leggiRuolo().isEmpty()) {
                    vistaUtilita.visualizzaMessaggio(
                        "Nessun ruolo registrato. Inserire prima almeno un ruolo."
                    );
                    break;
                }
            	
                dipendente = new Dipendente();

                vistaDipendenti.mascheraInserimento(
                        vistaUtilita,
                        titoloStudioService.leggiTitolo(),
                        ruoloService.leggiRuolo(),
                        dipendente);

                dipendenteService.inserisciDipendente(dipendente);

                vistaUtilita.visualizzaMessaggio("Dipendente inserito correttamente");
                break;

            case 2:
                vistaDipendenti.visualizzaDipendenti(
                        dipendenteService.leggi());
                break;

            case 3:
                int id = vistaUtilita.leggiIntero("Inserisci ID:");

                Dipendente trovato = dipendenteService.cercaPerId(id);

                if (trovato != null) {
                    vistaDipendenti.schedaDipendente(trovato);
                } else {
                    vistaUtilita.visualizzaMessaggio("Dipendente non trovato");
                }
                break;

            case 4:
                vistaUtilita.visualizzaMessaggio("Ritorno al menu principale");
                break;

            default:
                vistaUtilita.visualizzaMessaggio("Scelta non valida");
            }

        } while (scelta != 4);
    }
}
