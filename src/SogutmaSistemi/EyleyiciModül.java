package SogutmaSistemi;

public class EyleyiciModül implements IEyleyiciModül {
	
	public int SogutucuAc(int temp) {
		temp -= 5;
		return temp;
	}
	public int SogutucuKapa(int temp) {
		return temp;
	}
}
