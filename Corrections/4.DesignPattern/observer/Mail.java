
public class Mail extends INotification{

	@Override
	public void sendNotification() {
		for(Personne p : this.personnes) {
			System.out.println("Send Email to : "+p.getEmail());
			
		}
		
		
	}
}
