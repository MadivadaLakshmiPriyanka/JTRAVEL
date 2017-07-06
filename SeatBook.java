import java.util.*;
public class SeatBook{
	public static void main(String args[])
	{
		char [][] a={{'e','e','e'},{'e','e','e'},{'e','e','e'}};
		Scanner obj=new Scanner(System.in);
		int opt=0;
		int i=0,j=0;
		while(opt!=3)
		{
			System.out.println("Enter an option");
			System.out.println(" ");
			opt=obj.nextInt();
			switch(opt)
			{
			case 0:System.out.println("Show the seats");
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						System.out.println(a[i][j]+" ");
					}
					System.out.println(" ");
				}
				break;
			case 1:System.out.println("Enter row number");
			int r=obj.nextInt();
			System.out.println("Enter col numbers");
			int c=obj.nextInt();
			if(a[r][c]=='e')
			{
				a[r][c]='b';
				System.out.println("Seats booked");
			}
			
			else
			{
				System.out.println("Already booked");
			}
			break;
			case 2:System.out.println("Enter row");
			int r1=obj.nextInt();
			System.out.println("Enter col");
			int c1=obj.nextInt();
			if(a[r1][c1]=='b')
			{
				a[r1][c1]='c';
				System.out.println("Tickets Cancelled");
			}
			else
			{
				System.out.println("Tickets not booked");
			}
			break;
			case 3:System.out.println("Tickets not booked");
			break;
			default:System.out.println("Enter correct option");
			}
		}
}
}
