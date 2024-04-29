package contolflowstatements.decisionmakingstatements;

public class Nested_if_statements {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		if (a+b>45) {
			System.out.println("greater than 45");
		}else {
			System.out.println("not printed");
		}
		if (a+b<45) {
			System.out.println("less than 45");
		}else {
			System.out.println("2nd not printed");
		}
		if (a+b>48) {
			System.out.println("greater than 48");
		}else {
			System.out.println("None of the above");
		}

	}

}
