import java.util.*;

public class TrackingService {
	
	private int total;
	private int goal;
	private List<HistoryItem> history = new ArrayList<HistoryItem>();
	private int historyId;
	
	public void addProtein(int amount){
		total += amount;
		history.add(new HistoryItem(historyId++, amount, "add", total));
	}
	
	public void removeProtein(int amount){
		total -= amount;
		if(total < 0)
			total = 0;
		history.add(new HistoryItem(historyId++, amount, "subtract", total));
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) throws InvalidGoalException {
		if(goal < 0)
			throw new InvalidGoalException();
		this.goal = goal;
	}

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

}
