package Collection;

public class QueueDemo {
static class queue{
	static int arr[];
	static int size;
	static int rear = -1;
	
	queue(int n)
	{
		arr = new int[n];
		this.size = n;
	}

//	ISEMPTY
	public static boolean isEmpty()
	{
		return rear == -1;
	}
	
//	Enqueu
	public static void add(int data)
	{
		if(rear == size-1) 
		{
			System.out.println("Full queue");
			return;
		}
		
		rear++;
		arr[rear] = data;
	}
	
//	Dequeue
	public static int remove() 
	{
		if(isEmpty()) 
		{
			System.out.println("No element present");
			return -1;
		}
		
		int front = arr[0];
		for(int i = 0;i<rear;i++)
		{
			arr[i] = arr[i+1];
		}
		rear--;
		return front;
	}
	
//	PEEk
	public static int peek() 
	{
		if(isEmpty()) 
		{
			System.out.println("No elemet is present");
			return -1;
		}
	return arr[0];
	}
}//end of queue

public static void main(String[] args)
{
	queue q = new queue(5);
	q.add(10);
	q.add(15);
	q.add(20);
	
	while(!q.isEmpty()) {
		System.out.println(q.peek());
		q.remove();
	}
}
}//end of main class
