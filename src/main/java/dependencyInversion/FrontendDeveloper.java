package dependencyInversion;

public class FrontendDeveloper implements Developer{

    private void reactCoding() {
        System.out.println("React Kodluyorum");
    }

    @Override
    public void doCoding() {
        reactCoding();
    }
}
