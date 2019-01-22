import java.awt.*;
class My_Button extends Frame
{
My_Button()
{
Button b=new Button("click here");
b.setBounds(30,100,80,30);//set position of button
setSize(400,400);
setLayout(null);
setVisible(true);
add(b);
 }
public static void main(String s[])
{
My_Button a=new My_Button();
}

}