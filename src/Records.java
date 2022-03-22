/*
Josh Reginaldo
ITMD-411

Lab 3 - Bank Record Analytics

A bank has received a .csv file containing raw data of various clients.

Using Lab 2 as the foundation of the code, now implement the use of the java.util.comparator utility class to
create a data analysis based of the records in the .csv file.

Records.java will print out to the console and print out to a .txt file

- Average income for males vs. females
- Number of females with a mortgage and savings account
- Number of males with both a car and 1 child per location
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Records extends BankRecords {
    static FileWriter writer = null;

    public static void main(String[] args) {
        // Prints first 25 client data
        BankRecords bkRecords = new BankRecords();
        bkRecords.readClientData();

        /*
        - Average income for males vs. females
        - Number of females with a mortgage and savings account
        - Number of males with both a car and 1 child per location
        */
        clientAvgIncome();
        clientHasSavings();
    }

    public Records() {
        try {
            writer = new FileWriter("bankrecords.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clientHasSavings() {
        Arrays.sort(bankEntry, new ClientHasSavingsComparator());
        int femWithSaveAndMort = 0;

        for (BankRecords bankRecords : bankEntry) {
            if (bankRecords.getClientSex().equals("FEMALE")) {
                if (bankRecords.getClientSaveActStatus().equals("YES")
                        && (bankRecords.getClientMortgageStatus().equals("YES"))) {
                    ++femWithSaveAndMort;
                }
            }
        }

        System.out.print("\n==================================================");
        System.out.printf("\nFemales With Savings & Mortgage: %d", (femWithSaveAndMort));
        System.out.print("\n==================================================");
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

//    private static void createFile() {
//        try {
//            File dataResult = new File("ITMD_411_Lab3\\fileOutput\\dataResult.txt");
//            if (dataResult.createNewFile()) {
//                System.out.print("\nNew Data File Created");
//            }
//            else {
//                System.out.print("\nFile Already Exists");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
