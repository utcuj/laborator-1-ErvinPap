import java.util.Comparator;

public class Sortare implements Comparator<Tren> {
	public int compare(Tren a,Tren b) {
		return a.destinatie.compareTo(b.destinatie);
	}
}
