import java.util.Scanner;
import java.lang.*;	
abstract class bus
{
	static Scanner sc=new Scanner(System.in);
	static int q1=0;
	static int q2=0;
	static int nseats=0;
	static int availseats =45;
	static int seatno=15;
	static int x1=0;
	static String name1="",name2="",name3="";
	static int age1=0,age2=0,age3=0;
	static int p1=0;
	static private int pin1 = 8888;
	int getpin()
	{
		return pin1;
	}
	abstract void ac(int a);
	abstract void nonac(int a);
	void seatSel()
	{
		System.out.println("\t\t\t\tSeats Available "+availseats);
		System.out.println("\t\t\t\tSelect Number of seats requeried: (MAX -3)");
		while(true)
		{
			q1=sc.nextInt();
			if(q1<=3)
				break;
			else
				System.out.print("\t\t\t\tMax Seats Limit Crossed Select Below 3\n\t\t\t\tPlease Select again: ");
		}
		nseats=q1;
		if(q1>0)
		{
			System.out.println("\t\t\t\tNo.of Seats Selected "+nseats);
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
				{
					System.out.print("\t\t\t\tEnter Name of  Passenger "+i+":");						
					name1 = sc.next();
					System.out.print("\t\t\t\tEnter Age of  Passenger "+i+":");
					age1 = sc.nextInt();
				}
				if(i==2)
				{
					System.out.print("\t\t\t\tEnter Name of  Passenger "+i+":");	
					name2 = sc.next();
					System.out.print("\t\t\t\tEnter Age of  Passenger "+i+":");
					age2= sc.nextInt();
				}
				if(i==3)
				{
					System.out.print("\t\t\t\tEnter Name of  Passenger "+i+":");	
					name3 = sc.next();
					System.out.print("\t\t\t\tEnter Age of  Passenger "+i+":");
					age3 = sc.nextInt();

				}
			}
		}
	}
	void pm()
	{
		System.out.print("\t\t\t\tPAYMENT MODE \n");
		System.out.println("\t\t\t\t1.UPIID \n\t\t\t\t2.NETBANKING \n\t\t\t\t3.Credit Card/Debit Card ");
		System.out.print("Enter your choice:");
		int p = sc.nextInt();
		switch(p)
		{
			case 1 :{	
					System.out.print("\n\t\t\t\tEnter UPI ID:");
					String s = sc.next();
					System.out.print("\t\t\t\tEnter UPI PIN:");
					int pin = sc.nextInt();
					p1=upi(pin);
					break;
				}
			case 2:{
					System.out.print("\t\t\t\tEnter BANKING ID:");
					String s1=sc.next();
					System.out.print("\t\t\t\tEnter PIN:");
					int pin1=sc.nextInt();
					p1=upi(pin1);
					break;
				}	
			case 3:{
					System.out.print("\t\t\t\tEnter CREDIT/DEBIT CARD NUMBER:");
					String s2=sc.next();
					System.out.print("\t\t\t\tEnter PIN:");
					int pin2=sc.nextInt();
					p1=upi(pin2);
					break;
				}
			default:{
					System.out.print("\t\t\t\tInvalid Choice");
					break;
				}
		}
	}
	int upi(int a)
	{
		if(a==pin1)
			return 1;
		else
			return 0;
	}
	void print(int k,int a,String s,int a1,int pr,int sc,int date)
	{
		System.out.println("\n\t\t\t\tTicket No : "+a);
		System.out.println("\t\t\t\tDate :"+date+"-10-2023"); 
		System.out.println("\t\t\t\tSeat Number :"+sc);
		System.out.println("\t\t\t\tName of Passenger "+k+" : "+s);
		System.out.println("\t\t\t\tAge "+" :"+a1);
		System.out.println("\t\t\t\tTicket Price : "+pr);	
	}
}
class guntur extends bus
{ 
	static int orangeseatprice=1500;
	static int kaveriseatprice=1750;
	static int umaseatprice=2500;
	static int meghaseatprice=550;
	static int jayanthiseatprice=650;
	static int maheshseatprice=750;
	static int ticketno=543240;
	//static int seatno=15;
	void ac(int a)
	{
		x1=a;
		System.out.println("\t\t\t\t\tThe Buses available  are\n");
		System.out.println("\t\t\t\t\tS.N0  Names         \tTypes       Price\tTiming\n");
		System.out.println("\t\t\t\t\t1.   Orange Travels\tSeater       1500 \t10:10");
		System.out.println("\t\t\t\t\t2.   Kaveri Travels\tSeater       1750 \t10:35");
		System.out.println("\t\t\t\t\t3.   Uma    Travels\tSleeper      2500 \t11:30\n");
		System.out.print("Enter ur choice :");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:orange();break;
			case 2:kaveri();break;
			case 3:uma();break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.println("\t\t\t\tThe Buses available are");
		System.out.println("\tS.N0  Names            \tTypes\tPrice\tTiming\n");
		System.out.println("\t 1.   Megha     Travels\tSeater          550 \t10:20");
		System.out.println("\t 2.   Jayanthi  Travels\tSeater          650 \t09:35");
		System.out.println("\t 3.   Mahesh    Travels\tSleeper         750 \t11:00\n");
		System.out.print("Enter ur choice :");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:megha();break;
			case 2:jayanthi();break;
			case 3:mahesh();break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	void orange()
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,orangeseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,orangeseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,orangeseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("\n\t\t\t\tPayment Successful ");
				System.out.println("\t\t\t\tTotal price of ticket "+(nseats*orangeseatprice));
			}
			else
				System.out.println("\n\t\t\t\tPayment Unsuccessful\n\t\t\t\tInvalid Valid Payment details");	
	}
	void kaveri()											//kaveri method
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,kaveriseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,kaveriseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,kaveriseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*kaveriseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");	

	}
	void uma()  												//umamethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,umaseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,umaseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,umaseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*umaseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");	
	}
	void megha()  												//meghamethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,meghaseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,meghaseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,meghaseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*meghaseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void jayanthi()  												//jayanthimethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,jayanthiseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,jayanthiseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,jayanthiseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*jayanthiseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void mahesh()  												//umamethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,maheshseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,maheshseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,maheshseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*maheshseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}

}
class kurnool extends bus
{
	static int morningstartseatprice=2500;
	static int yoloseatprice=2250;
	static int moonlightseatprice=4500;
	static int nareshseatprice=1250;
	static int poojaseatprice=1300;
	static int lakshmiseatprice=1500;
	static int ticketno=543240;
	void ac(int a)
	{
		x1=a;
		System.out.println("\t\t\t\tThe Buses available  are");
		System.out.println("\tS.N0  Names                  \tTypes\tPrice\tTiming\n");
		System.out.println("\t 1.   Morningstart    Travels\tSeater          2500 \t10:10");
		System.out.println("\t 2.   Yolo            Travels\tSeater          2250 \t10:35");
		System.out.println("\t 3.   Moonlight       Travels\tSleeper         4500 \t11:30\n");
		System.out.print("Enter ur choice :");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:morningstart();break;
			case 2:yolo();break;
			case 3:moonlight();break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.println("The Buses available  are");
		System.out.println("\t\tS.N0  Names            \t\tTypes\t\tPrice\t\tTiming\n");
		System.out.println("\t\t 1.   Naresh     Travels\t\tSeater          1250 \t\t10:20");
		System.out.println("\t\t 2.   Pooja      Travels\t\tSeater          1300 \t\t09:35");
		System.out.println("\t\t 3.   Lakshmi    Travels\t\tSleeper         1500 \t\t11:00\n");
		System.out.print("Enter ur choice :");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:naresh();break;
			case 2:pooja();break;
			case 3:lakshmi();break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	void morningstart()  												//morningstartmethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,morningstartseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,morningstartseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,morningstartseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*morningstartseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void yolo()  												//yolomethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,yoloseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,yoloseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,yoloseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*yoloseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");	
	}
	void moonlight()  												//moonlightmethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,moonlightseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,moonlightseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,moonlightseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*moonlightseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");	
	}
	void naresh()  												//nareshmethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,nareshseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,nareshseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,nareshseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*nareshseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void pooja()  												//poojamethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,poojaseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,poojaseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,poojaseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*poojaseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void lakshmi()  												//lakshmimethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,lakshmiseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,lakshmiseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,lakshmiseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*lakshmiseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");	
				
	}
}
class tenali extends bus
{
	static int morningstartseatprice=1500;
	static int orangeseatprice=1650;
	static int moonlightseatprice=2500;
	static int vamsiseatprice=650;
	static int purnaseatprice=800;
	static int sagarseatprice=750;
	static int ticketno=543240;
	void ac(int a)
	{
		x1=a;
		System.out.println("\t\t\t\tThe Buses available  are");
		System.out.println("\tS.N0  Names                  \tTypes\tPrice\tTiming\n");
		System.out.println("\t 1.   Morningstart    Travels\tSeater          1500 \t10:10");
		System.out.println("\t 2.   Orange          Travels\tSeater          1650 \t10:35");
		System.out.println("\t 3.   Moonlight       Travels\tSleeper         2500 \t11:30\n");
		System.out.print("Enter ur choice :");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:morningstart();break;
			case 2:orange();break;
			case 3:moonlight();break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	void nonac(int a)
	{
		x1=a;
		System.out.println("\t\t\t\tThe Buses available  are");
		System.out.println("\tS.N0  Names           \tTypes\tPrice\tTiming\n");
		System.out.println("\t 1.   Vamsi    Travels\tSeater          650 \t10:20");
		System.out.println("\t 2.   Purna    Travels\tSeater          800 \t09:35");
		System.out.println("\t 3.   Sagar    Travels\tSleeper         750 \t11:00\n");
		System.out.print("Enter ur choice :");
		int x=sc.nextInt();
		switch(x)
		{
			case 1:vamsi();break;
			case 2:purna();break;
			case 3:sagar();break;
			default:
				System.out.println("Invalid Choice");
		}
	}
	void morningstart()  												//morningstartmethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,morningstartseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,morningstartseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,morningstartseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*morningstartseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void moonlight()  												//moonlightmethod
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,moonlightseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,moonlightseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,moonlightseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*moonlightseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");
	}
	void orange()
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,orangeseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,orangeseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,orangeseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*orangeseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");	
	}
	void vamsi()
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,vamsiseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,vamsiseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,vamsiseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*vamsiseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");			
	}
	void purna()
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,purnaseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,purnaseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,purnaseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*purnaseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");			
	}
	void sagar()
	{
			seatSel();
			for(int i=1;i<=nseats;i++)
			{
				if(i==1)
					print(i,ticketno+=1,name1,age1,sagarseatprice,seatno+=1,x1);
				if(i==2)
					print(i,ticketno+=1,name2,age2,sagarseatprice,seatno+=1,x1);
				if(i==3)
					print(i,ticketno+=1,name3,age3,sagarseatprice,seatno+=1,x1);
			}
			pm();
			if(p1==1)
			{
				System.out.println("Payment Successful ");
				System.out.println("Total price of ticket "+(nseats*sagarseatprice));
			}
			else
				System.out.println("Payment Unsuccessful\nInvalid Valid Payment details");		
	}
}
class test 
{
	static Scanner sc=new Scanner(System.in);
	void display(bus obj )
	{
		System.out.println("\t\t\t\tChoose your pereferred date in October ");
		System.out.println("\t\t\t\t 2  3  4  5  6  7  8  9 10");
		System.out.println("\t\t\t\t11 12 13 14 15 16 17 18 19");
		System.out.println("\t\t\t\t20 21 22 23 24 25 26 27 28");
		System.out.println("\t\t\t\t29 30 31");
		System.out.println("Enter the date:");
		int date=sc.nextInt();
		if(date>=2 && date<=31)
		{
			System.out.println("\t\t\t\tChoose your preferred Bus");
			System.out.println("\t\t\t\t1.A.C or 2.NONA.C");
			System.out.print("Enter your choice:");
			int x=sc.nextInt();
			switch(x)
			{
				case 1: obj.ac(date);break;
				case 2: obj.nonac(date);break;	
				default:System.out.println("Invalid Choice");
			}
		}
		else
			System.out.print("Invalid Range Date");
	}
	public static boolean mailvalidation(String s){
		int k=0;
		if( !(s.charAt(0)>='a' && s.charAt(0)<='z') && !(s.charAt(0)>='A' && s.charAt(0)<='Z'))
		{
			k=1;
			
		}
		else
		{
			if(!(s.length()>=15 && s.length()<=25))
			{
				k=1;
			}
			else
			{
				
				int c=-1;
				String ID="";
				for(int i=0;i<s.length();i++)
    				{
					c++;
					if(s.charAt(i)=='@')
					{
						ID=s.substring(0,c);
						break;
					}
				}
				
				int d=-1;
				String Domain="";
				for(int i=0;i<s.length();i++)
				{
					d++;
					if(s.charAt(i)=='.')
					{
						Domain=s.substring(c+1,d);
						break;
					}
				}
				String Extension=s.substring(d+1,s.length());
				if(!(s.charAt(c)=='@'))
				{
					k=1;
				}
				else
				{
					if( !(ID.charAt(0)>='a' && ID.charAt(0)<='z') && !(ID.charAt(0)>='A' && ID.charAt(0)<='Z'))
					{
						k=1;
					}
					else if( !(ID.charAt(ID.length()-1)>='a' && ID.charAt(ID.length()-1)<='z') && !(ID.charAt(ID.length()-1)>='A' && ID.charAt(ID.length()-1)<='Z'))
					{
						k=1;
					}
					else
					{
						for(int i=0;i<ID.length();i++)
	                    			{
							if( !(ID.charAt(i)>='a' && ID.charAt(i)<='z') && !(ID.charAt(i)>='A' && ID.charAt(i)<='Z') && !(ID.charAt(i)=='_') && !(ID.charAt(i)=='.'))
							{
								k=1;
								break;
							}
						}
						if(!(s.charAt(d)=='.'))
						{
							k=1;
						}
						else
						{
							for(int i=0;i<Domain.length();i++)
	                    				{
								if( !(Domain.charAt(i)>='a' && Domain.charAt(i)<='z') && !(Domain.charAt(i)>='A' && Domain.charAt(i)<='Z') && !(Domain.charAt(i)>='0') && !(Domain.charAt(i)<='9'))
								{
									k=1;
									break;
								}
							}
				
							for(int i=0;i<Extension.length();i++)
	                    				{
								if( !(Extension.charAt(i)>='a' && Extension.charAt(i)<='z') && !(Extension.charAt(i)>='A' && Extension.charAt(i)<='Z'))
								{
									k=1;
									break;
								}
							}
						}
					}
					
				}
			}
		}	
   		if(k==0)
    		{
        		return true;
    		}
    		else 
    		{
        		return false;
    		}
	}
	public static void main(String []args)
	{
		System.out.println("\t\t\t\t\t\t\tONLINE BUS TICKET BOOKING\n");
		System.out.println("\n\t\t\t\t\t\t\tWELCOME RED BUS TICKET RESERVATION\n\n");
		test obj = new test();
		
		int i1=0;
		while(i1<=3){
			System.out.println("\t\t\t\t Enter your Email Id : ");
			String mail=sc.nextLine();
			boolean validate=mailvalidation(mail);
			if(validate){
				System.out.println("Email verfication is done.");
				int otp=(int)(Math.random()*10000);
				System.out.println("OTP : "+otp);
				System.out.println("Enter OTP send your Email : ");
				int x=sc.nextInt();
				if(x==otp){
					test obj1=new test();
					guntur obj2=new guntur();
					kurnool obj3=new kurnool();
					tenali obj4=new tenali();
					System.out.println("\t\t\t\tThe Buses Travelling Today \n");
					System.out.println("\t\t\t\t1.Hydrebad - Guntur");
					System.out.println("\t\t\t\t2.Hydrebad - Kurnool");
					System.out.println("\t\t\t\t3.Hydrebad - Tenali");
					System.out.println("Enter your choice:");
					int x1=sc.nextInt();
					switch(x1)
					{
						case 1:
							obj1.display(obj2);break;
						case 2:
							obj1.display(obj3);break;
		
						case 3:
							obj1.display(obj4);break;
						default:
							System.out.print("Invalid Choice");
					}
					System.exit(1);
				}
				else{
					System.out.println("Invalid OTP,Please try later ");
					System.exit(1);
				}
			}
			else{
				System.out.println("Invalid Email ");
				i1++;
				if(i1==3){
					System.out.println("Maximum trails completed ");
					System.exit(1);
				}		
				System.out.println("Please try again ");

			}
		}
	}
}
		
	
