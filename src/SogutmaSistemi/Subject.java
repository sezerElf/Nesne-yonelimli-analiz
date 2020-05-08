package SogutmaSistemi;
import java.util.ArrayList;

public class Subject implements ISubject {
	
	private ArrayList observers = new ArrayList();
	
	public void attach(IObserver o) {
		observers.add(o);
	}
	
	public void detach(IObserver o) {
		int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
	}
	public void notify(String m) {
		for (int i = 0; i < observers.size(); i++) {
            IObserver observer = (IObserver)observers.get(i);
            observer.message(m);
        }
	}
}
