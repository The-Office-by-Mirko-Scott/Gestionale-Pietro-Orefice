package controller;

import model.RuoloAziendale;
import repository.RuoloService;
import view.VistaUtilita;
import view.VistaRuoli;

public class ControllerRuoli {

    private RuoloService ruoloService;
    private VistaUtilita vistaUtilita;

    public ControllerRuoli(RuoloService ruoloService, 
    		VistaUtilita vistaUtilita) 
    {
        this.ruoloService = ruoloService;
        this.vistaUtilita = vistaUtilita;
    }

    public void Avvio() {

        int scelta;
        RuoloAziendale ruolo;
        VistaRuoli vr = new VistaRuoli(vistaUtilita);

        do {
            vr.menuRuoli();

            scelta = vistaUtilita.leggiIntero("Scelta:");

            switch (scelta) {

                case 1:
                    ruolo = new RuoloAziendale();
                    
                    vr.mascheraInserimentoRuoli(ruolo);

                    ruoloService.inserisciRuolo(ruolo);

                    vistaUtilita.visualizzaMessaggio("Ruolo inserito correttamente");
                    break;

                case 2:
                	vr.visualizzaRuoloAziendale(
                            ruoloService.leggiRuolo()
                    );
                    break;

                case 3:
                    int id = vistaUtilita.leggiIntero("Inserisci ID:");

                    RuoloAziendale trovato = ruoloService.cercaPerId(id);

                    if (trovato != null) {
                        vr.schedaRuoloAziendale(trovato);
                    } else {
                        vistaUtilita.visualizzaMessaggio("Ruolo non trovato");
                    }
                    break;

                case 4:
                    vistaUtilita.visualizzaMessaggio("Uscita dal menu ruoli");
                    break;

                default:
                    vistaUtilita.visualizzaMessaggio("Scelta non valida");
            }

        } while (scelta != 4);
    }
}
