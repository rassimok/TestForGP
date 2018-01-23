import java.util.ArrayList;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> aListNegative = new ArrayList<Integer>();
		ArrayList<Integer> aListPositive = new ArrayList<Integer>();
		int sumNegative=0;
		int sumPositive=0;
		for (int i = 0; i < n; i++) {
			int tmp = scan.nextInt();
			if (tmp < 0) {
				sumNegative+=tmp;
				aListNegative.add(i+1);
			} else if (tmp > 0) {
				sumPositive+=tmp;
				aListPositive.add(i+1);
			}
		}
		scan.close();
		if(-sumNegative>sumPositive) {
			System.out.println(aListNegative.size());
			for (int i : aListNegative) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println(aListPositive.size());
			for (int i : aListPositive) {
				System.out.print(i+" ");
			}
		}
	}

}
