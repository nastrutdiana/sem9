package composite;

import java.util.List;

public class Angajat implements IAngajat {
    private String nume;
    private int codAngajat;
    private double salariu;
    List<IAngajat> listasubordonati; //is a si has a -> detaliu design pattern

    @Override
    public void printDetalii() {
        System.out.println(nume + codAngajat + salariu);
        if(listasubordonati != null) {
            for(IAngajat iAngajat : listasubordonati) {
                //printDetalii(iAngajat);
                System.out.println(iAngajat);
            }
        }

    }

    public Angajat(String nume, int codAngajat, double salariu, List<IAngajat> listasubordonati) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.listasubordonati = listasubordonati;
    }

    public void addAngajatIntoList(List<IAngajat> listasubordonati, IAngajat angajat) {
        listasubordonati.add(angajat);
        //return listasubordonati;
    }

    public void deleteAngajatFromList(List<IAngajat> listasubordonati, IAngajat angajat) {
        listasubordonati.remove(angajat);
        //return listasubordonati;
    }

    //adauga subordonat lista
    //stergere subordonat lista
}
