import java.util.*;
public class token
{
public static void main(String a[])
{
StringTokenizer st=new StringTokenizer("My name is chetan ","    ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}

}
}