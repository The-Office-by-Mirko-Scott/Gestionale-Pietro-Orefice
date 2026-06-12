import java.util.Scanner;
// Importa i modelli se si trovano in un altro package (es. model.Dipendente)
import model.Persona;
import model.Dipendente;
import repository.DipendenteService;

public class Main {
    public static void main(String[] args) {
        DipendenteService db = new DipendenteService();
        Scanner scanner = new Scanner(System.in);
        
        boolean inEsecuzione = true;

        while (inEsecuzione) {
            System.out.println("\n=== MENU CRUD DIPENDENTI ===");
            System.out.println("1. Inserisci Dipendente (Create)");
            System.out.println("2. Cerca per Matricola (Read)");
            System.out.println("3. Aggiorna Dipendente (Update)");
            System.out.println("4. Elimina Dipendente (Delete)");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");
            
            int scelta = scanner.nextInt();
            scanner.nextLine(); 

            switch (scelta) {
            
            
                case 1: // CREATE
                    System.out.print("Inserisci la matricola (es. MAT001): ");
                    String matCreate = scanner.nextLine();
                    
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Inserisci il cognome: ");
                    String cognome = scanner.nextLine();
                    
                    Dipendente nuovo = new Dipendente(nome, cognome);
                    db.create(matCreate, nuovo);
                    System.out.println("Dipendente inserito con successo!");
                    break;

                    
                case 2: // READ
                    System.out.print("Inserisci la matricola da cercare: ");
                    String matRead = scanner.nextLine();
                    
                    Dipendente cercato = db.read(matRead);
                    if (cercato != null) {
                        System.out.println("Risultato: " + cercato);
                    } else {
                        System.out.println("Nessun dipendente trovato con la matricola " + matRead);
                    }
                    break;

                    
                case 3: // UPDATE
                    System.out.print("Inserisci la matricola del dipendente da modificare: ");
                    String matUpdate = scanner.nextLine();
                    
                    Dipendente daModificare = db.read(matUpdate);
                    if (daModificare != null) {
                        Dipendente copia = new Dipendente(daModificare);
                        
                        System.out.print("Inserisci il nuovo nome (attuale: " + copia.getNome() + "): ");
                        String nuovoNome = scanner.nextLine();
                        copia.setNome(nuovoNome);
                        
                        db.update(matUpdate, copia);
                        System.out.println("Dati aggiornati con successo!");
                    } else {
                        System.out.println("Matricola non trovata.");
                    }
                    break;
                    

                case 4: // DELETE
                    System.out.print("Inserisci la matricola da eliminare: ");
                    String matDelete = scanner.nextLine();
                    
                    if (db.read(matDelete) != null) {
                        db.delete(matDelete);
                        System.out.println("Dipendente rimosso con successo.");
                    } else {
                        System.out.println("Impossibile eliminare: matricola non trovata.");
                    }
                    break;

                    
                case 5: // EXIT
                    inEsecuzione = false;
                    System.out.println("Chiusura del programma. Arrivederci!");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }
        
        scanner.close();
    }
}