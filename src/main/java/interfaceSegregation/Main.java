package interfaceSegregation;

public class Main {

    public static void main(String[] args) {

    FrontendDeveloper feDeveloper = new FrontendDeveloper("Ali");
    BackendDeveloper beDeveloper = new BackendDeveloper("Veli");
    FullStackDeveloper fsDeveloper = new FullStackDeveloper("Mehmet");

    feDeveloper.codingReact();
    beDeveloper.codingJava();
    fsDeveloper.codingJava();
    fsDeveloper.codingReact();

    }
}
/*
Nesneler asla ihtiyacı olmayan property/metot vs içeren interfaceleri implement etmeye zorlanmamalıdır
 */