import java.util.ArrayList;

public abstract class IProcessus{
	
	protected ArrayList<INotification> observeurs = new ArrayList<INotification>();
	
	public void addNotifier(INotification notif) {
		observeurs.add(notif);
	}
	
	public void ended() {
		for (INotification o: observeurs) {
			o.sendNotification();
		}
	}

}
