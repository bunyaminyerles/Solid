package interfaceSegregation;

public class FullStackDeveloper implements ReactCoder,JavaCoder {

    private String name;

    @Override
    public void codingJava() {
        System.out.println("Java Kodluyorum");
    }

    @Override
    public void codingReact() {
        System.out.println("React Kodluyorum");
    }

    public FullStackDeveloper(String name) {
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
        return "FullStackDeveloper{" +
                "name='" + name + '\'' +
                '}';
    }
}
