package question7;

public class Sphere extends Cercle implements Scalable{
	
	private int z;
	
	public Sphere(int x, int y, int z, double rayon) {
		super(x, y, rayon);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return super.toString()+",z="+this.z;
	}
	
	@Override
	public double surface() {
		return super.surface()*rayon;
	}
}
