package list;

public class Transaction {
	long transactionId;
	long senderAccountNumber;
	long recepientAccountNumber;
	double transactionAmount;
	public Transaction(long transactionId, long senderAccountNumber, long recepientAccountNumber,
			double transactionAmount) {
	
		this.transactionId = transactionId;
		this.senderAccountNumber = senderAccountNumber;
		this.recepientAccountNumber = recepientAccountNumber;
		this.transactionAmount = transactionAmount;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getSenderAccountNumber() {
		return senderAccountNumber;
	}
	public void setSenderAccountNumber(long senderAccountNumber) {
		this.senderAccountNumber = senderAccountNumber;
	}
	public long getRecepientAccountNumber() {
		return recepientAccountNumber;
	}
	public void setRecepientAccountNumber(long recepientAccountNumber) {
		this.recepientAccountNumber = recepientAccountNumber;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "transactionId= " + transactionId + "\nsenderAccountNumber= " + senderAccountNumber
				+ " \nrecepientAccountNumber= " + recepientAccountNumber + ", \ntransactionAmount= " + transactionAmount;
	}	
}
