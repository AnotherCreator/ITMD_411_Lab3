/*
Josh Reginaldo
ITMD-411

Lab 2 - Bank Record Generations

A bank has received a .csv file containing raw data of various clients.

Each row will be stored in an ArrayList as string arrays
From there, iterate through the entire ArrayList and through each string array
Create a new BankRecord object per string array and populate each field appropriately using setters

Display the first 25 entries in a column-type format
*/

public class BankRecordsTest {
    public static void main(String[] args) {

        // Create a new obj and parse / cache / print .csv data
        BankRecords records = new BankRecords();
        records.readClientData();
    }
}
