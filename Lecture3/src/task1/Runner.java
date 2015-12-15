package task1;

public class Runner {
	public static void main(String[] args) {

		String myTestText = "King Henry VIII slept with a gigantic axe beside him.";

		String[] myTestAray = myTestText.split(" ");

				for (int i = 0; i < myTestAray.length; i++) {

			System.out.println(myTestAray[i]);
		}
	}
}
