import java.util.Scanner;

public class chs3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		Double x;
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		x = input.nextDouble();

		Double y;
		y = x / 30.48;
		int b = (int) Math.floor(y); // �Ҽ��� ����

		Double z;
		z = (x - (b * 30.48)) / 2.54;

		System.out.println(x + "cm�� " + b + "��Ʈ" + z + "��ġ�Դϴ�.");
	}

}
