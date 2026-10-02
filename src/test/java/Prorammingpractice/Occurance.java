package Prorammingpractice;

public class Occurance {

	public static void main(String[] args) {
		
String x="biriyani";
char target='i';
int count=0;
for(int i=0;i<x.length();i++) {
	if(x.charAt(i)==target) {
		count++;
	}
}
System.out.print("occurance of i is :"+count);
	}

}
