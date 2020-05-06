import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.exemple.domain.Product;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Product> x = new ArrayList<Product>();
		x.add(new Product());
		x.add(new Product());
		x.add(new Product());

		Map<Long, Product> products = new HashMap<Long, Product>();
		products.put(1l, new Product());
		products.put(2l, new Product());
		products.put(3l, new Product());
		
		System.out.println(products);
		
	}

}
