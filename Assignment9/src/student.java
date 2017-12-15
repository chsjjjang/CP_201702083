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
		a.department("컴퓨터 공학과");
		a.code("201702083");
		a.credit(17);
		a.grade(1);
		a.group("모션");

		System.out.println("학부생 a의 이름 : " + a.getname());
		System.out.println("학부생 a의 학과 : " + a.getdepartment());
		System.out.println("학부생 a의 학번 : " + a.getcode());
		System.out.println("학부생 a의 이수 학점 : " + a.getcredit());
		System.out.println("학부생 a의 학년 : " + a.getgrade());
		System.out.println("학부생 a의 동아리 : " + a.getgroup());

		b.name("B");
		b.department("연구소");
		b.code("201012447");
		b.credit(0);
		b.grade(5);
		b.type("연구");
		b.rate(0.5);

		System.out.println("대학원생 b의 이름 : " + b.getname());
		System.out.println("대학원생 b의 학과 : " + b.getdepartment());
		System.out.println("대학원생 b의 학번 : " + b.getcode());
		System.out.println("대학원생 b의 이수 학점 : " + b.getcredit());
		System.out.println("대학원생 b의 학년 : " + b.getgrade());
		System.out.println("대학원생 b의 조교 유형 : " + b.gettype());
		System.out.println("대학원생 b의 장학금 비율 : " + b.getrate());
	}

}
