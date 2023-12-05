package ES3;

import ES3.entities.Rubrica;

public class Es3 {
    public static void main(String[] args) {
        Rubrica.addContact("Marco", 321578755);
        Rubrica.addContact("Franco", 328545855);
        Rubrica.addContact("Ajeje", 339548555);

        Rubrica.removeContact("Marco");
        Rubrica.removeContactByNameMethod2("Franco");

        Rubrica.findPhoneNumberByName("Ajeje");

        Rubrica.findNameByAPhoneNumber(339548555);
        System.out.println("*************");
        Rubrica.findNameByAPhoneNumberMethodTwo(339548555);

        System.out.println("L'elenco di tutte le persone salvate :" + Rubrica.getRubrica());
    }

}
