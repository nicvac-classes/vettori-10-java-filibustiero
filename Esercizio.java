import java.util.Scanner;

public class EsameStudenti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti studenti vuoi inserire? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomi = new String[n];
        int[] votazioni = new int[n];
        int[] crediti = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il nome dello studente " + (i + 1) + ": ");
            nomi[i] = scanner.nextLine();
            System.out.print("Inserisci la votazione di " + nomi[i] + ": ");
            votazioni[i] = scanner.nextInt();
            System.out.print("Inserisci i crediti formativi di " + nomi[i] + ": ");
            crediti[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int somma = 0;
        for (int voto : votazioni) {
            somma += voto;
        }
        double media = (double) somma / n;

        System.out.println("Studenti con votazione superiore alla media e almeno 6 crediti:");
        for (int i = 0; i < n; i++) {
            if (votazioni[i] > media && crediti[i] >= 6) {
                System.out.println(nomi[i]);
            }
        }

        scanner.close();
    }
}
