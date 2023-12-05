
public class EcrireFichier extends IProcessus{
	public void work() {
		System.out.println("Write In Progress");
		System.out.println("Work Ended, send Notification to all observers");
		ended();
	}
}
