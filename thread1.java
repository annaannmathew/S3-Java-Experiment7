import java.util.Scanner;
class square extends Thread
{
    int x;
    square(int x)
    {
  	this.x=x;
    }
    public void run()
    {
  	System.out.println("Thread-2:Square of "+x+" is "+(x*x));
    }	
}
class cube extends Thread
{
    int x;
    cube(int x)
    {
  	this.x=x;
    }
    public void run()
    {
  	System.out.println("Thread-3:Cube of "+x+" is "+(x*x*x));
    }
}

class thread1 extends Thread
{
    public void run()
    {
  	Random r = new Random();
  	for(int i=0;i<5;i++)
  	{
  	int a = r.nextInt(100); 
  	System.out.println("Thread-1:Random integer generated is "+a);
  	if(a%2==0)
  	{
   	    square t2 = new square(a);
   	    t2.start();
  	}	
  	else
  	{
   	    cube t3 = new cube(a);
   	    t3.start();
   		
  	}
  	try
  	{
  	    Thread.sleep(100);
  	}
  	catch(Exception e)
  	{
	    System.out.println(e);
	}
    }
    public static void main(String args[])
    {
  
	thread1 t1 = new thread1();
  	t1.start();
    }
}