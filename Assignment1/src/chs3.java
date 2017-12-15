import java.util.Scanner;

public class chs3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		Double x;
		System.out.print("키를 입력하시오 : ");
		x = input.nextDouble();

		Double y;
		y = x / 30.48;
		int b = (int) Math.floor(y); // 소수점 버림

		Double z;
		z = (x - (b * 30.48)) / 2.54;

		System.out.println(x + "cm는 " + b + "피트" + z + "인치입니다.");
	}

}
