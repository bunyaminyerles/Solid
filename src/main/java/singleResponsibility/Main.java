package singleResponsibility;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact("05555555555","a@a.com");
        Employee employee = new Employee("Bünyamin", "Yerleş",contact);

        System.out.println(employee);
        contact.setEmail("b@b.com");
        System.out.println(employee);

    }
}
/*

Single Responsibility, sınıflarımızın tek bir sorumluluğu olması prensibidir. Değiştirmek istediğimiz özelliği sorumlu
olan sınıf aracılığıyla değiştirmemiz bu prensibe uygundur.

 */