package dependencyInversion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new FrontendDeveloper();
        Developer developer2 = new BackendDeveloper();

        List<Developer> developers = Arrays.asList(developer1,developer2);

        Employee employee = new Employee(developers);
        employee.doCoding();
    }
}

/*
Bir sınıfın, metodun ya da özelliğin, onu kullanan diğer sınıflara karşı olan bağımlılığı
en aza indirgenmelidir. Bir alt sınıfta yapılan değişiklikler üst sınıfları etkilememelidir.
Üst Seviye Sınıflar -> Soyutlama Katmanı -> Düşük Seviye Sınıfları
 */