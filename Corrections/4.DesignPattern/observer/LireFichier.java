
public class LireFichier extends IProcessus{
	public void work() {
		System.out.println("Read In Progress");
		System.out.println("Work Ended, send Notification to all observers");
		ended();
	}

}
