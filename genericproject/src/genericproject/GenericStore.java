package genericproject;

public class GenericStore<T> {
	T value;
	
	public T getValue()
	{
		return value;
	}
	
	public void setValue(T value)
	{
		this.value=value;
	}
	
}
