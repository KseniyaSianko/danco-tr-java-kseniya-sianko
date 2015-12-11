package task2;

public class Resume extends ApplyingJobDocument {
      Skills skills;
      Hobbies hobbies;
      WorkExperience workExp;
      PersonalInformation persInfo;
	
      public Resume(String title, String typeOfJob, String typeOfForm, int size, Skills skills, Hobbies hobbies,
			WorkExperience workExp, PersonalInformation persInfo) {
		super(title, typeOfJob, typeOfForm, size);
		this.skills = skills;
		this.hobbies = hobbies;
		this.workExp = workExp;
		this.persInfo = persInfo;
	}
	
      
      
      
}