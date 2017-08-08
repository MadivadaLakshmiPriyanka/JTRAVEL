class Bus
{
	private String number;
	private String source;
	private String destination;
	private int seats;
	private String driverName;
	private double ticketPrice;
	public Bus(String number,String source,String destination,int seats,String driverName,double ticketPrice)
	{
		this.number=number;
		this.source=source;
		this.destination=destination;
		this.seats=seats;
		this.driverName=driverName;
		this.ticketPrice=ticketPrice;
	}
	public String getNumber()
	{
		return number;
	}
	public String getSource()
	{
		return source;
	}
	public String getDestination()
	{
		return destination;
	}
	public int getSeats()
	{
		return seats;
	}
	public String getDriverName()
	{
		return driverName;
	}
	public double getTicketPrice()
	{
		return ticketPrice;
	}
	public void SetNumber(String number)
	{
		this.number=number;
	}
	public void setSource(String source)
	{
		this.source=source;
	}
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
	public void setSeats(int seats)
	{
		this.seats=seats;
	}
	public void setDriverName(String driverName)
	{
		this.driverName=driverName;
	}
	public void setTicketPrice(double ticketPrice)
	{
		this.ticketPrice=ticketPrice;
	}
}
