// Call the comparator classes here

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Records extends BankRecords {
    static FileWriter writer = null;

    // Create a new .txt file with the required analytics
    public Records() {
        try {
            writer = new FileWriter("bankrecords.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

    private static void clientAvgAge() {

    }

    private static void clientAvgSex() {

    }

    private static void clientAvgRegion() {

    }

    private static void clientAvgIncome() {

    }

    private static void clientAvgMarriage() {

    }

    private static void clientAvgChild() {

    }

    private static void clientAvgCar() {

    }
}
