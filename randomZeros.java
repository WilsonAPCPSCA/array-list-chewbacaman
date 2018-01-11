package randomZeros;
import java.util.Random;
import java.util.ArrayList;

public class randomZeros {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList <Integer> numsRandom = new ArrayList <Integer>();
		for (int i = 0; i<10; i++){
			numsRandom.add(rand.nextInt(100)+1);
		}
		System.out.println(numsRandom);
		for (int i=0; i< numsRandom.size(); i++){
			numsRandom.set(i,0);
		}
		System.out.print(numsRandom);

	}

}
