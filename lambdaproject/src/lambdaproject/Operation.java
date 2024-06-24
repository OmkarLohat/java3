package lambdaproject;


@FunctionalInterface
public interface Operation {
	int operate(int x, int y);
}

interface Converter{
	String convert(String s);
}

interface Generic<A,T>
{
	T get(A a,A b);
}

