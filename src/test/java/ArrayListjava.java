import java.util.ArrayList;

public class ArrayListjava {

	public static void main(String[] args) {
		
		int n=5;
		ArrayList<Integer> l=new ArrayList<Integer>(n);
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		
		System.out.println(l);
		
		
		l.remove(2);
		
		System.out.println(l);

		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
	}
	
	
	
}
