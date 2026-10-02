package Prorammingpractice;

public class Reverse_string {

	public static void main(String[] args) {
String a="GOODMORNING";
String rev="";
for(int i=a.length()-1;i>=0;i--) {
	rev=rev+a.charAt(i);
}
System.out.print(rev+ " this is the reversed string ");
	}

}
