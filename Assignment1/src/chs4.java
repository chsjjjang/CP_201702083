import java.util.Scanner;

public class chs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int x, y;
		double z, pi;

		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�. : ");
		x = input.nextInt();

		System.out.print("����� ���̸� �Է��Ͻÿ� : ");
		y = input.nextInt();
		pi = 3.141592;

		z = pi * x * x * y;

		System.out.println("������� ���Ǵ�" + z + "�Դϴ�.");
	}
}
