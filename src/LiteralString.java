
public class LiteralString {
	public static void main(String[] args) {
		
	
	StringBuffer s = new StringBuffer("Nisha");
	StringBuffer s1 =new StringBuffer("Rengan");
	StringBuffer s2 = s.append(s1);
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	}
}
