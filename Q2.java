import java.util.Arrays;
import java.util.Scanner;

public class Permut 
{
	public static void main(String args[])
	{	
		int count=0;
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(a.toCharArray().length != b.toCharArray().length)
		{
			//System.out.println("They are not permutation");
			//goto;
			count++;
		}
		else
		{
			char[] a1 = a.toCharArray();
			char[] b1 = b.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(b1);
			
			for(int i = 0 ; i < a1.length ; i++)
			{
				if(a1[i] == b1[i])
				{	
					
					continue;
				}
				else
				{	
					count++;
					break;
				}
			}
		}
		
		
		if(count == 0)
		{
			System.out.println("They are permutation");
		}
		else
		{
			System.out.println("They are not permutation");
		}
	}
}
