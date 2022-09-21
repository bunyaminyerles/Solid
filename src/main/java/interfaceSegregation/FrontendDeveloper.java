package interfaceSegregation;

public class FrontendDeveloper implements ReactCoder{

    private String name;

    @Override
    public void codingReact() {
        System.out.println("React Kodluyorum");
    }

    public FrontendDeveloper(String name) {
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
        return "FrontendDeveloper{" +
                "name='" + name + '\'' +
                '}';
    }
}
