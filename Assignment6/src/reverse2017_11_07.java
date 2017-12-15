import java.util.Scanner;
public class reverse2017_11_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String A;
		int a;
		System.out.print("문자열을 입력하시오 : ");
		A = input.nextLine();
		a=A.length();
		
		for (int i = 0 ; i <A.length(); i++){
			System.out.print(A.charAt(a-1-i));
		}

	}

}
