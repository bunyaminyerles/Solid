package interfaceSegregation;

public class BackendDeveloper implements JavaCoder{

    private String name;

    @Override
    public void codingJava() {
        System.out.println("Java Kodluyorum");
    }

    public BackendDeveloper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BackendDeveloper{" +
                "name='" + name + '\'' +
                '}';
    }
}
