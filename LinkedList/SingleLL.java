package LinkedList;

class Node_1
{
	public int data;
	public Node_1 next;
	
	public String toString()
	{
		return data+"";
	}
public static class SingleLL 
{
	public Node_1 head;
	public Node_1 tail;
	public int  size;
	
	public boolean isExistLL()
	{
		return head!=null;
	}
	public Node_1 CreateLL(int value)
	{
		Node_1 node =new Node_1();
		node.data=value;
		node.next=null;
		head=node;
		tail=node;
		size=1;
		return node;
	}
	public void InsertLL(int value,int location)
	{
		Node_1 node =new Node_1();
		node.data=value;
		if(!isExistLL())
		{
			System.out.println("Linked List doesnt exist");
		}
		else if(location==0)    //First
		{
			node.next=head;
			head=node;
		}
		else if(location>=size) //Last
		{
			tail.next=node;
			node.next=null;
			tail=node;
		}
		else                   // Insertion in Middle
		{
			Node_1 temp=head;
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
	if(!isExistLL())
	{
		System.out.println("LL Doesnt exist");
		return;
	}
	else
	{
		Node_1 temp=head;
		for(int i=1;i<=size;i++)
		{
			System.out.println(temp);
			temp=temp.next;
		}
		
	}
	}
	
	public void Search(int value)
	{
		Node_1 temp=head;
		for(int i=0;i<size-1;i++)
		{
			temp=temp.next;
			if(temp.data== value)
			{
				System.out.println("The value: "+value+ " is"+i);
			}
		}
	}
	public void delete(int location)
	{
		if(!isExistLL())
		{
			System.out.println("Linked List DOESNT Exist");
		}
		else if(location==0)
		{
			head=head.next;
			if(size==0)
			{
				tail=null;
			}
		}
		else if(location>=size)
		{
			Node_1 temp=head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
		}
		else
		{
			Node_1 temp=head;
			for(int i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		size=size-1;
	}
	public void deleteLL()
	{
		head=null;
		tail=null;
	}
	public static void main(String[] args)
	{
		SingleLL l=new SingleLL();
		l.CreateLL(5);
		l.InsertLL(10, 1);   //10--1
		l.InsertLL(20, 2);   
		l.InsertLL(30, 3);
		l.InsertLL(40, 4);
		l.InsertLL(50, 5);
		l.InsertLL(3, 1);
		l.InsertLL(4, 1);
		l.Traversal();
		l.Search(4);
		l.delete(1);
		l.Traversal();
		l.deleteLL();
		System.out.print(l.isExistLL());
	}
	}
}
