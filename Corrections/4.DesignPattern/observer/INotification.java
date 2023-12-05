import java.util.ArrayList;

public abstract class INotification {
	
	protected ArrayList<Personne> personnes = new ArrayList<Personne>();
	
	public void add(Personne p) {
		personnes.add(p);
	}
	
	public abstract void sendNotification();

}
