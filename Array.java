import java.util.*;
public class Array 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[50]; 
		System.out.println("Enter Number of Elements : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			array[i] = sc.nextInt();
		}
		int i = 0;
		while(i < n)
		{
			System.out.println(array[i]);
			i++;
		}

	}

}