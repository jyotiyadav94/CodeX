import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashSet {

	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
String[] d=new String[] {"wow","yy","wooo","qo"};
List dub=Arrays.asList(d);
Set ss=new HashSet<>(dub);
if(dub.size()!=ss.size())
{
	System.out.println("this contains dubicates ");
}

else
	System.out.println("this ddoesn't contain ddublicates");
	
	}
	
	
	
}
