package exemplul2;

public class CarOS implements OS{
    private String lastUpdate;

    public CarOS(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void printLastUpdate(){
        System.out.println("last update " + lastUpdate);
    }

    @Override
    public void update(String update) {
        System.out.println("update disponibil: " + update);
    }
}
