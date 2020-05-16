import java.util.*;
class scan 
{
public static void main(String arg[])
{
HashMap<Integer,String> map=new HashMap<Integer,String>();
Scanner s=new Scanner(System.in);
System.out.println("Enter the no. of students");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Student"+(i+1)+"\nEnter Roll no and your name");
int a=s.nextInt();
String b=s.next();
map.put(a,b);
}
System.out.println("ROll NO.      NAMES");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+"           "+m.getValue());
}
}
}
