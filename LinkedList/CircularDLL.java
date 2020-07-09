package LinkedList;

 class Node_4
{
	 public int data;
	 public Node_4 prev;
	 public Node_4 next;
	 
	 public String toString()
	 {
		 return data+"";
	 }
}

public class CircularDLL {
	public Node_4 head;
	public Node_4 tail;
	public int size;
	
	public boolean isExistCDLL()
	{
		return head!=null;
	}
	public void createCDLL(int value)
	{
		Node_4 node =new Node_4();
		node.data=value;
		node.prev=node;
		node.next=node;
		
		head=node;
		tail=node;
		size=1;
	}
	public void insertCDLL(int location,int value)
	{
		Node_4 node=new Node_4();
		node.data=value;
		if(!isExistCDLL())
		{
			System.out.println("LL Doesnt exist");
		}
		else if(location==0)
		{
			node.prev=tail;
			node.next=head;
			
			head.prev=node;
			tail.next=head;
			head=node;
		}
		else if(location>=size)
		{
			node.next=head;
			node.prev=tail;
			tail.next=node;
			head.prev=node;
			tail=node;
		}
		else
		{
			Node_4 temp = head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			node.prev=temp;
			temp.next=node;
			node.next.prev=node;
		}
		size=size+1;
	}
	public void traversal()
	{
		Node_4 temp=head;
		for(int i=0;i<size;i++)
		{
			System.out.println(temp);
			temp=temp.next;
		}
	}
	public void search(int value)
	{
		Node_4 temp=head;
		for(int i=1;i<=size;i++)
		{
			temp=temp.next;
			if(temp.data==value)
			{
				System.out.println("The value is : "+value+"location : "+i);
			}
		}
	}
	public void reverse()
	{
		Node_4 temp=tail;
		for(int i=0;i<size;i++)
		{
			System.out.println(temp);
			temp=temp.prev;
		}
	}
	public void delete(int location)
	{
		if(!isExistCDLL())
		{
			System.out.println("CDLL not exist");
		}
		else if(location==0)
		{
			head=head.next;
			head.prev=tail;
			tail.next=head;
		}
		else if(location>=size)
		{
			tail=tail.prev;
			tail.next=head;
			head.prev=tail;
		}
		else
		{
			Node_4 temp=head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
		size=size-1;
	}
	
	public static void main(String[] args)
	{
		CircularDLL l=new CircularDLL();
		l.createCDLL(2);
		l.insertCDLL(1, 30);
		l.insertCDLL(2, 50);
		l.insertCDLL(3, 20);
		l.insertCDLL(4, 40);
		l.traversal();
		l.reverse();
		l.delete(2);
		l.traversal();
		l.search(30);
	}
}

