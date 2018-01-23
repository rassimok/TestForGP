import java.util.HashSet;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int count = 0;
		int nomber = 1;
		while (count < N) {
			if(isGoodNumber(nomber)) {
				count++;
				nomber++;
			}else {
				nomber++;
			}
			
		}
		System.out.println(nomber-1);
	}

	public static boolean isGoodNumber(int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while (n > 0) {
			int tmp = n % 10;
			if (hs.contains(tmp)) {
				return false;
			} else {
				hs.add(tmp);
			}
			n /= 10;
		}

		return true;
	}

}
