public abstract class Animal {

    public String name;
    private String family;

    public Animal(String name, String family) {
        this.name = name;
        this.family = family;
    }

    abstract void sound();

    public String getFamily() {
        return family;
    }

    public void setFamily(String family){
        this.family = family;
    }
}
