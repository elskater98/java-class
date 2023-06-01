import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ingestor {

    public static void main(String[] args) {
        ArrayList<CodigosTension> codigosTensions = new ArrayList<>();

        try {
            File file = new File("/Users/francesc/Desktop/datastructures/src/codigos_tension.csv");
            Scanner myReader = new Scanner(file);
            myReader.nextLine(); // header
            while (myReader.hasNextLine()) {
                String row = myReader.next();
                String[] values = row.split(",");
                try {
                    codigosTensions.add(new CodigosTension(values[0], values[1], values[2]));
                }catch (Exception exception){
                    System.out.println("Wrong data;");
                }
            }
        } catch (Exception exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }

        System.out.println(codigosTensions.toString());
    }

}
