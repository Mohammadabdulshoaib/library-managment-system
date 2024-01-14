import java.util.ArrayList;
import java.util.Scanner;
interface payment{

	static Scanner sc=new Scanner(System.in);
	void payment();
	void upid();
}
class bank implements payment
{      	
	static String username2="shoaib";
	static int pin2=1234;
	static double sum2=0;
	public static void sum(double sum){
		sum2=sum;
	}
	public void payment()
	{
		System.out.println("Enter your name");	
	 	String username3=sc.next();
		if(username.equals(username3))
		{
			System.out.println("enter the pin");
			int pin3=sc.nextInt();
			if(pin2==pin3)
			{	
				System.out.println("enter the amount "+sum2);
				int amount1=sc.nextInt();
				if(sum2==amount1)
				{
					System.out.println("transaction successful.!");
					   menu obj=new menu();
					   obj.main();
				}
				else
				{
					System.out.println("transaction failed !");
					payment();
				}
			}
			else
			{
				System.out.println("enter the valid pin");
			}

		}
		else
		{
			System.out.println("Enter the valid name");
			payment();
		}
   	}
	static String username="shoaib";
	static int upid=12345;
	static int pin=1234;
	int sum1=200;
	
	public void upid()
	{ 
	 
		System.out.println("Enter your name");	
	 	String username1=sc.next();
		if(username.equals(username1))
		{
			System.out.println("enter the upiid");
			int upid1=sc.nextInt();
			if(upid1==upid)
			{
			}
			else
			{
				System.out.println("Enter the valid upid");
				System.out.println("Transaction failed");
				upid();
			}
			System.out.println("enter the pin ");
			int pin1=sc.nextInt();
			
			if(pin1==pin)
			{
				System.out.println("enter the amount ");
				int amount=sc.nextInt();
				if(sum2==amount)
		        {
        		    System.out.println("transaction successful.!");
				  menu obj=new menu();	
				obj.main();
        		}
        		else
        		{
            		System.out.println("transaction failed !");
            		upid();
        		}
		    }
    		else
    		{
        		System.out.println("enter the valid pin");
        		upid();
    		}
    	}
    	else
    	{
        	System.out.println("Enter the valid name");
        	payment();
    	}
    }
}
class Membership
{
	private String name="shoaib";
	private String phonenumber="6301567009";
	static String name1="";
	String phonenumber1="";
	static int d=0;
	Membership()
	{
	if((getName().equalsIgnoreCase(name1)) && (getphonenumber().equals(phonenumber1)))
		{
	        d=1;
		}	
	}
	String getName()
	{
		return name;
	}
	String getphonenumber()
	{
		return phonenumber;
	}
	Membership(String name,String phonenumber)
	{
		this.name1=name;
		this.phonenumber1=phonenumber;
	}
}
class Bookstore extends Membership
{ 
	static Scanner sc=new Scanner(System.in); 
	public static ArrayList<String> book = new ArrayList<String>();
	public static ArrayList<Integer> price = new ArrayList<Integer>();
	//public static ArrayList<String> book1= book;
	static double sum=0;
	 
	void exit(int a)
	{
	System.exit(0);
	}

