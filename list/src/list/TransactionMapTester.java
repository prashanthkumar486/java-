package list;

import java.util.Map;
import java.util.TreeMap;

public class TransactionMapTester {
	public static void main(String[] args) {
		Transaction transaction1=new Transaction(55645111156345l, 999811354321l, 675645611564656l, 40000.00);
		Transaction transaction2=new Transaction(55642222645645l, 999833544321l, 675645641164656l, 10000.00);
		Transaction transaction3=new Transaction(55645444645645l, 999874435431l, 675645643264656l, 20000.00);
		
		
		
		Map<Long, Transaction>map=new TreeMap<Long,Transaction>();
		map.put(55645111156345l, transaction1);
		map.put(55642222645645l, transaction2);
		map.put(55645444645645l, transaction3);
		
		
		TransactionServeice s=new TransactionServeice();
		s.printAllTransactions(map, 999811354321l);
		
		
	}

}
