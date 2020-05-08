package SogutmaSistemi;

public class Observer implements IObserver{

	public void message(String temp) {
		System.out.println(temp);
	}
}
