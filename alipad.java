import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class notepad implements ActionListener
{
JFrame frame;
JMenuBar menubar;
JMenu menu1,menu2,menu3,menu4,menu5;
JMenuItem menuitem1,menuitem2,menuitem3;
JTextArea area;
File file,selectedfile;
FileReader reader;
FileWriter writer;
int ch;
notepad()
{
//--------------------------------------frame
frame=new
JFrame("ALI-------------------------->TYPING---------------------------------->NOTEPAD");
frame.setSize(600,500);
frame.setBackground(Color.white);
frame.setVisible(true);
//-------------------------------------------------text area
area=new JTextArea();
area.setBounds(0,0,600,500);
//-----------------------------------------------menu bar
menubar=new JMenuBar();
//-------------------------------------------------menu
menu1=new JMenu("File");
menu2=new JMenu("Edit");
menu3=new JMenu("Format");
menu4=new JMenu("View");
menu5=new JMenu("Help");
//---------------------------------------------------menu items
menuitem1=new JMenuItem("NEW");
menuitem2=new JMenuItem("open File");
menuitem3=new JMenuItem("Save File");
menuitem1.addActionListener(this);
menuitem2.addActionListener(this);
menuitem3.addActionListener(this);
menubar.add(menu1);
menubar.add(menu2);
menubar.add(menu3);
menubar.add(menu4);
menubar.add(menu5);
menu1.add(menuitem1);
menu1.add(menuitem2);
menu1.add(menuitem3);
frame.setJMenuBar(menubar);
frame.add(area,BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==menuitem1)
{
try
{
file=new File("C:\\Users\\Mohd Afzal\\Documents\\untitled.txt");
writer=new FileWriter(file.getName());
writer.write("hello");
writer.close();
reader=new FileReader(file.getName());
while((ch=reader.read())!=-1)
System.out.printf("%c",ch);
}
catch(IOException ex1)
{
}
}
if(e.getSource()==menuitem2)
{
JFileChooser filechooser=new JFileChooser();
filechooser.showOpenDialog(frame);
selectedfile=filechooser.getSelectedFile();
try
{
reader=new FileReader(selectedfile);
while((ch=reader.read())!=-1)
System.out.printf("%c",ch);
}
catch(IOException ex2)
{
}
}
if(e.getSource()==menuitem3)
{
JFileChooser filechooser=new JFileChooser();
filechooser.showSaveDialog(null);
selectedfile=filechooser.getSelectedFile();
System.out.println("SaveFile:"+selectedfile.getName());
}
}
}
class ordermachine implements ActionListener
{
JFrame frame;
JCheckBox checkbox1;
JCheckBox checkbox2;
JCheckBox checkbox3;
JCheckBox checkbox4;
JCheckBox checkbox5;
JCheckBox checkbox6;
JCheckBox checkbox7;
JCheckBox checkbox8;
JPanel panel;
JLabel label;
JButton button;
ordermachine()
{
//------------------------------------------frame
frame=new JFrame("order machine");
frame.setSize(700,700);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setResizable(false);
//--------------------------------------------panel
panel=new JPanel();
panel.setBounds(40,40,600,600);
panel.setBackground(Color.red);
//------------------------------------------------text field
label=new JLabel("ORDER YOUR CHOICE");
label.setBounds(180,0,200,100);
//--------------------------------------checkbox
checkbox1=new JCheckBox("pizza");
checkbox1.setBounds(200,100,100,30);
checkbox2=new JCheckBox("paties");
checkbox2.setBounds(200,150,100,30);
checkbox3=new JCheckBox("samosa");
checkbox3.setBounds(200,200,100,30);
checkbox4=new JCheckBox("chicken fry");
checkbox4.setBounds(200,250,100,30);
checkbox5=new JCheckBox("butter chicken");
checkbox5.setBounds(200,300,150,30);
checkbox6=new JCheckBox("Momoos");
checkbox6.setBounds(200,350,100,30);
checkbox7=new JCheckBox("Chaumin");
checkbox7.setBounds(200,400,100,30);
checkbox8=new JCheckBox("fry fish");
checkbox8.setBounds(200,450,100,30);
//-------------------------------------------button
button=new JButton("ORDER Item");
button.setBounds(200,500,150,30);
button.addActionListener(this);
panel.add(checkbox1);
panel.add(checkbox2);
panel.add(checkbox3);
panel.add(checkbox4);
panel.add(checkbox5);
panel.add(checkbox6);
panel.add(checkbox7);
panel.add(checkbox8);
panel.add(label);
panel.add(button);
frame.add(panel,BorderLayout.CENTER);
panel.setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
String msg="";
int amount=0;
if(checkbox1.isSelected())
{
amount+=150;
msg+="Pizza:150\n";
}
if(checkbox2.isSelected())
{
amount+=50;
msg+="paties:50\n";
}
if(checkbox3.isSelected())
{
amount+=10;
msg+="smosa:10\n";
}
if(checkbox4.isSelected())
{
amount+=180;
msg+="chicken fry:180\n";
}
if(checkbox5.isSelected())
{
amount+=250;
msg+="butter chicken:250\n";
}
if(checkbox6.isSelected())
{
amount+=50;
msg+="Momoos:50\n";
}
if(checkbox7.isSelected())
{
amount+=50;
msg+="chain:50\n";
}
if(checkbox8.isSelected())
{
amount+=200;
msg+="fry fish:200\n";
}
JOptionPane.showMessageDialog(panel,msg+"total:"+amount);
}
}
class calculator implements ActionListener
{
JFrame frame;
JPanel panel;
JLabel label1;
JLabel label2;
JLabel label3;
JLabel label4;
JTextField field1;
JTextField field2;
JTextField field3;
JButton button1;
JButton button2;
JButton button3;
JButton button4;
calculator()
{
//-------------------------------------------frame
frame=new JFrame();
frame.setVisible(true);
frame.setSize(500,500);
frame.setTitle("my calculator");
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ImageIcon image=new ImageIcon("902427-shahrukhkhan-straydogs.jpg");
frame.setIconImage(image.getImage());
//---------------------------------------------panel
panel=new JPanel();
panel.setBackground(Color.green);
//--------------------------------------label
label1=new JLabel("enter number");
label2=new JLabel("enter number");
label3=new JLabel("SIMPLE CALCULATOR");
label4=new JLabel("RESULT");
label1.setBounds(20,80,100,20);
label2.setBounds(20,150,100,20);
label3.setBounds(100,0,300,30);
label4.setBounds(20,200,100,30);
label4.setForeground(Color.red);
//-------------------------------------------textfield
field1=new JTextField();
field2=new JTextField();
field3=new JTextField();
field1.setBounds(100,80,100,20);
field2.setBounds(100,150,100,20);
field3.setBounds(100,200,100,30);
//-------------------------------------------button
button1=new JButton("+");
button2=new JButton("-");
button3=new JButton("*");
button4=new JButton("/");
button1.setBounds(20,250,50,30);
button1.setForeground(Color.black);
button2.setBounds(70,250,50,30);
button2.setForeground(Color.black);
button3.setBounds(20,300,50,30);
button3.setForeground(Color.black);
button4.setBounds(70,300,50,30);
button4.setForeground(Color.black);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
//-----------------------------------------adding component in panel and frame
panel.add(label1);
panel.add(label2);
panel.add(label3);
panel.add(label4);
panel.add(field1);
panel.add(field2);
panel.add(field3);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
frame.add(panel,BorderLayout.CENTER);
panel.setLayout(null);
}
//--------------------------------------------actionperformed function of action listener
public void actionPerformed(ActionEvent e)
{
String s1,s2,s3;
int c,a,b;
if(e.getSource()==button1)
{
s1=field1.getText();
s2=field2.getText();
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a+b;
s3=String.valueOf(c);
field3.setText(s3);
}
else if(e.getSource()==button2)
{
s1=field1.getText();
s2=field2.getText();
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a-b;
s3=String.valueOf(c);
field3.setText(s3);
}
else if(e.getSource()==button3)
{
s1=field1.getText();
s2=field2.getText();
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a*b;
s3=String.valueOf(c);
field3.setText(s3);
}
else if(e.getSource()==button4)
{
s1=field1.getText();
s2=field2.getText();
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=a/b;
s3=String.valueOf(c);
field3.setText(s3);
}
}
}
public class alipad
{
public static void main(String[]args)
{
//new ordermachine();
new calculator();
//new notepad();
}
}