package exemplul2;

import java.util.List;

public class UpdateServer {
    private String updatePackage;
    private List<OS> listObservers;

    public UpdateServer(String updatePackage, List<OS> listObservers) {
        this.updatePackage = updatePackage;
        this.listObservers = listObservers;
    }

    public void addObs(OS os){
        listObservers.add(os);
    }

    public  void delObs(OS os){
        listObservers.remove(os);
    }

    public void pushUpdate(){
        //se parcurge lista de observari si seteaza informatia pe fiecare obiect
        for (OS os : listObservers){
            os.update(updatePackage);
        }
    }
}
