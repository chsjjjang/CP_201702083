
public class Planetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane y1 = new Plane("아시아나", "a1", 150);
		Plane y2 = new Plane("진에어", "a3", 130);
		int n = Plane.getPlanes();
		System.out.println("생성된 비행기의 수 : " + n);

	}

}
