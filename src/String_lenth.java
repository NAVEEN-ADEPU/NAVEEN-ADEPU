package strings;

public class String_lenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Level = "levitica";
		String Level1 = "    levitica";
		System.out.println(Level.length());
		System.out.println(Level1.length());
		System.out.println(Level);
		System.out.println(Level1);
		String tv = Level.trim();
		System.out.println(Level);
		System.out.println("untrimed_value"+Level1);

	}

}
