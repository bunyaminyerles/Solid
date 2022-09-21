package openClose;


public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Bünyamin", "Yerleş", 200);
        Manager manager = new Manager("Ali", "Koç", 180);

        System.out.println(TotalSalary.TotalSalary(engineer,manager));
    }
}

/*

Open Sınıf için yeni davranışlar eklenebilmesini sağlar. Gereksinimler değiştiğinde, yeni gereksinimlerin
karşılanabilmesi için bir sınıfa yeni veya farklı davranışlar eklenebilir olmasıdır. Closed Bir sınıf temel
özelliklerinin değişimi ise mümkün olmamalıdır.

 */