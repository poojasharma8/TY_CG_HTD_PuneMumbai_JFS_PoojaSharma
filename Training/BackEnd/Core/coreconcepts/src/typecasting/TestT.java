package typecasting;

public class TestT {
	public static void main(String[] args) {
		 
		Pen p = new Marker();//up-casting
		Marker i = (Marker)p;//down-casting
		i.cost = 100;
		System.out.println("cost of a pen is "+i.cost);
		i.write();
		i.size = 2.2;
		System.out.println("size of marker is "+i.size);
		i.color();
	}

}
