import java.util.Scanner;

public class chs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int x, y;
		double z, pi;

		System.out.print("원기둥 밑면의 반지름을 입력하시오. : ");
		x = input.nextInt();

		System.out.print("원기둥 높이를 입력하시오 : ");
		y = input.nextInt();
		pi = 3.141592;

		z = pi * x * x * y;

		System.out.println("원기둥의 부피는" + z + "입니다.");
	}
}
