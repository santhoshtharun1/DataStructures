package LinkedList;

class Node_3
{
	public int data;
	public Node_3 prev;
	public Node_3 next;
	
	public String toString()
	{
		return data+" ";
	}
}
public class DoubleLL {
	
	public Node_3 head;
	public Node_3 tail;
	public int size;
	
	public boolean isExistDLL()
	{
		return head!=null;
	}
	
	public void createDLL(int value)
	{
		Node_3 node  =new Node_3();
		node.data=value;
		node.next=null;
		node.prev=null;
		head=node;
		tail=node;
		size=1;
	}
	public void insertDLL(int value,int location)///
	{
		Node_3 node=new Node_3();
		node.data=value;
		if(!isExistDLL())
		{
			System.out.println("Not Exist");
		}
		else if(location==0)
		{
			
			node.prev=null;
			node.next=head;
			head.prev=node;
			head=node;
		}
		else if(location>=size)
		{
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		else
		{
			Node_3 temp =head;
			for(int  i=0;i<location-1;i++)
			{
				temp=temp.next;
			}
			node.prev=temp;
			node.next=temp.next;
			
			temp.next=node;
			node.next.prev=node;
		}
		size=size+1;
	}
	public void Traversal()
	{
		if(!isExistDLL())
		{
			System.out.println("Not exist");
		}
		else
		{
		Node_3 temp=head;
		for(int i=1;i<=size;i++)
		{
			System.out.println(temp);
			if(i!=size)
			{
				System.out.print("-->");
			}
			temp=temp.next;
		}
		}
	}
	public void reverse()
	{
		Node_3 temp=tail;
		for(int i=1;i<=size;i++)
		{
			System.out.println(temp);
			if(i!=size)
			{
				System.out.print("<--");
			}
			temp=temp.prev;
		}
	}
	
	public void searchDLL(int value)
	{
		if(!isExistDLL())
		{
			System.out.println("Not exist");
		}
		else
		{
			Node_3 temp =head;
			for(int i=1;i<=size-1;i++)
			{
				temp=temp.next;
				if(temp.data==value)
				{
					System.out.println("The value is : "+value+" at "+i);
				}
			}
		}
	}
	public void delete(int location)
	{
		if(!isExistDLL())
		{
			System.out.println("Not exist");
		}
		else if(location==0)
		{
			head=head.next;
			head.prev=null;
			if(size==0)
			{
				tail=head=null;
			}
		}
		else if(location>=size)
		{
			tail=tail.prev;
			tail.next=null;
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
		DoubleLL l =new DoubleLL();
		l.createDLL(5);
		l.insertDLL(1, 10);
		l.insertDLL(2, 30);
		l.insertDLL(3, 50);
		l.Traversal();
		l.reverse();
		l.searchDLL(30);
		l.delete(3);
		l.Traversal();
		l.delete(1);
		l.Traversal();
	}

}
