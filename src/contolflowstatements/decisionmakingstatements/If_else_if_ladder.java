package contolflowstatements.decisionmakingstatements;

public class If_else_if_ladder {

	public static void main(String[] args) {
		/* (logic) {
		 *  statement
		 *  }else if(logic) {
		 *  statement
		 *  }else if (logic) {
		 *  statement
		 *  }else {
		 *  statement
		 */
int a =20;
int b =30;
if (a+b>45) {
	System.out.println ("greater than 45");
}else if(a+b<45) {
	System.out.println("less than 25");
}else if (a+b > 48) {
	System.out.println("greater than 48");
}else {
	System.out.println("None of the above");
}

	}

}