	void addbook()   //method1
	{
	 
	System.out.println("----------------------------------------------------enter the book name------------------------------------------------------------");
	String s=sc.next();
	int l=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{    l=0;
				System.out.println("enter the valid name.!");
				break;
			}
		}
          	 if(l!=0)
		{       s=sc.next();
			book.add(s);
			//System.out.println("--------------------------------------------Book added successfully--------------------------------------------------");
		}
	 
	
		System.out.println("------------------------------------------------enter the price of the book-------------------------------------------");
		int d=sc.nextInt();
		if(d>0)
		{
		price.add(d);
		book.add(s);
		System.out.println("-----------------------------------------------Book added successfully--------------------------------------------");
		}

	}


	static void showavailablebooks()
	{
	Bookstore ob=new Bookstore();
	
	//ob.showallbooks();
	System.out.println("--------------------------------------------Not Available books --------------------------------------------");
	System.out.println("Books...............Maths         Physics           Chemistry       English");
	System.out.println();
	System.out.println("status..............NotAvailable  Not Available     Not Available   Not Available ");
	System.out.println("------------------------------------------------------------------------------------------------------------");
	System.out.println();
	System.out.println("Books............"+book);
	System.out.println();
	System.out.println("prices..........."+price);
	
	
	}
   
	public static ArrayList<String> borrowBook = new ArrayList<String>();
	  public static ArrayList<Double> borrowPrice = new ArrayList<Double>();
	//System.out.println("Enter the bookname you want to borrow");
	static String b1="";
	static void borrowbook() //method3
	{
	//showavailablebooks();
	System.out.print("---------------------Enter the bookname you want to borrow----------------------------------");
	b1=sc.next();
	int l=0;
	int z=0;
       
	for(int i=0;i<book.size();i++)
	{
		if(b1.equals(book.get(i)))
		{
		l=i;
		z=1;
		double p1=price.get(l);
	        borrowPrice.add(p1);
		borrowBook.add(b1);
		book.remove(i);
		price.remove(i);
		break;
		}
	
	}
        if(z==0)
        {
          System.out.println("enter valid bookname");
		borrowbook();
        }
	System.out.println(".....................Borrowed books"+borrowBook+".........................");
	System.out.println(".........................Borrowed book price"+borrowPrice+".......................");
	System.out.println(".................................Total no of books borrowed  "+borrowBook.size()+"..............................");
	double sum=0;

	for(int i=0;i<borrowPrice.size();i++)
	{
	  sum=sum+borrowPrice.get(i);
	}
	if(d==1)
	{	
		int k=borrowBook.size();
		k=k*10/100;
		sum=sum-k;
		System.out.println("total money you need to pay "+sum);
	
		bank.sum(sum);
		
		payment obj=new bank();
		System.out.println("choose any one option to pay ");
		System.out.println("1.paytm");
		System.out.println("1.UPIID");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
		obj.upid();
		}

		else if(n==2)
		{
			obj.payment();
		}
		else
		{
			System.out.println("choose valid payment option");
		}
	}
	else
	{
	System.out.println("total money you need to pay "+sum);
	
	bank.sum(sum);
		payment obj=new bank();
		System.out.println("choose any one option to pay ");
		System.out.println("1.paytm");
		System.out.println("1.UPIID");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
			obj.upid();
		else if(n==2)
		{
			obj.payment();
		}
		else
		{
			System.out.println("choose valid payment option");
		}
	}
}	
void returnbook()
	{
		System.out.println("Enter the book name you want to return ");
		String r=sc.next();
		int k=0,bk=0;
	for(int i=0;i<borrowBook.size();i++)
	{
	 	if(r.equals(borrowBook.get(i)))
		 
		{  k=1;
		System.out.println("-----------------Returned book successfully-----------------------");
		borrowBook.remove(b1);
		bk=i;
		borrowPrice.remove(i);
		
		}	
	}
	if(k==0)
	{
	System.out.println("Return the valid book");
	returnbook();
	}
}
	 	



class menu extends Bookstore
{     
public void main()
{    
	System.out.println("--------------------------------------------------------------");
	System.out.println("----------------------------------------Welcome to Library Management Application---------------------------");
	System.out.println();
	System.out.println();
	System.out.println("Enter your choice !");
	System.out.println();
	System.out.println("1.Add Bookln\n");
			System.out.println("2.Show Available Books");
			System.out.println("3.Borrow Bookln");
			System.out.println("4.Return Book");
			System.out.println("5.Exit");
	int a=sc.nextInt();
	switch (a)
		{
		case 1:
			{
			addbook();
			main();
			break;
			}
		
		case 2:
			{
			showavailablebooks();
			main();
			break;	
			}
		case 3:
			{
			borrowbook();
			main();
			break;
			}
		case 4: 
			{
			returnbook();
			main();
			break;
			}
		case 5:
			{
			System.exit(0);
			break;
			}
		default :
			{
			System.out.println("please! enter the valid number ");
			System.out.println("--------------------------------------------------------------");
			main();
			break;
			}
		}

	}
}
}
class library extends menu
{	 
	public static void main(String[] args)
	{	
	
	System.out.println("------------------------------enter your name------------------------");
	String n=sc.next();
	int z=0;
	for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(!(ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{    z=1;
				System.out.println("--------------------------------enter   the valid name.!-------------------------------------");
				break;
			}
		}
	if(z==1)
	{
	   n=sc.next();
	}
	System.out.println("---------------------------enter your phone number------------------------");
	String p=sc.next();
	new Membership(n,p);	
	library obj1=new library();
	
	obj1.main();
}
}
