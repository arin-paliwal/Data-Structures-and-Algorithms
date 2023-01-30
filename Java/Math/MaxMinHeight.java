import java.util.*;
import java.lang.Math;
class MaxMinHeight
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int test;
		test=sc.nextInt();
		while(test-->0)
		{
		    int base,side;
		    base=sc.nextInt();
		    side=sc.nextInt();
		    base*=base;
		    side*=side;
            System.out.println("side and base"+side+" "+base);
		    double min=Math.sqrt(side-base);
		    double max=Math.sqrt(base+side);
		    System.out.print(min+" "+max);
		}
        sc.close();
	}
}
