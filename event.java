import java.awt.*;
import java.awt.event.*;
class test extends Frame implements ActionListener
{
TextField tf;//Creating object for class
Label l,l1;//Creating object for the label
Button b,b1,b2;
Choice c;
List ll;
MenuBar m=new MenuBar();
Menu menu;
MenuItem i1,i2,i3;
test()
{
tf=new TextField("click here");//initialising the object 
c=new Choice();
ll=new List(4);
CheckboxGroup cbg=new CheckboxGroup();//Anyone of the checkboxes can be in the on state
Checkbox c1=new Checkbox("Male",cbg,true);//Creating and initialising checkbox
Checkbox c2=new Checkbox("Female",cbg,false);
menu=new Menu("File");
i1=new MenuItem("Open");
i2=new MenuItem("Save");
i3=new MenuItem("New");
c.setBounds(90,190,160,30);
c1.setBounds(270,180,160,30);
c2.setBounds(270,200,160,30);
b=new Button("SUBMIT chuthiya name");//Creating and initialising the object
b1=new Button("don't SUBMIT chuthiya name");
b2=new Button("Check");
l=new Label("Name");//initialising the object
b.setBounds(90,90,150,30);//setBounds(X-pos(r.vertical),Y-pos(d.horizontal),width,height)
b1.setBounds(90,120,160,30);
b2.setBounds(90,240,160,30);                           
tf.setBounds(90,60,150,30);                            
l.setBounds(50,60,50,30);
ll.setBounds(90,300,70,60);
b.addActionListener(this);//passing 'this' as a parameter
b1.addActionListener(this);
b2.addActionListener(this);
i1.addActionListener(this);
add(b);add(tf);add(l);add(b1);add(b2);add(c1);add(c2);add(c);add(ll);//adding components to frame
c.add("Small Chuthiya");
c.add("Medium Chuthiya");
c.add("Maha Chuthiya");
c.add("Legend Chuthiya");
ll.add("Dude");
ll.add("Guy");
ll.add("Man");
ll.add("Cool");
menu.add(i1);
menu.add(i2);
menu.add(i3);
m.add(menu);
setMenuBar(m);
setSize(700,700);//frame size setting
setLayout(null);//frame layout setting
setVisible(true);//frame visibility setting
setTitle("Frame");
}
public void actionPerformed(ActionEvent e)
{
String s=tf.getText();//gets the text from text field and stores in s variable
 if(e.getSource()==b1)//getSource returns the object on which the event(button click) was perforemed
{
System.out.println(" chuthiya name not submitted");
//System.exit(0);
}
else if(e.getSource()==b)
{
tf.setText("Submitted");
System.out.println("Submitted chuthiya "+s+" to site");
System.exit(0);
}
else if(e.getSource()==b2)
{
System.out.println("You are a "+c.getItem(c.getSelectedIndex()));
}
else if(e.getSource()==i1)
{
tf.setText("Cannot open");
}
}
public static void main(String a[])
{
test t=new test();
}
}