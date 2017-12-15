
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i, k, j;
		x = 4;
		for (i = 0; i < x; i++) {
			for (j = 0; j < (x - 1) - i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i < x - 1; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < 5 - 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
