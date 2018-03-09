import java.util.Collections;

public class Test{
	public static void main(String args[]) {
		Tren a=new Tren("Berlin","10:01","AC1");
		Tren b=new Tren("Munchen","05:01","AC2");
		Tren c=new Tren("Frankfurt","16:01","AC3");
		Tren d=new Tren("Dusseldorf","10:32","AC4");
		Tren e=new Tren("Koln","13:01","AC5");
		Gara1 gara=new Gara1();
		gara.trenuri.add(a);
		gara.trenuri.add(b);
		gara.trenuri.add(c);
		gara.trenuri.add(d);
		gara.trenuri.add(e);
		Collections.sort(gara.trenuri,new Sortare());
		gara.afisare();
		Gui window = new Gui(gara);
	}
}