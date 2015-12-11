package task2;

public class Runner {
	
	public static void main(String[] agrs) {

		Skills mySkills = new Skills(10, true, "Knowledge");
		WorkExperience myWorkExerience = new WorkExperience(3, true, 121212);
		PersonalInformation myPersonalInformation = new PersonalInformation("kata", "hry", "re@re", 454617);
		Hobbies myHobbies = new Hobbies(6, false, "inside");
		
		Resume myResume = new Resume("myfirstresume", "economics", "resume", 2, mySkills, myHobbies, myWorkExerience, myPersonalInformation);
		CV myCV = new CV (null, null, null, 0, null, null);
		
		ApplyingJobDocument myApplyingJobDocument = new ApplyingJobDocument(null, null, null, 0);
		
		
		}
}
