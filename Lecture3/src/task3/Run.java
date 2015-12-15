package task3;

public class Run {
	public static void main(String[] args) {

		Employee employee1 = new Employee("vasya", "PM", 2784343);
		Employee employee2 = new Employee("petya", "QA", 4968894);
		Employee employee3 = new Employee("katya", "DEV", 847676);
		Employee employee4 = new Employee("sveta", "BA", 9487696);
		Employee employee5 = new Employee("begemot", "Accounter", 5987947);

		Employee[] empArr = { employee1, employee2, employee3, employee4, employee5 };

		int sar = 0;

		for (int i = 0; i < empArr.length; i++) {
			sar += empArr[i].getSalary();
	
		}
		System.out.println(sar);
	}
}
