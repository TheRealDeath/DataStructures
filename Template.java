import java.util.Iterator;
import java.lang.Comparable;
import java.util.Arrays;
public abstract class Template<T> implements Iteration<T>, Comparable<T>
{
	protected Object[] arr;
	protected int size, arrSize, current, sum;
	protected boolean firstIteration;
	public Template()
	{
		firstIteration = true;
		size = arrSize = current = 0;
		arr = new Object[0];
	}
	public int compareTo(Template<T> temp)
	{
		return this.sum - temp.sum;
	}
	public void resize()
	{
		Object[] temp;
		if(firstIteration){temp = new Object[1];arrSize = 1;}
		else
		{ 
			temp = new Object[(int)Math.ceil(arrSize*1.5)];
			for(int i = 0;i<size;i++) temp[i] = arr[i];
		}
		arrSize = (int)Math.ceil(arrSize*1.5);
		arr = new Object[temp.length];
		int i = 0;
		for(Object x : temp) arr[i++] = x;
		firstIteration = false;
	}
	public boolean hasNext() 
	{
		if(current >= size){current = 0;return false;}
		return current < size;
	}
	public int size() {return size;}
	public Object next() {return arr[current++];}
	public Iterator<Object> iterator() {return this;}
	public void sort() {arr.sort();}
	@Override
	public String toString() {return Arrays.toString(arr);}
}
interface Iteration<T> extends Iterable<Object>, Iterator<Object>{}
