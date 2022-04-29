package exemplul2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String update = "random";
        List<OS> lista = new ArrayList<>();

        UpdateServer us = new UpdateServer(update,lista);
        us.addObs(new CarOS("aaa"));
        us.addObs(new CarOS("bbb"));

        CarOS car = new CarOS("ccc");
        car.printLastUpdate();
        car.update("ddd");

    }
}
