package task2;

public class CV extends ApplyingJobDocument{

	int[] listOfJobs;
	int[] listOfDegrees;
	
	public CV(String title, String typeOfJob, String typeOfForm, int size, int[] listOfJobs, int[] listOfDegrees) {
		super(title, typeOfJob, typeOfForm, size);
		this.listOfJobs = listOfJobs;
		this.listOfDegrees = listOfDegrees;
		
		System.out.println("CV");
	}
	
}
