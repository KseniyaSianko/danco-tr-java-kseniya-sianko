package task2;

public class ApplyingJobDocument {
	
	String title;
	String typeOfJob;
	String typeOfForm;
	int size;
	
	public ApplyingJobDocument(String title, String typeOfJob, String typeOfForm, int size) {
		super();
		this.title = title;
		this.typeOfJob = typeOfJob;
		this.typeOfForm = typeOfForm;
		this.size = size;
		
		System.out.println("ApplyingJobDocument");
	}
}