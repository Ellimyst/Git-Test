import java.util.stream.DoubleStream;

public class Tree {

	private int height;
	private int modifier, base;
	
	
	
	public Tree(int base, int modifier) {
		base = this.base;
		modifier = this.modifier;
		height = base + Runner.rand.nextInt((2*modifier)+1)-modifier;
	}
	
	public String toString()
	{
		return height+"";
	}
}
