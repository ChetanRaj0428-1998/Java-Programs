import java.io.*;
class Valueofdemo
{
public static void main (String a []) 
{
int x=10;
float y=10.5f;
double z=8.9;
String s1=String.valueOf(x);
String s2=String.valueOf(y);
String s3=String.valueOf(z);
boolean b=true;
String s4=String.valueOf(b);
System.out.println(x+x);
System.out.println(s1+s1);
Valueofdemo d=new Valueofdemo();
String s5=String.valueOf(d); 
System.out.println(s5);
String s6=d.toString();
System.out.println(s6);
}
}