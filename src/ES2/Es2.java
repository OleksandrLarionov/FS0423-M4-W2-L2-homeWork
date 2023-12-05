package ES2;

import java.util.*;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserosci quanti numeri casuali generare:");
        int numeroN = Integer.parseInt(scanner.nextLine());

//        ******************Salvo il mio array di numeri atrimenti nella nuova lista si creano altri numeri random*********
        List<Integer> salvoLaListaDiNumeriCasuali = numeriCasuali(numeroN);
        System.out.println(salvoLaListaDiNumeriCasuali);

        System.out.println(nuovaLista(salvoLaListaDiNumeriCasuali));
//        System.out.println(nuovaLista(numeriCasuali(numeroN)));


//        ************Terzo metodo *****************
        System.out.println("*************Stampo i valori delle posizioni pari**************");
        pariDispari(salvoLaListaDiNumeriCasuali, true);

        scanner.close();
    }

    public static List<Integer> numeriCasuali(int quntiNumeriCasuali) {
        Random rndm = new Random();

        List<Integer> arrayDiNimueriCasuali = new ArrayList<>();
        for (int i = 0; i < quntiNumeriCasuali; i++) {
            arrayDiNimueriCasuali.add(rndm.nextInt(1, 100));
        }
//        ****************Collection.sort mi riordina la mia lista**************
        Collections.sort(arrayDiNimueriCasuali);
        return arrayDiNimueriCasuali;
    }

    public static List<Integer> nuovaLista(List<Integer> oldList) {
        List<Integer> nuovaLista = new ArrayList<>(oldList);
        List<Integer> listaInvertita = new ArrayList<>(oldList);
        Collections.reverse(listaInvertita);

        nuovaLista.addAll(listaInvertita);

        return nuovaLista;
    }

    public static void pariDispari(List<Integer> list, boolean trueFalce) {
        if (trueFalce) {
            System.out.println("pari:");
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("dispari:");
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        }
    }
}
