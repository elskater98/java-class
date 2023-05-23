package exUF2;

import java.util.*;

public class Domino {

    private final ArrayList<String> records = new ArrayList<>();

    public Domino() {
    }


    public void showFourLines() {
        int rows = 4;
        int items = this.records.size() / rows;

        for (int i = 0; i < rows; i++) {
            int start = i * items;
            int end = ((i + 1) * items);
            System.out.println(this.records.subList(start, end).toString().replace("[", "").replace("]", ""));
        }
    }

    public int findValueInLine(int index) {
        int rows = 4;
        int items = this.records.size() / rows;

        for (int i = 0; i < rows; i++) {
            int start = i * items;
            int end = ((i + 1) * items);

            if (start <= index && index <= end)
                return i;
        }
        return 0;
    }

    public void swapValues(int n) {

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int swap = random.nextInt(this.records.size());
            int swap2 = random.nextInt(this.records.size());

            String value1 = this.records.get(swap);
            String value2 = this.records.get(swap2);

            this.records.set(swap, value2);
            this.records.set(swap2, value1);
            System.out.printf("Intercambio %s: ficha %s (%s) por ficha %s (%s)%n", i, swap, value1, swap2, value2);
        }
        System.out.println(this.records);

    }


    public void generateRecords() {
        System.out.println("Fichas del domino:");

        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= j) {
                    this.records.add(String.format("%s-%s", i, j));
                    System.out.printf("Ficha %s: %s-%s%n", records.size(), i, j);
                }
            }
        }
    }

    public void findPairRecord(int num) {
        String find = String.format("%s-%s", num, num);

        for (int i = 0; i < this.records.size(); i++) {
            if (Objects.equals(this.records.get(i), find)) {
                System.out.printf("El doble %s se encuentra en la posición %s y está situado en la línea %s%n", find, i + 1, findValueInLine(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Domino domino = new Domino();

        Scanner userInput = new Scanner(System.in);

        int currentValue = -1;

        while (currentValue != 0) {
            currentValue = userInput.nextInt();
            System.out.println("Opcion: " + currentValue);

            switch (currentValue) {
                case 1:
                    domino.generateRecords();
                    break;
                case 2:
                    domino.showFourLines();
                    break;
                case 3:
                    int swaps = userInput.nextInt();
                    domino.swapValues(swaps);
                    break;
                case 4:
                    int num = userInput.nextInt();
                    domino.findPairRecord(num);
                    break;
            }
        }
        System.out.println("Adios");
    }
}
