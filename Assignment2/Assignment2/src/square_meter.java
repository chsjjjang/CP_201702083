import java.util.Scanner;

public class square_meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double x, y;
		System.out.print("평 수를 입력하시오 : ");
		x = input.nextDouble();

		y = 3.3058 * x;
		System.out.println("평방미터 :" + y + "(m^2)");
	}

}
