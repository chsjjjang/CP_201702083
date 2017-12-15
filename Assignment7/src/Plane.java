
public class Plane {
	private String maker, model;
	private int Max_passanger;
	private static int plane = 0;

	public Plane(String k, String d, int p) {
		maker = k;
		model = d;
		Max_passanger = p;
		plane++;
	}
	public Plane(String k,  int p) {
		maker = k;
		Max_passanger = p;
		plane++;
	}
	public Plane(String k, String d) {
		maker = k;
		model = d;
		plane++;
	}
	public Plane(String k) {
		maker = k;

		plane++;
	}
	public Plane() {
		plane++;
	}

	public String getMaker() {
		return maker;
	}

	public String getmodel() {
		return model;
	}

	public int getMax_passanger() {
		return Max_passanger;
	}

	public static int getPlanes() {
		return plane;
	}
}
