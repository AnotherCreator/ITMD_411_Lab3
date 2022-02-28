// Call the comparator classes here

import java.io.FileWriter;
import java.io.IOException;

public class Records extends BankRecords {
    static FileWriter writer = null;

    public Records() {
        try {
            writer = new FileWriter("bankrecords.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Records bankRecords = new Records();
}
