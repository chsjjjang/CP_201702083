import java.util.Scanner;

public class signup2017_11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String A, B, C, D;

		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ� : ");
		A = input.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		B = input.next();

		System.out.println("");
		
		System.out.println("<�α���>");

		System.out.print("ID : ");
		C = input.next();
		System.out.print("PW : ");
		D = input.next();
		
		if ((A.equals(C)) && (B.equals(D)))
			System.out.println(" �α��ο� �����ϼ̽��ϴ�. ");
		else
			System.out.println(" �α��ο� �����ϼ̽��ϴ�. ");
	}
	
}
