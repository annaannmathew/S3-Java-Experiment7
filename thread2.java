import java.util.Scanner;
class odd extends Thread
{
    public void run()
    {
  	for(int i=1;i<=100;i+=2)
  	{
   	    System.out.print(i+",");
  	}
    }
}
class even extends Thread
{
    public void run()
    {
  	for(int i=2;i<=100;i+=2)
  	{
   	    System.out.print(i+",");
  	}
    }
}
class thread2
{
    public static void main(String args[])
    {
  	odd t1 = new odd();
  	even t2=new even();
  	System.out.println("ODD NUMBERS:");
  	t1.start();
  	try
	{
  	    t1.join();
  	    System.out.println("\nEVEN NUMBERS:");
  	    t2.start();
  	}
  	catch(Exception e)
  	{
	    System.out.println(e);
	}
    }
}