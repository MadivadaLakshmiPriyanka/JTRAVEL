
class MainBus
{
	public static void main(String args[])
	{
		Bus[] b=new Bus[3];
		b[0]=new Bus("MP01","HYD","VJA",30,"PRINCE",500);
		b[1]=new Bus("MP02","PUNE","HYD",30,"MAHESH",600);
		b[2]=new Bus("MP03","BANGALORE","VJA",30,"BABU",350);
		getBusBelowticketPrice(b,550);
		getBusNumber(b,"HYD");
		getDetails(b,"BANGALORE","VIJAYAWADA");
	}
	public static void getBusBelowticketPrice(Bus[] buses,double price)
	{
		for(int i=0;i<buses.length;i++)
		{
			if(buses[i].getTicketPrice()<=price)
			{
				System.out.println(buses[i].getNumber()+" "+buses[i].getSource());
			}
		}
	}
	public static void getBusNumber(Bus[] buses,String source)
	{
		for(int i=0;i<buses.length;i++)
		   {
				System.out.println(buses[i].getNumber()+" "+buses[i].getDestination());
			}
		
	}
	public static void getDetails(Bus[] buses,String source,String destination)
	{
		for(int i=0;i<buses.length;i++)
		   {
			  System.out.println(buses[i].getNumber()+" "+buses[i].getDriverName());
			}
		
	}
}