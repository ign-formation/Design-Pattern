public class App {
	public static void main(String[] args) {
		
		System.out.println("----- Begin test -----" + '\n');
		
		Personne p1 = new Personne("Toto", "Toto", "06xxxxxx01", "toto.toto@mail.com");
		Personne p2 = new Personne("Titi", "Titi", "06xxxxxx02", "titi.titi@mail.com");
		
		Personne p3 = new Personne("Tutu", "Tutu", "06xxxxxx03", "Tutu.tutu@mail.com");
		Personne p4 = new Personne("Tata", "Tata", "06xxxxxx04", "Tata.tata@mail.com");
		
		LireFichier read = new LireFichier();
		
		Mail mail = new Mail();
		mail.add(p1);
		mail.add(p3);
		
		Sms sms = new Sms();
		sms.add(p2);
		sms.add(p4);
		
		read.addNotifier(mail);
		read.addNotifier(sms);
		
		read.work();
		
		EcrireFichier write = new EcrireFichier();
		
		write.addNotifier(mail);
		write.addNotifier(sms);
		
		write.work();
		
		System.out.println('\n' + "----- End test -----");
	}
}
