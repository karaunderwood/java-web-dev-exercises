package excercises.technology;

public abstract class AbstractEntity extends Computer {

    public AbstractEntity(boolean aDesktop, String aBrand, double aMemory, String aLanguage) {
        super(aDesktop, aBrand, aMemory, aLanguage);
    }

    public AbstractEntity(String aBrand, double aMemory, String aLanguage) {
        super(aBrand, aMemory, aLanguage);
    }

    public AbstractEntity(String aBrand) {
        super(aBrand);
    }
}
