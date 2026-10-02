package Prorammingpractice;

public class Plindrome {

	public static void main(String[] args) {
String c="automation";
String rev="";
for(int i=c.length()-1;i>=0;i--) {
	rev=rev+c.charAt(i);
}
System.out.println("reversed strin is "+rev);
if(c.equals(rev)) {
	System.out.println("it is a palindrome ");

}
else {
	System.out.println("it is not a palindrome ");

}
	}

}
