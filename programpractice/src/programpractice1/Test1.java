package programpractice1;

public class Test1 { 
		 public static void main(String[] args) {
		 

String str="sir";
String revstring="";
 
for(int i=str.length()-1;i>=0;--i){
revstring +=str.charAt(i);
}
 
System.out.println(revstring);

if(revstring.equalsIgnoreCase(str))
{
	System.out.print("String is pallendrome");
	}
else {
	System.out.print("String is not pallendrome");
}	 
}
}
