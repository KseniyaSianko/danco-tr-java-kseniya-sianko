package task2;


public class WorkExperience {

	int amount;
    boolean isChronologicalOrder = true;
    int date;
    
	public WorkExperience(int amount, boolean isChronologicalOrder, int date) {
		
		this.amount = amount;
		this.isChronologicalOrder = isChronologicalOrder;
		this.date = date;
		
		System.out.println("WorkExperience");
	}
}