import java.util.Scanner;

public class square_meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double x, y;
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		x = input.nextDouble();

		y = 3.3058 * x;
		System.out.println("������ :" + y + "(m^2)");
	}

}
