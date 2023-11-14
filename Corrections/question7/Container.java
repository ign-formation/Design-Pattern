package question7;

import java.util.ArrayList;

public class Container {
	
	private ArrayList<Forme> array;
	
	public Container() {
		array = new ArrayList<Forme>();
	}
	
	public void add(Forme f) {
		array.add(f);
	}
	
	public void remove(int i) {
		array.remove(i);
	}
	
	@Override
	public String toString() {
		String value = "";
		for (int i = 0; i < array.size(); i++) {
			value += array.get(i).toString()+"\n";
		}
		
		return value;
		
	}
}
