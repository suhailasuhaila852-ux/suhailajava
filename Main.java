import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String str=sc.nextLine();
int maxLength=0;
for(int i=0; i<str.length(); i++){
String current="";
for(int j=i;j<str.length();j++){
char ch=str.charAt(j);
if(current.indexOf(ch)!=-1){
break;
}
current+=ch;
if(current.length()>maxLength){
maxLength=current.length();
}
}
}
System.out.println("Length of longest substring:"+maxLength);
}
}