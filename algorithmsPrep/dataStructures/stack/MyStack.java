package algorithmsPrep.dataStructures.stack;

public class MyStack<T> {

	Object[] arrayStack;
	int size;
	int top;

	public MyStack(int size) {
		this.size = size;
		this.top = -1;
		arrayStack = new Object[this.size];
	}

	public void push(T item)
	{
		if (isfull())
		{
			System.out.println("Whoa there! the stack is full!");
		}
		else
		{
			top += 1;
			arrayStack[top] = item;
		}
	}

	@SuppressWarnings("unchecked")
	public T pop()
	{
		if (isEmpty())
		{
			System.out.println("Whoa there! the stack is empty!");
			return null;
		}

		T value = (T) arrayStack[top];
		arrayStack[top] = null;
		top -= 1;
		
		return value;
	}

	public boolean isfull()
	{
		return ((size - 1) == top);
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	public int getTop()
	{
		return top;
	}

	public void setTop(int top)
	{
		this.top = top;
	}

}
