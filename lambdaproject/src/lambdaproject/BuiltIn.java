package lambdaproject;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class BuiltIn {

	public static void main(String[] args) {
		Consumer<Integer> con= x -> System.out.println(x);
		con.accept(334);
		
		
		BiConsumer<String, Integer> bs= (x,y)-> System.out.println(x.substring(y));
		bs.accept("Omkar", 3);
		
		Predicate<Integer> p=x->x%2==0;
		System.out.println(p.test(2));
		
		BiFunction<Integer, Integer, Integer> maxFunction = (x,y)->x>y?x:y;
		System.out.println(maxFunction.apply(25, 14));
		
		Function<Integer, Integer> square = x -> x * x;

        
        System.out.println(square.apply(5));
        
        Consumer<String> UpperCase = s -> System.out.println(s.toUpperCase());

        UpperCase.accept("hello world");

	}

}
