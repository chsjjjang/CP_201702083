class academic {
	String name, department, code;
	int grade, credit;

	public void name(String a) {
		name = a;
	}

	public String getname() {
		return name;
	}

	public void department(String b) {
		department = b;
	}

	public String getdepartment() {
		return department;
	}

	public void code(String c) {
		code = c;
	}

	public String getcode() {
		return code;
	}

	public void grade(int d) {
		grade = d;
	}

	public int getgrade() {
		return grade;
	}

	public void credit(int e) {
		credit = e;
	}

	public int getcredit() {
		return credit;
	}

}

class undergraduate extends academic {
	String group;

	public void group(String f) {
		group = f;
	}

	public String getgroup() {
		return group;
	}
}

class postgraduate extends academic {
	String type;
	double rate;

	public void type(String g) {
		type = g;
	}

	public String gettype() {
		return type;
	}

	public void rate(double h) {
		rate = h;
	}

	public double getrate() {
		return rate;
	}
}

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		undergraduate a = new undergraduate();
		postgraduate b = new postgraduate();

		a.name("A");
		a.department("��ǻ�� ���а�");
		a.code("201702083");
		a.credit(17);
		a.grade(1);
		a.group("���");

		System.out.println("�кλ� a�� �̸� : " + a.getname());
		System.out.println("�кλ� a�� �а� : " + a.getdepartment());
		System.out.println("�кλ� a�� �й� : " + a.getcode());
		System.out.println("�кλ� a�� �̼� ���� : " + a.getcredit());
		System.out.println("�кλ� a�� �г� : " + a.getgrade());
		System.out.println("�кλ� a�� ���Ƹ� : " + a.getgroup());

		b.name("B");
		b.department("������");
		b.code("201012447");
		b.credit(0);
		b.grade(5);
		b.type("����");
		b.rate(0.5);

		System.out.println("���п��� b�� �̸� : " + b.getname());
		System.out.println("���п��� b�� �а� : " + b.getdepartment());
		System.out.println("���п��� b�� �й� : " + b.getcode());
		System.out.println("���п��� b�� �̼� ���� : " + b.getcredit());
		System.out.println("���п��� b�� �г� : " + b.getgrade());
		System.out.println("���п��� b�� ���� ���� : " + b.gettype());
		System.out.println("���п��� b�� ���б� ���� : " + b.getrate());
	}

}
