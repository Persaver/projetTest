
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D a = new Point2D();
		a.setX(25);
		a.setY(12);
		System.out.println("indice de a = " + a.getIncPoint());
		Point2D b = new Point2D(56,45);
		System.out.println("indice de b = " + b.getIncPoint());
		
		System.out.println("a");
		a.afficher();
		System.out.println("b");
		b.afficher();
		
		
		System.out.println("x de a = " + a.getX());
		System.out.println("y de a = " + a.getY());
		
		a.translater(5, -54);
		b.translater(5, -54);
		
		System.out.println("a");
		a.afficher();
		System.out.println("b");
		b.afficher();
		
		System.out.println("c");
		Point3D c = new Point3D(21,14,36);
		c.afficher();
		c.translater(5, 23, 4);
		c.afficher();
	}

}
