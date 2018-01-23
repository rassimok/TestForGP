import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q {

	public static void main(String[] args) throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = sc.readLine().split(" ");
		int m = Integer.parseInt(arr[0]);
		int n = Integer.parseInt(arr[1]);
		arr = sc.readLine().split(" ");
		int rezultI = Integer.parseInt(arr[0]);
		rezultI--;
		int rezultJ = Integer.parseInt(arr[1]);
		rezultJ--;
		int p = Integer.parseInt(sc.readLine());
		sc.readLine();
		int[][] matrTMP = new int[n][n];
		int[] compositionILine = new int[n];

		for (int i = 0; i < compositionILine.length; i++) {
			if (i == rezultI) {
				arr = sc.readLine().split(" ");
				for (int j = 0; j < compositionILine.length; j++) {
					compositionILine[j] = Integer.parseInt(arr[j]);
				}
			} else {
				sc.readLine();
			}
		}
		
		for (int i = 1; i < m; i++) {
			sc.readLine();
			for (int j = 0; j < matrTMP.length; j++) {
				arr = sc.readLine().split(" ");
				for (int j2 = 0; j2 < matrTMP.length; j2++) {
					matrTMP[j][j2] = Integer.parseInt(arr[j2]);
				}
			}
			
			compositionILine = lineIFromComposition(compositionILine, matrTMP, p, rezultI);
		}

		System.out.println(compositionILine[rezultJ]);
	}

	public static int[] lineIFromComposition(int mA[], int mB[][], int p, int rezultI) {
		int[] res = new int[mA.length];

		for (int j = 0; j < res.length; j++) {
			for (int k = 0; k < res.length; k++) {
				res[j] += mA[k] * mB[k][j];
			}
			res[j] = res[j] % p;
		}
		return res;
	}
}
