import java.util.Scanner;

public class chs1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int x;
		System.out.print("마일을 입력하시오 :");
		x = input.nextInt();

		Double y;
		y = 1.609 * x;
		System.out.println(x + "마일은 " + y + "킬로미터입니다.");
	}

}
