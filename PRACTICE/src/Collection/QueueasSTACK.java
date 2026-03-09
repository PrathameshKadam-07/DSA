package Collection;

import java.util.Stack;

import Collection.CircularQueue.queue;

public class QueueasSTACK {
	static class queue{
		static Stack<Integer> s1 =new Stack<Integer>();
		static Stack<Integer> s2 =new Stack<Integer>();
		
//		ISEMPTY
		public static boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
//		Enqueu
		public static void add(int data)
		{
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(data);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		}
		
//		Dequeue
		public static int remove() 
		{
			if(!s1.isEmpty())
			{
				return s1.pop();
			}
			else
			{
				System.out.println("No element in the stack");
				return -1;
			}
		}
		
//		PEEk
		public static int peek() 
		{
			if(s1.isEmpty()) 
			{
				System.out.println("No elemet is present");
				return -1;
			}
		return s1.peek();
		}
	}//end of queue

	public static void main(String[] args)
	{
		queue q = new queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
	}
}
