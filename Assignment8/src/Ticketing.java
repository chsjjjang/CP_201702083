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
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) : ");
			b = scan.nextInt();

			if (b == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				c = false;
			} else if (b == 1) {
				System.out.println("������ ���� ���´� ������ �����ϴ�. (1�� �̹� ����� �¼�)");
				System.out.println("-----------------------");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10");
				System.out.println("-----------------------");
				System.out.println(" 0 0 0 0 1 1 1 0 0 0");
			} else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");

			while (b == 1) {
				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�?");
				number = scan.nextInt() - 1;

				if (a[number] == 0) {
					System.out.println("����Ǿ����ϴ�.");
					b++;
				} else {
					System.out.println("�̹� ����� �¼��Դϴ�.");
				}
			}

		}
	}
}