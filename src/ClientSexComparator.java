import java.util.Comparator;

public class ClientSexComparator implements Comparator<BankRecords> {

    @Override
    public int compare(BankRecords o1, BankRecords o2) {
        int result = o1.getClientSex().compareTo(o2.getClientSex());
        return result;
    }
}
