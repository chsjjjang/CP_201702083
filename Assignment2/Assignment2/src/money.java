import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int a, b, c, d, e;

		System.out.print("500원의 개수 : ");
		a = input.nextInt();
		System.out.print("100원의 개수 : ");
		b = input.nextInt();
		System.out.print("50원의 개수 : ");
		c = input.nextInt();
		System.out.print("10원의 개수 : ");
		d = input.nextInt();

		e = 500 * a + 100 * b + 50 * c + 10 * d;
		System.out.println("저금통에 들어있는 돈의 총액 : " + e + "원");
	}

}
