package LinkedList;

class Node_2
{
public int data;
public Node_2 next;

public String toString()
{
	return data+" ";
}
}
public class CircularLL {

	public Node_2 head;
	public Node_2 tail;
	public int size;
	
	public boolean isExistCLL()
	{
		return head!=null;
	}
	
	public void createCLL(int value)
	{
		Node_2 node =new Node_2();
		node.data=value;
		node.next=node;
		head=node;
		tail=node;
		size=1;
	}
	public void insertCLL(int location,int value)
	{
		Node_2 node =new Node_2();
		node.data=value;
		if(!isExistCLL())
		{
			System.out.println("LL Doesnt exist");
			return;
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
			tail.next=node;
		}
		else if(location>=size)
		{
			node.next=head;
			tail.next=node;
			tail=node;
		}
		else
		{
			Node_2 temp=head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
		size=size+1;
	}
	public void Traversal()
	{
		Node_2 temp=head;
		for(int i=1;i<=size;i++)
		{
			System.out.print(temp);
			if(i!=size)
			{
				System.out.print("-->");
			}
			temp=temp.next;
		}
		System.out.println();
	}
	public void search(int value)
	{
		Node_2 temp=head;
		for(int i=1;i<=size;i++)
		{
			temp=temp.next;
			if(temp.data==value)
			{
				System.out.println("The value is "+value+"at : "+i);
			}
		}
		
	}
	public void delete(int location)
	{
		if(!isExistCLL())
		{
			System.out.println("LL Doesnt Exist");
		}
		else if(location==0)
		{
			
			head=head.next;
			tail.next=head;
		}
		else if(location>=size)
		{
			Node_2 temp=head;
			for(int i=0;i<size-1;i++)
			{
				temp=temp.next;
			}
			temp.next=head;
			tail=temp;
		}
		else
		{
			Node_2 temp=head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		size=size-1;
	}
	public void deleteCLL()
	{
		head=tail=null;
	}
	
	public static void main(String[] args)
	{
		CircularLL l=new CircularLL();
		l.createCLL(0);
		
		l.insertCLL(1, 10);
		l.insertCLL(2, 20);
		l.insertCLL(3, 30);
		l.insertCLL(4, 40);
		l.insertCLL(5, 50);
		l.insertCLL(6, 60);
		l.Traversal();
		l.search(30);
		l.search(70);
		l.insertCLL(22,852);
		l.Traversal();
		l.insertCLL(21, 52);
		l.Traversal();
		//l.deleteCLL();
		System.out.println(l.isExistCLL());
	}
	
}

