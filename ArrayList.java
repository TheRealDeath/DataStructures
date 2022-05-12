public class ArrayList<T> extends Template<T>
{
	public void add(T object)
	{
		if(arr.length <= size)
			resize();
		arr[size++] = object;
		sum += object;
	}
	public boolean remove(int n)
	{
		if(n >= size) return false;
		sum -= arr[n];
		for(int i = n+1;i<size;i++) arr[i-1] = arr[i];
		arr[size-1] = null;
		size--;
		return true;
	}
}
