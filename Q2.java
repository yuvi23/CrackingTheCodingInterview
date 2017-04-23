import java.util.Arrays;

public class Q2 
{
	public static void main(String args[])
	{	
		int count=0;
		String a = "Yuvraj";
		String b = "Yuvj";
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if(a.toCharArray().length != b.toCharArray().length)
		{
			//System.out.println("They are not permutation");
			//goto;
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
					count++;
					continue;
				}
				else
				{	
					
					break;
				}
			}
		}
		
		if(count != 0)
		{
			System.out.println("They are permutation");
		}
		else
		{
			System.out.println("They are not permutation");
		}
	}
}
