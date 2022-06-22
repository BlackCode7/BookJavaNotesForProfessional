package numericPrimitiveJava.IndexOfString;

public class IndexOfString {

	public static void main(String[] args){ 
	
		String s = "this is a log sentence, Aceitar a fim das coisas como mortal";
		String w = "What do you need from me?";
		
		int qq = w.indexOf('k');
		int rr = w.indexOf("WhetHer");
		int ww = w.indexOf("whether");
		int ee = w.indexOf("check");
		
		int i = s.indexOf('i');
		int j = s.indexOf("long");
		int k = s.indexOf('z');
		int h = s.indexOf("LoNg");
		int e = s.indexOf("sentence");
		int m = s.indexOf("ence");
		int d = s.indexOf("Aceitar");
		int dd = s.indexOf("fim");
		int ff = s.indexOf("das");
		

		if( rr == qq ) {
			System.out.println("Teste de condicional >> " + qq);
			String[] data = w.split("\\s+");
			System.out.println("Array  de strings >> "+data.length);
			
			if (i == ff) {
				System.out.println("Entrei na condição!!!");
			} else {
				System.out.println("Falhei ao entrar na condição!!!");
			}				
		}
		
		System.out.println(rr);
		System.out.println(qq);
		System.out.println(ww);
		System.out.println(ee);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(h);
		System.out.println(e);
		System.out.println(m);
		System.out.println(d);
		System.out.println(dd);

	}

}
