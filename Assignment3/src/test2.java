import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x, y, z;
		System.out.print(" 키를 입력하시오 : ");
		x = input.nextDouble();
		y = (x - 100) * 0.9;
		System.out.println("키에 따른 표준체중은 " + y + "kg입니다.");

		System.out.print(" 체중을 입력하시오 : ");
		z = input.nextDouble();

		if (z >= y * 1.1)
			System.out.print(" 과체중 입니다. ");
		else if (z <= y * 0.9)
			System.out.print(" 저체중 입니다.");
		else
			System.out.print(" 정상 입니다.");
	}

}
