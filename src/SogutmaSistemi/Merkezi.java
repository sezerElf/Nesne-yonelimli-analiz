package SogutmaSistemi;

public class Merkezi {
	
	private int temp;
	
	Subject s = new Subject();
	Observer o = new Observer();
	
	public Merkezi() {
		s.attach(o);
	}

	SicaklikAlgilayici sa = new SicaklikAlgilayici();
	EyleyiciModül ey = new EyleyiciModül();
	
	public int SıcaklıkGetir() {
		if(temp == 0)
			temp = sa.SicaklikGetir();
		return temp;
	}
	
	public void SogutucuAc() {
		String mesaj = "Sogutucu Acildi";
		temp = ey.SogutucuAc(temp);
		s.notify(mesaj);
	}
	
	public void SogutucuKapa() {
		String mesaj = "Sogutucu Kapatildi";
		temp = ey.SogutucuKapa(temp);
		s.notify(mesaj);
	}
}
