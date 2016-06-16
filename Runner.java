import java.util.ArrayList;
import java.util.Random;

public class Runner {
	
	public static Random rand = new Random();

	public static void main(String[] args) {
		
		ArrayList<Tree> trees = new ArrayList<Tree>();
		
		for(int i = 0; i < 10; i++)
		{
			trees.add(new Tree(10,4));
		}
		
		System.out.println(trees);
	}

}
