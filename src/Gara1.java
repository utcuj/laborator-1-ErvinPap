import java.util.ArrayList;

public class Gara1 {
	ArrayList<Tren>trenuri=new ArrayList<Tren>();
	
	public ArrayList<Tren>Listatren(){
		return trenuri;
	}
	
	public void afisare() {
		for(Tren tren:trenuri)
		{
			System.out.println(tren.toString());
		}
	}
}
