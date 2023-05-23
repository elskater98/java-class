import java.util.Objects;

public class Cake {
    private static int stock = 10;
    private boolean hasSugar;
    private int size;
    private double price;
    private String name;

    public Cake(boolean hasSugar, int size, double price, String name) {
        this.hasSugar = hasSugar;
        this.size = size;
        this.price = price;
        this.name = name;
        stock--;
    }

    public Cake() {
        stock--;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Cake.stock = stock;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return hasSugar == cake.hasSugar && size == cake.size && Double.compare(cake.price, price) == 0 && Objects.equals(name, cake.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasSugar, size, price, name);
    }*/


    public static void main(String[] args) {
        Cake cake = new Cake();
        Cake cake2 = new Cake(true, 10, 15.0, "Black Chocolate");
        Cake cake4 = new Cake(true, 10, 15.0, "Black Chocolate");

        System.out.println(cake4.equals(cake2));
        System.out.println(Objects.equals(cake2, cake4));

        System.out.println(cake4.hashCode());
        System.out.println(cake2.hashCode());

        Cake cake3 = new Cake(false, 10, 15.0, "White Chocolate");

        cake4.setHasSugar(false);


        System.out.println(Cake.getStock());

    }
}
