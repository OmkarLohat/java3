package listproject;
import java.util.Comparator;
public class SizeComparator implements Comparator<Product>{

	
	

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getSize()< p2.getSize())
			return -1;
		if(p1.getSize()> p2.getSize())
			return 1;
		
		return 0;
	}

}
