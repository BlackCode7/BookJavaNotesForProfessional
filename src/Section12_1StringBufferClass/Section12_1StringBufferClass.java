package Section12_1StringBufferClass;

public class Section12_1StringBufferClass {

	public static void main(String[] args) {
		
		/*Java StringBuilder class is used to create mutable (modifiable) string. 
		 * The Java StringBuilder class is same as StringBuffer class except that 
		 * it is non-synchronized. It is available since JDK 1.5. 
		 * 
		 * Methods:
		*		public synchronized StringBuffer append(String s)
		*		public synchronized StringBuffer insert(int offset, String s)
		*		public synchronized StringBuffer replace(int startIndex, int endIndex, String str)
		*		public synchronized StringBuffer delete(int startIndex, int endIndex)
		*		public synchronized StringBuffer reverse()
		*		public int capacity()
		*		public void ensureCapacity(int minimumCapacity)
		*		public char charAt(int index)
		*		public int length()
		*		public String substring(int beginIndex)
		*		public String substring(int beginIndex, int endIndex)
		*/
		
		stringClassNormal();		
		stringBufferManipulationStringMutable();
		
		/* StringBuffer is class java for manipulation of strings */

	}

	public static void stringBufferManipulationStringMutable() {
		StringBuffer strBuffer = new StringBuffer("Study");
		strBuffer.append("ToNight");
		System.out.println(strBuffer);
	}

	public static void stringClassNormal() {
		String str = "Anderson";
		str.concat("Tonight");
		System.out.println(str);
	}

}
