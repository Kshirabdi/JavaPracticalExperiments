//experiment 6-string functions
package javapractical;

public class Experiment6 {

	public static void main(String[] args) {
		/**String class methods
		 * compare(), concat(), equals(), length(), charAt()
		 */
		String firstName="Kshirabdi";
		String lastName="Tanaya";
		String fullName;
		fullName=firstName.concat(lastName);
		System.out.println("\"String\" CLASS METHODS");
		System.out.println("---------------------");
		System.out.println("concating the string "+ firstName +" + "+lastName+" = "+fullName);//concat()
		System.out.println("comparing the strings :"+firstName+" and "+lastName+" = "+ firstName.equals(lastName));//equals()
		System.out.println("length of string "+firstName+" = "+ firstName.length());//length()
		System.out.println("length of string "+lastName+" = "+ lastName.length());//length()
		System.out.println("character at index 0 in the name "+lastName+" = "+ lastName.charAt(0));//charAt()
		
		
		/**stringBuffer class methods
		 * append(String s),insert(int offset, String s),replace(int startIndex, int endIndex, String str),length(),substring(int beginIndex),
		 * substring(int beginIndex, int endIndex)
		 */
		StringBuffer str1=new StringBuffer("Kshirabdi");
		StringBuffer str2=new StringBuffer("Tanaya");
		System.out.println("\n\"StringBuffer\" CLASS METHODS");
		System.out.println("--------------------------------");
		System.out.println("length of string "+str1+" = "+ str1.length());//length()
		str1.setCharAt(8, 'h');//setCharAt()
		System.out.println("after setcharacter 'h' at 8th position of name " + str1 + " = " + str1.toString());
		str2.setLength(20);//setLengthAt()
		System.out.println("modified length of sring "+str2+" = "+str2.length());
		System.out.println("append "+str2+"at the end of "+str1+" = "+str1.append(str2) );//append()
		System.out.println("After insert 'i ' at the position 9 in the string "+str1+" = "+str1.insert(9, "i "));//insert()
		
	}





}
