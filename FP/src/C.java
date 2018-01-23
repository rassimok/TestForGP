import java.util.Scanner;


public class C {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String first=scan.nextLine();
		String second=scan.nextLine();
		scan.close();
		boolean b=false;
		int count=0;
		for (int i = 0; i < second.length(); i++) {
			if(first.charAt(count)==second.charAt(i)) {	
				count++;
				if(count>first.length()-1) {
					b = true;
					break;
				}
			}
		}
		if(b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		
	}

}
