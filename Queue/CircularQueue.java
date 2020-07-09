package Queue;

public class CircularQueue {
	int[] arr;
	public int front,rear;
	public int size;
	
	public CircularQueue(int size)
	{
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
		this.size=size;
	}
	public boolean isFull()
	{
		if(front==0 && rear==size-1)
		{
			return true;
		}
		else if(rear+1==front)
		{
			return true;
		}
		return false;
	}
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			return true;
		}
		return false;
	}
	public void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else if(rear==size-1 && front!=0)
		{
			rear=0;
			arr[rear]=value;
		}
		else if(isEmpty())
		{
			front=0;
			arr[rear+1]=value;
			rear++;
		}
		else
		{
			arr[rear+1]=value;
			rear++;
		}	
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else if(front==rear)
		{
			System.out.println(arr[front]);
			front=rear=-1;
		}
		else if(front==arr.length-1)
		{
			System.out.println(arr[front]);
			front=0;
		}
		else
		{
			System.out.print(arr[front]);
			front++;
		}
	}
	public static void main(String[] args)
	{
		CircularQueue cqa =new CircularQueue(8);
		cqa.enqueue(10);
		cqa.enqueue(20);
		cqa.enqueue(30);
		cqa.enqueue(40);
		cqa.enqueue(50);
		cqa.enqueue(60);
		cqa.enqueue(70);
		cqa.enqueue(80);
		System.out.println();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.enqueue(90);
		cqa.enqueue(100);
		cqa.enqueue(110);
		cqa.enqueue(120);
		cqa.enqueue(120);
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		cqa.dequeue();
		System.out.println();
		cqa.dequeue();
		
	}

}
