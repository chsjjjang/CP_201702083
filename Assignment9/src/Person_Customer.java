class person {
	public String name, address, number;

	public void name(String a) {
		name = a;
	}

	public String getname() {
		return name;
	}

	public void address(String b) {
		address = b;

	}

	public String getaddress() {
		return address;
	}

	public void number(String c) {
		number = c;
	}

	public String getnumber() {
		return number;
	}
}

class customer extends person {
	public String customersnumber;
	public int mileage;

	public void customernumber(String d) {
		customersnumber = d;
	}

	public String getcustomersnumber() {
		return customersnumber;
	}

	public void mileage(int e) {
		mileage = e;
	}

	public int getmileage() {
		return mileage;
	}
}

public class Person_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person a = new person();
		customer b = new customer();

		a.name("aa");
		a.address("bb");
		a.number("000000");
		System.out.println("a�� �̸� : " + a.getname());
		System.out.println("a�� �ּ� : " + a.getaddress());
		System.out.println("a�� ��ȣ : " + a.getnumber());

		b.name("cc");
		b.address("bb2");
		b.number("001000");
		b.customernumber("000000");
		b.mileage(1254);
		System.out.println("b�� �̸� : " + b.getname());
		System.out.println("b�� �ּ� : " + b.getaddress());
		System.out.println("b�� ��ȣ : " + b.getnumber());
		System.out.println("b�� ����ȣ : " + b.getcustomersnumber());
		System.out.println("b�� ���ϸ��� : " + b.getmileage());

	}

}
