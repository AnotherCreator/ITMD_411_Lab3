// Call the comparator classes here

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

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
        // Prints first 25 client data
        BankRecords bkRecords = new BankRecords();
        bkRecords.readClientData();

        clientAvgIncome();
    }

    private static void clientAvgAge() {

    }

    private static void clientAvgRegion() {

    }

    private static void clientAvgIncome() {
        Arrays.sort(bankEntry, new ClientSexComparator());
        int clientMales = 0;
        int clientFemales = 0;
        double maleIncome = 0;
        double femaleIncome = 0;

        for (BankRecords bankRecords : bankEntry) {
            if (bankRecords.getClientSex().equals("FEMALE")) {
                ++clientFemales;
                femaleIncome += bankRecords.getClientIncome();
            } else {
                ++clientMales;
                maleIncome += bankRecords.getClientIncome();
            }
        }

        System.out.print("\n==================================================");
        System.out.printf("\nAvg Male Income: %.2f", (maleIncome / clientMales));
        System.out.printf("\nAvg Female Income: %.2f", (femaleIncome / clientFemales));
        System.out.print("\n==================================================");
    }

    private static void clientAvgMarriage() {

    }

    private static void clientAvgChild() {

    }

    private static void clientAvgCar() {

    }
}
