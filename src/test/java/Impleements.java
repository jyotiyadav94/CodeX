
public class Impleements implements Runnable {

	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
		
		
class demo
{
	public void main(String[] args)
	{
		Impleements x=new Impleements();
		Thread t=new Thread();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		
		
	}
}
		
	}
	
	
	
	
	
}
