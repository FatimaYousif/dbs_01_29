import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.sql.*;

//cv builder

class make
{
	public static void main(String args[])
	{
		//for the bg yk 
		JLabel l=new JLabel(new ImageIcon("C:/Users/CCS/Desktop/cv.png"));
		
		JFrame f1=new JFrame("  MAIN  ");
		JFrame f2=new JFrame("  YOUR INFO SECTION  ");
		JFrame f3=new JFrame("  PROFILE SECTION  ");
		JFrame f4=new JFrame("  OBJECTIVE SECTION  ");
		JFrame f5=new JFrame("  EDUCATION SECTION  ");
		JFrame f6=new JFrame("  SKILLS SECTION  ");
		JFrame f7=new JFrame("  HOBBIES SECTION  ");
		JFrame f8=new JFrame("  EXPERIENCE SECTION  ");
		
		
		JLabel l1=new JLabel("MAIN MENU");
		JLabel l2=new JLabel("SELECT");
		
		JButton b1=new JButton("YOUR INFO");
		JButton b2=new JButton("PROFILE");
		JButton b3=new JButton("OBJECTIVE");
		JButton b4=new JButton("EDUCATION");
		JButton b5=new JButton("SKILLS");
		JButton b6=new JButton("HOBBIES");
		JButton b7=new JButton("EXPERIENCE");
		JButton b8=new JButton("EXIT");
		
				f1.setLayout(null);
				
				l1.setBounds(100,0,150,30);
				l2.setBounds(10,50,150,30);
				b1.setBounds(100,100,150,30);
				b2.setBounds(100,150,150,30);
				b3.setBounds(100,200,150,30);
				b4.setBounds(100,250,150,30);
				b5.setBounds(100,300,150,30);
				b6.setBounds(100,350,150,30);
				b7.setBounds(100,400,150,30);
				b8.setBounds(100,450,150,30);
				
				f1.add(l1);
				f1.add(l2);
				f1.add(b1);
				f1.add(b2);
				f1.add(b3);
				f1.add(b4);
				f1.add(b5);
				f1.add(b6);
				f1.add(b7);
				f1.add(b8);
				
				
				//f2 material
				
				JLabel name=new JLabel("NAME");
				JLabel phone=new JLabel("PHONE NO");
				JLabel address=new JLabel("ADDRESS");
				JLabel email=new JLabel("EMAIL");
				JLabel website=new JLabel("WEBSITE");
				JLabel fb=new JLabel("FACEBOOK");
				JLabel ig=new JLabel("INSTAGRAM");
				
				JTextField t1=new JTextField("");
				JTextField t2=new JTextField("");
				JTextField t3=new JTextField("");
				JTextField t4=new JTextField("");
				JTextField t5=new JTextField("");
				JTextField t6=new JTextField("");
				JTextField t7=new JTextField("");
				f2.setSize(500,400);
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JButton next=new JButton("NEXT");
				JButton back=new JButton("BACK");
				JButton exit=new JButton("EXIT");
				
				f2.add(name);
				f2.add(phone);
				f2.add(address);
				f2.add(email);
				f2.add(website);
				f2.add(fb);
				f2.add(ig);
				f2.add(next);
				f2.add(back);
				f2.add(exit);
				
				f2.add(t1);
				f2.add(t2);
				f2.add(t3);
				f2.add(t4);
				f2.add(t5);
				f2.add(t6);
				f2.add(t7);
				
				//exit button
				exit.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
					System.exit(0);
					}
				}
				);

				//back button
				back.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f2.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				//next button
				next.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f1.setVisible(false);
						f2.setVisible(false);
						f3.setVisible(true);
					}
				}
				);
				
				f2.setLayout(null);
				
				name.setBounds(10,0,150,30);
				phone.setBounds(10,50,150,30);
				address.setBounds(10,100,150,30);
				email.setBounds(10,150,150,30);
				website.setBounds(10,200,150,30);
				fb.setBounds(10,250,250,30);
				ig.setBounds(10,300,300,30);
				next.setBounds(10,450,300,30);
				back.setBounds(10,500,300,30);
				exit.setBounds(10,550,300,30);
				
				t1.setBounds(100,0,150,30);
				t2.setBounds(100,50,150,30);
				t3.setBounds(100,100,150,30);
				t4.setBounds(100,150,150,30);
				t5.setBounds(100,200,150,30);
				t6.setBounds(100,250,150,30);
				t7.setBounds(100,300,150,30);
				
				
				//f3 material
				JLabel description=new JLabel("PLEASE WRITE YOUR DESCRIPTION");
				JTextField des=new JTextField("");
				JButton back3=new JButton("BACK");
				JButton back3m=new JButton("BACK TO MAIN MENU");
				JButton next3=new JButton("NEXT");
				
				f3.setLayout(null);
				
				description.setBounds(100,0,200,30);
				des.setBounds(10,30,250,150);
				next3.setBounds(10,300,150,30);
				back3.setBounds(10,350,150,30);
				back3m.setBounds(10,400,150,30);
				
				f3.add(description);
				f3.add(des);
				f3.add(back3);
				f3.add(next3);
				f3.add(back3m);
				
				//next button
				next3.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
					     
						f1.setVisible(false); 
						f2.setVisible(false);
						f3.setVisible(false);
						f4.setVisible(true);
					}
				}
				);
				
				//back button
				back3.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f3.setVisible(false);
						f2.setVisible(true);
					}
				}
				);
				
				//back to main menu button
				back3m.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f3.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				f3.setSize(600,500);
				f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//f4 material
				JLabel description2=new JLabel("PLEASE WRITE YOUR OBJECTIVE DESCRIPTION");
				JTextField des2=new JTextField("");
				JButton back4=new JButton("BACK");
				JButton next4=new JButton("NEXT");
				JButton back4m=new JButton("BACK TO MAIN MENU");
				
				f4.setLayout(null);
				
				description2.setBounds(100,0,300,30);
				des2.setBounds(10,30,250,150);
				next4.setBounds(10,300,150,30);
				back4.setBounds(10,350,150,30);
				back4m.setBounds(10,400,150,30);
				
				f4.add(description2);
				f4.add(des2);
				f4.add(next4);
				f4.add(back4);
				f4.add(back4m);
				
				//next button
				next4.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
					     
						f1.setVisible(false); 
						f2.setVisible(false);
						f3.setVisible(false);
						f4.setVisible(false);
						f5.setVisible(true);
					}
				}
				);
				
				//back button
				back4.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f4.setVisible(false);
						f3.setVisible(true);
					}
				}
				);
				
				//back to main  button
				back4m.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f4.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				f4.setSize(600,500);
				f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//frame 5 material ==> education
			
				JLabel level=new JLabel("LEVEL");
				JLabel date=new JLabel("DATE (YYYY-MM-DD)");
				JLabel uni=new JLabel("UNIVERSITY");
				
				JTextField e1=new JTextField("");
				JTextField e2=new JTextField("");
				JTextField e3=new JTextField("");
				
				JButton back5=new JButton("BACK");
				JButton back5m=new JButton("BACK TO MAIN");
				JButton next5=new JButton("NEXT");
				
				f5.setLayout(null);
				
				level.setBounds(10,0,200,30);
				date.setBounds(10,100,200,30);
				uni.setBounds(10,200,200,30);
				
				e1.setBounds(150,0,200,30);
				e2.setBounds(150,100,200,30);
				e3.setBounds(150,200,200,30);
				
				next5.setBounds(10,300,150,30);
				back5.setBounds(10,350,150,30);
				back5m.setBounds(10,400,150,30);
				
				f5.add(level);
				f5.add(date);
				f5.add(uni);
				f5.add(e1);
				f5.add(e2);
				f5.add(e3);
				f5.add(back5);
				f5.add(back5m);
				f5.add(next5);
				
				
				//next button
				next5.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
					     
						f1.setVisible(false); 
						f2.setVisible(false);
						f3.setVisible(false);
						f4.setVisible(false);
						f5.setVisible(false);
						f6.setVisible(true);
					
					}
				}
				);
				
				//back button
				back5.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f5.setVisible(false);
						f4.setVisible(true);
					}
				}
				);
				
				//back to main button
				back5.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f5.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				f5.setSize(600,500);
				f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
		//f6 material==> skills
		JLabel sl=new JLabel("mention each skills upto 5");
		JTextField st1=new JTextField("");
		JTextField st2=new JTextField("");
		JTextField st3=new JTextField("");
		JTextField st4=new JTextField("");
		JTextField st5=new JTextField("");
		
		JButton back6=new JButton("BACK");
		JButton back6m=new JButton("BACK TO MAIN");
		JButton next6=new JButton("NEXT");
		
				f6.setLayout(null);
				
					//back button
				back6.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f6.setVisible(false);
						f5.setVisible(true);
					}
				}
				);
				
				//back to main button
				back6m.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f6.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				//next button
				next6.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
					     
						f1.setVisible(false); 
						f2.setVisible(false);
						f3.setVisible(false);
						f4.setVisible(false);
						f5.setVisible(false);
						f6.setVisible(false);
						f7.setVisible(true);
					
					}
				}
				);
				
				sl.setBounds(100,0,150,30);
				st1.setBounds(100,100,150,30);
				st2.setBounds(100,150,150,30);
				st3.setBounds(100,200,150,30);
				st4.setBounds(100,250,150,30);
				st5.setBounds(100,300,150,30);
				
				next6.setBounds(100,400,150,30);
				back6.setBounds(100,500,150,30);
				back6m.setBounds(100,550,150,30);
				
				f6.add(sl);
				f6.add(st1);
				f6.add(st2);
				f6.add(st3);
				f6.add(st4);
				f6.add(st5);
				f6.add(back6);
				f6.add(back6m);
				f6.add(next6);
				
		f6.setSize(700,600);
		f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//hobbies section
		
		JLabel h=new JLabel("mention HOOBIES upto 5");
		JTextField h1=new JTextField("");
		JTextField h2=new JTextField("");
		JTextField h3=new JTextField("");
		JTextField h4=new JTextField("");
		JTextField h5=new JTextField("");
		
		JButton back7=new JButton("BACK");
		JButton back7m=new JButton("BACK TO MAIN");
		JButton next7=new JButton("NEXT");
		
		
				f7.setLayout(null);
				
				//back button
				back7.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f7.setVisible(false);
						f6.setVisible(true);
					}
				}
				);
				
				//back to main button
				back7.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f7.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				//next button
				next7.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
					     
						f1.setVisible(false); 
						f2.setVisible(false);
						f3.setVisible(false);
						f4.setVisible(false);
						f5.setVisible(false);
						f6.setVisible(false);
						f7.setVisible(false);
						f8.setVisible(true);
					}
				}
				);
				
				h.setBounds(100,0,150,30);
				h1.setBounds(100,100,150,30);
				h2.setBounds(100,150,150,30);
				h3.setBounds(100,200,150,30);
				h4.setBounds(100,250,150,30);
				h5.setBounds(100,300,150,30);
				
				next7.setBounds(100,400,150,30);
				back7.setBounds(100,500,150,30);
				back7m.setBounds(100,550,150,30);
				
				f7.add(h);
				f7.add(h1);
				f7.add(h2);
				f7.add(h3);
				f7.add(h4);
				f7.add(h5);
				f7.add(back7);
				f7.add(back7m);
				f7.add(next7);
				
		f7.setSize(700,600);
		f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//EXPERIENCE FRAME==>frame 8
		
		JLabel e_name=new JLabel("EXPERIENCE NAME");
		JLabel e_date=new JLabel("DATE (YYYY-MM-DD)");
		JLabel e_description=new JLabel("experience description");
				
		JTextField x1=new JTextField("");
		JTextField x2=new JTextField("");
		JTextField x3=new JTextField("");
				
				JButton back8=new JButton("BACK");
				JButton back8m=new JButton("BACK TO MAIN");
				JButton register=new JButton("REGISTER");
				JButton generate=new JButton("GENERATE");
				
				f8.setLayout(null);
				
				e_name.setBounds(10,0,200,30);
				e_date.setBounds(10,100,200,30);
				e_description.setBounds(10,200,200,30);
				
				x1.setBounds(150,0,200,30);
				x2.setBounds(150,100,200,30);
				x3.setBounds(150,200,200,30);
				
				back8.setBounds(10,350,150,30);
				back8m.setBounds(10,400,150,30);
				register.setBounds(10,500,150,30);
				generate.setBounds(10,550,150,30);
				
				
				f8.add(e_name);
				f8.add(e_date);
				f8.add(e_description);
				f8.add(x1);
				f8.add(x2);
				f8.add(x3);
				f8.add(back8);
				f8.add(back8m);
				f8.add(register);
				f8.add(generate);
				
				//back button
				back8.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f8.setVisible(false);
						f7.setVisible(true);
					}
				}
				);
				
				//back to main button
				back8m.addActionListener(new ActionListener()
				{	
				public void actionPerformed(ActionEvent e) 
					{
						f8.setVisible(false);
						f1.setVisible(true);
					}
				}
				);
				
				//register button
				register.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","comeon786");
				Statement st=conn.createStatement();
				String str1="insert into info values('"+t1.getText()+"',"+t2.getText()+",'"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+des.getText()+"','"+des2.getText()+"');";	
				String str2="insert into edu values("+t2.getText()+",'"+e1.getText()+"','"+e2.getText()+"','"+e3.getText()+"');";
				String str3="insert into skills values("+t2.getText()+",'"+st1.getText()+"','"+st2.getText()+"','"+st3.getText()+"','"+st4.getText()+"','"+st5.getText()+"');";
				String str4="insert into hobbies values("+t2.getText()+",'"+h1.getText()+"','"+h2.getText()+"','"+h3.getText()+"','"+h4.getText()+"','"+h5.getText()+"');";
				String str5="insert into experience values("+t2.getText()+",'"+x1.getText()+"','"+x2.getText()+"','"+x3.getText()+"');";
				
				st.executeUpdate(str1);
				st.executeUpdate(str2);
				st.executeUpdate(str3);
				st.executeUpdate(str4);
				st.executeUpdate(str5);
				
				JOptionPane.showMessageDialog(null, "successfully inserted","information", JOptionPane.PLAIN_MESSAGE);
			}
			catch(Exception ex)
			{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"error 404 a",JOptionPane.PLAIN_MESSAGE);
			}
			}
		}
		);
		
		//the new SHIZ ADDED
		
		//generate button
		JFrame f=new JFrame("CV");
		JLabel g1=new JLabel(); 		//name
		JLabel g2=new JLabel();			//phno
		JLabel g3=new JLabel();			//address
		JLabel g4=new JLabel();			//email
		JLabel g5=new JLabel();			//website
		JLabel g6=new JLabel();			//fb
		JLabel g7=new JLabel();			//ig
		JLabel g8=new JLabel();			//profile des
		JLabel g9=new JLabel();			//objective des
		JLabel g10=new JLabel();			//education level
		JLabel g11=new JLabel();			//education date
		JLabel g12=new JLabel();			//education uni
		JLabel g13=new JLabel();			//skill1
		JLabel g14=new JLabel();			//skill2
		JLabel g15=new JLabel();			//skill3
		JLabel g16=new JLabel();			//skill4
		JLabel g17=new JLabel();			//skill5
		JLabel g18=new JLabel();			//hobbies1
		JLabel g19=new JLabel();			//hobbies2
		JLabel g20=new JLabel();			//hobbies3
		JLabel g21=new JLabel();			//hobbies4
		JLabel g22=new JLabel();			//hobbies5
		JLabel g23=new JLabel();			//experience name
		JLabel g24=new JLabel();			//experience date
		JLabel g25=new JLabel();			//experience des
		
		
		generate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				f8.setVisible(false);
				f.setVisible(true);
				try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","comeon786");
				Statement st=conn.createStatement();
				String str1="SELECT * FROM edu e, experience x, hobbies h, info i, skills s where i.phno=e.phno and i.phno=x.phno and i.phno=h.phno and i.phno=s.phno and i.phno='"+t2.getText()+"';";	
				
				ResultSet rset=st.executeQuery(str1);
				while(rset.next())
				{
				String names=rset.getString("name");
				int g_phno=rset.getInt("phno");
				String s_phno=String.valueOf(g_phno);
				
				String adds=rset.getString("add");
				String emails=rset.getString("email");
				String websites=rset.getString("website");
				String fbs=rset.getString("fb");
				String igs=rset.getString("ig");
				String profiles=rset.getString("profile_d");
				String objectives=rset.getString("objective_d");
				String levels=rset.getString("level");
				String dates=rset.getString("e_date");		//date in string doubt
				
				String skills1=rset.getString("skill1");
				String skills2=rset.getString("skill2");
				String skills3=rset.getString("skill3");
				String skills4=rset.getString("skill4");
				String skills5=rset.getString("skill5");
				
				
				String hs1=rset.getString("h1");
				String hs2=rset.getString("h2");
				String hs3=rset.getString("h3");
				String hs4=rset.getString("h4");
				String hs5=rset.getString("h5");
				
				String exp_name=rset.getString("e_name");
				String exp_date=rset.getString("e_date");
				String exp_des=rset.getString("e_description");
				
				
				g1.setText(names);
				g2.setText(s_phno);	
				g3.setText(adds);
				g4.setText(emails);	
				g5.setText(websites);
				g6.setText(fbs);	
				g7.setText(igs);
				g8.setText(profiles);	
				g9.setText(names);
				g10.setText(objectives);	
				g11.setText(levels);
				g12.setText(dates);	
				g13.setText(skills1);
				g14.setText(skills2);	
				g15.setText(skills3);
				g16.setText(skills4);	
				g17.setText(skills5);
				g18.setText(hs1);	
				g19.setText(hs2);
				g20.setText(hs3);	
				g21.setText(hs4);
				g22.setText(hs5);	
				g23.setText(exp_name);	
				g24.setText(exp_date);
				g25.setText(exp_des);	
				
				}
				
		//THIS IS THE CV FRAME
		f.setLayout(null);
		l.setBounds(0,0,600,815);
		
		
		//set these too
		g1.setBounds(50,50,150,30);
		g2.setBounds(150,50,80,40);
		g3.setBounds(150,70,80,40);
		g4.setBounds(150,110,80,40);
		g5.setBounds(150,90,80,40);
		g6.setBounds(150,150,80,40);
		g7.setBounds(150,130,80,40);
		g8.setBounds(50,160,70,30);
		g9.setBounds(50,250,150,30);
		
		g10.setBounds(150,380,80,40);
		g11.setBounds(150,390,80,40);
		g12.setBounds(150,400,80,40);
		
		g13.setBounds(150,350,40,40);
		g14.setBounds(150,380,40,40);
		g15.setBounds(150,400,40,40);
		//g16.setBounds(100,50,150,30);
		//g17.setBounds(10,50,150,30);
		
		g18.setBounds(150,200,80,40);
		g19.setBounds(150,220,80,40);
		g20.setBounds(150,240,80,40);
		g21.setBounds(150,260,80,40);
		g22.setBounds(150,280,80,40);
		
		g23.setBounds(150,310,80,40);
		g24.setBounds(150,330,80,40);
		g25.setBounds(150,350,80,40);
			
		//set whatever u want to according to the frame color
		g1.setForeground(Color.WHITE);
		g2.setForeground(Color.WHITE);
		g3.setForeground(Color.WHITE);
		g4.setForeground(Color.WHITE);
		g5.setForeground(Color.WHITE);
		g6.setForeground(Color.WHITE);
		g7.setForeground(Color.WHITE);
		g8.setForeground(Color.WHITE);
		g9.setForeground(Color.WHITE);
		
		g10.setForeground(Color.BLACK);
		g11.setForeground(Color.BLACK);
		g12.setForeground(Color.BLACK);
		g13.setForeground(Color.BLACK);
		g14.setForeground(Color.BLACK);
		g15.setForeground(Color.BLACK);
		//g16.setForeground(Color.WHITE);
		//g17.setForeground(Color.WHITE);
		g18.setForeground(Color.BLACK);
		g19.setForeground(Color.BLACK);
		g20.setForeground(Color.BLACK);
		g21.setForeground(Color.BLACK);
		g22.setForeground(Color.BLACK);
		g23.setForeground(Color.BLACK);
		g24.setForeground(Color.BLACK);
		g25.setForeground(Color.BLACK);
		
		f.add(g1);
		f.add(g2);
		f.add(g3);
		f.add(g4);
		f.add(g5);
		f.add(g6);
		f.add(g7);
		f.add(g8);
		f.add(g9);
		f.add(g10);
		f.add(g11);
		f.add(g12);
		f.add(g13);
		f.add(g14);
		f.add(g15);
		//f.add(g16);
		//f.add(g17);
		f.add(g18);
		f.add(g19);
		f.add(g20);
		f.add(g21);
		f.add(g22);
		f.add(g23);
		f.add(g24);
		f.add(g25);
		
		f.add(l);
		
		f.setSize(600,1500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			}
			catch(Exception ex)
			{
			JOptionPane.showMessageDialog(null,ex,"error 404 b",JOptionPane.PLAIN_MESSAGE);
			}
			}
		}
		);
		
		f8.setSize(600,500);
		f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//FRAME 1 SHIZZ
		
		f1.setVisible(true);
		f1.setSize(700,600);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//	your info button=b1
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{	
				f1.setVisible(false);
				f2.setVisible(true);
				}
		}
		);
		
		
		//PROFILE===> Description
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{
				f1.setVisible(false);
				f3.setVisible(true);
				}
				}
				);	
		//OBJECTIVE==> Description
		b3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{
				f1.setVisible(false);
				f4.setVisible(true);
				}
				}
				);	
		//education section
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{
				f1.setVisible(false);
				f5.setVisible(true);
				}
				}
				);	
		
		//SKILLS SECTION
		b5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{
				f1.setVisible(false);
				f6.setVisible(true);
				}
				}
				);
				
		//HOBBIES SECTION
		b6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{
				f1.setVisible(false);
				f7.setVisible(true);
				}
				}
				);
		
		//EDUCATION SECTION
		b7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
				{
				f1.setVisible(false);
				f8.setVisible(true);
				}
				}
				);

		//	exit button=b8
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
				{
				System.exit(0);
				}
		}
		);
	
	}

}