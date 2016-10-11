
public class Point3D extends Point2D{
	private int z = 0;
	
	public Point3D(){
		super();
	}
	
	public Point3D(int x , int y , int z){
		super(x,y);
		this.z = z;
	}
	
	public void setZ(int z) {
		this.z =z;
	}
	
	public int getZ() {
		return this.z;
	}
	
	public void translater(int dx , int dy ,int dz) {
		super.translater(dx, dy);
		this.z += z;
	}
	
	public void afficher() {
		System.out.println("Point indice " + this.getIx() + " x : " + this.getX() + "\t y : " + this.getY() + "\t z : " + this.getZ());
	}
}
