package list;


import java.util.Map;
import java.util.Set;

public class TransactionServeice {
	

	public void printAllTransactions(Map<Long, Transaction> map, long senderAccountNumber) {
		Set<Long> k=map.keySet();
		
		for (Long long1 : k) {
			System.out.println( long1 );
			System.out.println("---------------");
		}
		}
		
	

}
