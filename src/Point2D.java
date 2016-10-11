
public class Point2D {
	private int x=0,y=0,ix=0;
	private static int incPoint = 0;

	
	public Point2D(){
		Point2D.incPoint++;
		this.ix=Point2D.incPoint;
	}
	
	Point2D(int x ,int y){
		this();
		this.x = x;
		this.y =y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getIx() {
		return this.ix;
	}
	
	public void afficher(){
		System.out.println("Point indice " + this.ix +" x : " + this.x + "\ty : " + this.y);
	}
	
	public void translater(int dx , int dy){
		this.x += dx;
		this.y += dy;
	}
	
	public static int getIncPoint(){
		return Point2D.incPoint;
	}
	
	
}
