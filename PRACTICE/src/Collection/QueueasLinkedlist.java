package Collection;

import Collection.CircularQueue.queue;

public class QueueasLinkedlist {
	 static class Node
	 {
		int data = 0;
		Node next ; 
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	 }
	
	static class queue
	{
		static Node head = null;
		static Node tail = null;

//		ISEMPTY
		public static boolean isEmpty()
		{
			return head == null && tail == null;
		}
		
//		Enqueu
		public static void add(int data)
		{
			Node newNode =new Node(data);
			if(tail == null)
			{
				head = tail = newNode;
				return;
			}
			
			tail.next = newNode;
			tail = newNode;
		}
		
//		Dequeue
		public static int remove() 
		{
			if(isEmpty()) 
			{
				System.out.println("No element present");
				return -1;
			}
			
			if(head == tail)
			{
				tail =null;
			}
			
			int front = head.data;
			head = head.next;
			
			return front;
		}
		
//		PEEk
		public static int peek() 
		{
			if(isEmpty()) 
			{
				System.out.println("No elemet is present");
				return -1;
			}
		return head.data;
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
