import java.util.Scanner;

public class Ticketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a[] = { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 };
		int b;
		boolean c = true;
		int number;

		while (c == true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0) : ");
			b = scan.nextInt();

			if (b == 0) {
				System.out.println("프로그램을 종료합니다.");
				c = false;
			} else if (b == 1) {
				System.out.println("현재의 예약 상태는 다음과 같습니다. (1은 이미 예약된 좌석)");
				System.out.println("-----------------------");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10");
				System.out.println("-----------------------");
				System.out.println(" 0 0 0 0 1 1 1 0 0 0");
			} else
				System.out.println("잘못 입력하셨습니다.");

			while (b == 1) {
				System.out.print("몇번째 좌석을 예약하시겠습니까?");
				number = scan.nextInt() - 1;

				if (a[number] == 0) {
					System.out.println("예약되었습니다.");
					b++;
				} else {
					System.out.println("이미 예약된 좌석입니다.");
				}
			}

		}
	}
}