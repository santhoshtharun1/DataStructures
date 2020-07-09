package ds;

public class OneDArray 
{
int arr[]=null;

public OneDArray(int sizeOfArray)
{ 
	arr=new int[sizeOfArray];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=0;
	}
	
}
public void traverseArray()
{
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
}								//0,            10
								//1,            20
								//2,            30
public void ValueTobeInserted(int location,int valueToBeInserted)
{
	try
	{
	if(arr[location]==0)
	{
		arr[location]=valueToBeInserted;
		System.out.println("Successfully Inserted"+ valueToBeInserted +"at Location" +location);
	}
	else
	{
		System.out.println();
		System.out.println("The value is already Occupied");
	}
	}
	catch(Exception e)
	{
		System.out.println("Location is not available at particular location");
		System.out.println();
	}
}
public void accessValue(int cellNumber)
{
	System.out.println("Access the value:" + arr[cellNumber]);
}
									//10 0
									//20 1 arr[2]=0
									//30 2
public void searchValue(int valueToBeSearched)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==valueToBeSearched)
		{
			System.out.println("Value Found....");
			System.out.println(" ValueToBeSearched : "+ valueToBeSearched+" Value at " + i);
		}
	}
}
                              //2
public void deleteValue(int valueTobeDeleted)
{
	arr[valueTobeDeleted]=0;
}

public void deleteAll()
{
	arr=null;
}

}
class OneDArrayMain
{
	public static void main(String[] args)
	{
		OneDArray o =new OneDArray(10);
		System.out.println("The Size of array is 10");
		System.out.println();
		System.out.println("Printing the array");
		
		o.traverseArray();
		System.out.println();
		System.out.println();
		System.out.println("Inserting values");
		
		o.ValueTobeInserted(0,10);
		o.ValueTobeInserted(1,100);
		o.ValueTobeInserted(2,150);
		o.ValueTobeInserted(3,200);
		o.ValueTobeInserted(4,250);
		o.ValueTobeInserted(5,300);
		o.ValueTobeInserted(6,350);
		o.ValueTobeInserted(7,400);
		o.ValueTobeInserted(8,100);
		o.ValueTobeInserted(1,100);
		o.ValueTobeInserted(15,522);
		System.out.println(); System.out.println();
		
		o.accessValue(5);
		System.out.println();
		o.searchValue(250);
		System.out.println();
		
		System.out.println("Before Deleting:");
		o.traverseArray();
		System.out.println();
		System.out.println("After Deletion");
		o.deleteValue(6);
		o.traverseArray();
		
		
	}
	}
