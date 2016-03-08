
public class HistoryItem {
	
	private int historyId;
	private int amount;
	private String action;
	private int total;

	public HistoryItem(int historyId, int amount, String action, int total) {
		this.setHistoryId(historyId);
		this.setAmount(amount);
		this.setAction(action);
		this.setTotal(total);
	}

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
