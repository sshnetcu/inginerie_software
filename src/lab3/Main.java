package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("src\\lab3\\input.txt");
        ArrayList<String> inList = new ArrayList<>();
        ArrayList<String> outList = new ArrayList<>();

        try (Scanner myReader = new Scanner(inputFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                inList.add(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("err");
            e.printStackTrace();
        }

        for (String a : inList) {
            outList.add(a + " -> " + Integer.toString(a.hashCode()) + "\n");
        }

        try {
            FileWriter myWriter = new FileWriter("src\\lab3\\output.txt");
            myWriter.write(outList.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }
}
