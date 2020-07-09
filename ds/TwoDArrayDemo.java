package ds;

public class TwoDArrayDemo {
	int[][] arr=null;
	public TwoDArrayDemo(int row,int col)
	{
		this.arr=new int[row][col];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;i++)
			{
				arr[i][j]=Integer.MIN_VALUE;
			}
		}
	}
	public void traverse()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr[0].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		}
	}
	

}

class TwoDArrayDemoMain
{
public static void main(String [] args)
{
	TwoDArrayDemo td=new TwoDArrayDemo(2,2);
	System.out.println("Creating an array of 5*5");
	System.out.println();
	System.out.println("Creating a traverse Array");
	td.traverse();
}
}

