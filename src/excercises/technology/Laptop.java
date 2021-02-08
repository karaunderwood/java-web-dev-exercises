package excercises.technology;

public class Laptop extends Computer{

    private int screenSize;
    private int numOfPorts;

    public Laptop(String aBrand, double aMemory, String aLanguage, int aScreenSize, int aNumOfPorts) {
        super(aBrand, aMemory, aLanguage);
        this.screenSize = aScreenSize;
        this.numOfPorts = aNumOfPorts;
    }

    public Laptop(String aBrand, int aScreenSize, int aNumOfPorts) {
        super(aBrand);
        this.screenSize = aScreenSize;
        this.numOfPorts = aNumOfPorts;
    }

    public int getScreenSize() {
        return screenSize;
    }
}
