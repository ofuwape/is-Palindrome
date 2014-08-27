import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text here: ");
		String text = scan.next();
		System.out.println(palindrome(text));
	}

	private static boolean palindrome(String text) {
		int sz = text.length();
		int count = sz - 1;
		int countf = 0;
		boolean cont = true;
		label: while (cont) {
			if (count < 0) {
				break label;
			}
			cont = text.charAt(countf) == (text.charAt(count));
			count--;
			countf++;

		}
		return cont;
	}

}
