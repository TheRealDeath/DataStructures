class Stack<T> extends Template<T>
{
    public void push(T object)
    {
        if(arr.length <= size)
			resize();
		arr[size++] = object;
    }
    public Object pop() 
    {
        size--;
        Object temp = arr[size];
        arr[size] = null;
        return temp;
    }
    public Object peek() {return arr[size-1];}
    public boolean isEmpty() {return size == 0;}
}
