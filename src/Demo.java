
public class Demo {

	public static void main(String[] args) {
//		String str= "ma1ni2sh3";
//		int len= str.length();
//		String newstr= "";
//		for(int i=0; i<len;i++) {
//			char ch = str.charAt(i);
//			if(Character.isAlphabetic(ch)) {
//				newstr= newstr+ch;
//			}
////	else {
////		System.out.print(ch);
////	}
//			
//		}
//		System.out.print(newstr);
//  System.out.println(str.replaceAll("\\d", ""));
		
		
		
		
		
		
		String s = "530280270";
		int len = s.length();
		String s1 = "";
		for(int i = 0;i<len;i++) {
			char ch = s.charAt(i);
			if(ch!=2) {
				s1 = s1+ch;
			}
			else {
				System.out.println(ch);
			}
			System.out.println(s1);
		}
		
	}

}
