package emperorsNewGroove;
import java.util.ArrayList;
public class emperorsNewGroove {

	public static void main(String[] args) {
		ArrayList<String> emperorCast = new ArrayList <String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println(emperorCast);
		emperorCast.remove(1);
		emperorCast.add(2,"Chaca");
		emperorCast.add(3, "Tipo");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.print(emperorCast);

	}

}
