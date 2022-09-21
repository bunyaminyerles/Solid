package dependencyInversion;

public class BackendDeveloper implements Developer{

    private void javaCoding() {
        System.out.println("java Kodluyorum");
    }

    @Override
    public void doCoding() {
        javaCoding();
    }
}
