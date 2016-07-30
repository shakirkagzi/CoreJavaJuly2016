package loops;

public class UseFoorLoop {
	public static void main(String args[])
	{
		for(int i=0;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		
		int num =0;
		while(num<5)
		{
			System.out.println("\t"+num);
			num++;
		}
		
		do{
			num++;
			System.out.println("This is the do while code..");
		}while(num<0);
	}

}
