package contolflowstatements.decisionmakingstatements;

public class Switch_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// index that start from the number zero
		int lev=2;
		switch (lev) {
			case 1 ://0
				System.out.println("first");
				break;
			case 2: //1
				System.out.println("second");
				break;
			case 3:
				System.out.println("third");
				break;
				default:
					System.out.println("None");// in this we have to use break key word to break the bonds between two levels
		}
				
		}

}
