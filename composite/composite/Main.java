package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAngajat> listaSubordonati = new ArrayList<>();


        Angajat angajat1 = new Angajat("Aurel", 1, 1200D, null);
        Angajat angajat2 = new Angajat("Paul", 2, 1200D, null);
        Angajat angajat3 = new Angajat("Daniel", 3, 1200D, null);
        listaSubordonati.add(angajat1);
        listaSubordonati.add(angajat2);
        listaSubordonati.add(angajat3);

        Angajat manager = new Angajat("Aurel", 1, 1200D, listaSubordonati);

        manager.printDetalii();
    }
}
