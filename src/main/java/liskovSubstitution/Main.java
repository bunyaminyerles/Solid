package liskovSubstitution;

public class Main {

    public static void main(String[] args) {
        Engineer engineer = new Engineer("Bünyamin", "Yerleş", 200);
        Intern intern = new Intern("Ahmet", "Koç", 250);

        System.out.println(TotalSalary.TotalSalary(engineer));
        System.out.println((engineer.getDepartment()+ " " + intern.getDepartment()));
    }
}

/*
Alt seviye sınıflardan oluşan nesnelerin/sınıfların, ana(üst) sınıfın nesneleri ile yer değiştirdikleri zaman, aynı
 davranışı sergilemesi gerekmektedir. Türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanabilmelidir.
 */
