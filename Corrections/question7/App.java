package question7;

public class App {

	public static void main(String[] args) {
		Carre r = new Carre(10);
		r.setNom("Mon carre");
		
		Cube c = new Cube(0,0,0,20);
		c.setNom("Mon cube");
		
		Cercle cercle = new Cercle(10);
		cercle.setNom("Mon cercle");
		
		Sphere s = new Sphere(0,0,0,20);
		s.setNom("Ma sphere");
		
		Container container = new Container();
		container.add(r);
		container.add(c);
		container.add(cercle);
		container.add(s);
		
		System.out.println("Avant suppression");
		System.out.println(container.toString());
		System.out.println("Après suppression");
		container.remove(0);
		System.out.println(container.toString());
	}
}
