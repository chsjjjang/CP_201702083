import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x, y, z;
		System.out.print(" Ű�� �Է��Ͻÿ� : ");
		x = input.nextDouble();
		y = (x - 100) * 0.9;
		System.out.println("Ű�� ���� ǥ��ü���� " + y + "kg�Դϴ�.");

		System.out.print(" ü���� �Է��Ͻÿ� : ");
		z = input.nextDouble();

		if (z >= y * 1.1)
			System.out.print(" ��ü�� �Դϴ�. ");
		else if (z <= y * 0.9)
			System.out.print(" ��ü�� �Դϴ�.");
		else
			System.out.print(" ���� �Դϴ�.");
	}

}
