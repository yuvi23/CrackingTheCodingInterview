import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class IsUnique {


	public static void main(String[] args){
		//creating an array of length of ascii value of Z
		char z='z';
		int val=0;
		int count=5;
		int[] check=new int[(int)z];
		String s="abc";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			val=(int)ch[i];
			//System.out.println(val);
			if(check[val]==0){
				check[val]=1;
				
			}
			else{
				System.out.println("Duplicate String");
				count=0;
			    break;
			    }
			
		}
		if(count!=1){
			System.out.println("String doesn't contain duplicate");
		}
		
		    
		
	}


}