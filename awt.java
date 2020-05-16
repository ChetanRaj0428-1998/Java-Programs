import java.awt.*;
class awt extends Frame
{
awt()
{
Button b=new Button("CLICK");
b.setBounds(100,100,100,100);
add(b);
setSize(200,400);
setLayout(null);
setVisible(true);
}
public static void main(String arg[])
{
awt a=new awt();
}
}