import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int a, b, c, d, e;

		System.out.print("500���� ���� : ");
		a = input.nextInt();
		System.out.print("100���� ���� : ");
		b = input.nextInt();
		System.out.print("50���� ���� : ");
		c = input.nextInt();
		System.out.print("10���� ���� : ");
		d = input.nextInt();

		e = 500 * a + 100 * b + 50 * c + 10 * d;
		System.out.println("�����뿡 ����ִ� ���� �Ѿ� : " + e + "��");
	}

}
