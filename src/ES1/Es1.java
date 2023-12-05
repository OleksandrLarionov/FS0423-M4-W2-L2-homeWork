package ES1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
    public static void main(String[] args) {
        Set<String> parole = new HashSet<>();
        ArrayList<String> doppioni = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero positivo");
        int numeroIntero = Integer.parseInt(scanner.next());

        for (int i = 0; i < numeroIntero; i++) {

            System.out.println("Inserisci adesso " + " " + (numeroIntero - i) + " " + "di parole");
            String parolaInserita = scanner.next();

            if (!parole.add(parolaInserita)) {
                doppioni.add(parolaInserita);
            }
        }
//        ***************stampo il numero di parole distinte (poiche sono in un set lo sono già)****************
        System.out.println("**********il numero di parole distinete è :" + parole.size());

        System.out.println("**********le parole distinete sono :" + parole);
//        ***************stampo i doppioni******************************
        System.out.println("le parole uguali inserite sono :" + doppioni.size() + " " + doppioni);

        scanner.close();
    }

}
