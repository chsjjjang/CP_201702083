import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x, y, z;
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");
		x = input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		y = input.nextInt();
		System.out.print("����° ���ڸ� �Է��Ͻÿ� : ");
		z = input.nextInt();

		if ((x >= y) && (x > z))
			if (y > z)
				System.out.println(z + ", " + y + ", " + x);
			else if (z >= y)
				System.out.println(y + ", " + z + ", " + x);
		if ((y > x) && (y > z))
			if (x > z)
				System.out.println(z + ", " + x + ", " + y);
			else if (z >= x)
				System.out.println(x + ", " + z + ", " + y);
		if ((z >= x) && (z >= y))
			if (x > y)
				System.out.println(y + ", " + x + ", " + z);
			else if (y >= x)
				System.out.println(x + ", " + y + ", " + z);
		if ((x==y)&&(y==z))
			System.out.println(x + ", " + y + ", " + z);

	}

}
