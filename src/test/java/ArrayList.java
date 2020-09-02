import java.util.*;
public class ArrayList {

	public static void main(String[] args) {
		
		LinkedList a=new LinkedList();
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
		
		System.out.println(a);
		
		System.out.println(a.remove());
		System.out.println(a.add(10));
		System.out.println(a);
		
	}
	
	
}
