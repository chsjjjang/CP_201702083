import java.util.Scanner;

public class signup2017_11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String A, B, C, D;

		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오 : ");
		A = input.next();
		System.out.print("비밀번호를 입력하시오 : ");
		B = input.next();

		System.out.println("");
		
		System.out.println("<로그인>");

		System.out.print("ID : ");
		C = input.next();
		System.out.print("PW : ");
		D = input.next();
		
		if ((A.equals(C)) && (B.equals(D)))
			System.out.println(" 로그인에 성공하셨습니다. ");
		else
			System.out.println(" 로그인에 실패하셨습니다. ");
	}
	
}
