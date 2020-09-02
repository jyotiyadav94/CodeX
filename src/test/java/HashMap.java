import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
//		System.out.println("Hashmap program");
		
		Map<Integer,String> countmap=new LinkedHashMap<Integer,String>();
		countmap.put(1, "how");
		countmap.put(2, "are");
		countmap.put(3, "you");
		countmap.put(4, "wojl");
		countmap.put(6, "qeer");
		
		for(Map.Entry<Integer,String> l:countmap.entrySet())
		{
			int key=l.getKey();
			String wow=l.getValue();
			System.out.println(key+ "  : "+wow);
			
			
		}
	}
	
	
}
