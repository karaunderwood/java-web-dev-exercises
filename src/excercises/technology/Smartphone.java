package excercises.technology;

public class Smartphone extends Computer{

    private int screenSize;
    private String cameraType;

    public Smartphone(String aBrand, double aMemory, String aLanguage, int aScreenSize, String aCameraType) {
        super(aBrand, aMemory, aLanguage);
        this.screenSize = aScreenSize;
        this.cameraType = aCameraType;
    }

    public Smartphone(String aBrand, int aScreenSize) {
        super(aBrand);
        this.screenSize = aScreenSize;
    }

    public String getCameraType() {
        return cameraType;
    }

}
