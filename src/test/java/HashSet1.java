import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		
		h.add(" ");
		for(int i=0;i<10;i++)
		{
			System.out.println(h.add(i));
		}
		
//		System.out.println(h);
		
		h.add(" ");
		System.out.println(h);
	}
	
	
	
}
