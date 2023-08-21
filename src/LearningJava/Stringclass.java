package LearningJava;

public class Stringclass {

	public static void main(String[] args) {
 
		String s=new String();
		String sn="123444";
		Double ab=23.34;
		System.out.println(sn.charAt(0));
		System.out.println(sn.codePointAt(1));
		System.out.println(sn.codePointCount(0, 4));
		System.out.println(((Object)sn).getClass().getSimpleName());
		System.out.println(((Object)ab).getClass().getSimpleName());

	}

}
