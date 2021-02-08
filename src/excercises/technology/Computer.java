package excercises.technology;

public class Computer {

    private boolean desktop = false;
    private String brand;
    private double memory;
    private String language;

    public Computer (boolean aDesktop, String aBrand, double aMemory, String aLanguage) {
        this.desktop = aDesktop;
        this.brand = aBrand;
        this.memory = aMemory;
        this.language = aLanguage;
    }

    public Computer (String aBrand, double aMemory, String aLanguage) {
        this.brand = aBrand;
        this.memory = aMemory;
        this.language = aLanguage;
    }

    public Computer (String aBrand) {
        this.brand = aBrand;
    }

    public boolean isDesktop() { return desktop; }

    public void setDesktop(boolean aDesktop) { this.desktop = aDesktop; }

    public String getBrand() { return brand; }

    public double getMemory() { return memory; }

    public String getLanguage() { return language; }

    public void setBrand(String aBrand) { this.brand = aBrand; }

    public void setMemory(double aMemory) { this.memory = aMemory; }

    public void setLanguage(String aLanguage) { this.language = aLanguage; }
}
