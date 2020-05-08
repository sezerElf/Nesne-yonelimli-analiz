package SogutmaSistemi;
import java.util.Random;
public class SicaklikAlgilayici extends SicaklikGetir{
	private int temp;
	
	@Override
	protected int SicaklikOku() {
		Random random = new Random();
		temp = random.nextInt(30)+15;
		return temp;
	}
	
	@Override
	public int SicaklikGetir() {
		return this.SicaklikOku();
	}
}
