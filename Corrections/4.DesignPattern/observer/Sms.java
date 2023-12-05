
public class Sms extends INotification{

	@Override
	public void sendNotification() {
		for(Personne p : this.personnes) {
			System.out.println("Send Sms to : "+p.getPhone());
			
		}
	}
}
