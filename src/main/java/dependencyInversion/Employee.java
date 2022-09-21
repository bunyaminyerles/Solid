package dependencyInversion;

import java.util.List;

public class Employee {

    private List<Developer> developers;

    public Employee(List<Developer> developers) {
        this.developers = developers;
    }

    public void doCoding() {
        for (Developer developer: developers){
            developer.doCoding();
        }
    }
}
