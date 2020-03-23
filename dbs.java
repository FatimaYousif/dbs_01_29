import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

//cv builder

class make
{
	public static void main(String args[])
	{	
		JFrame f1=new JFrame("CV GENERATOR");
		JFrame f2=new JFrame("INFO SECTION");
		JFrame f3=new JFrame("PROFILE SECTION");
		JFrame f4=new JFrame("OBJECTIVE SECTION");
		JFrame f5=new JFrame("EDUCATION SECTION");
		JFrame f6=new JFrame("SKILLS SECTION");
		JFrame f7=new JFrame("HOBBIES SECTION");
		JFrame f8=new JFrame("EXPERIENCE SECTION");
		JFrame f9=new JFrame("CV");		
		
		JLabel l1=new JLabel("MAIN MENU");
//		l1.setForeground(Color.WHITE);

		JLabel l2=new JLabel("Select the Following: ");
//		l2.setForeground(Color.WHITE);
		
		JButton b1=new JButton("YOUR INFO");
//		b1.setBackground(Color.WHITE);
//		b1.setForeground(new java.awt.Color(43, 47, 48));

		JButton b2=new JButton("PROFILE");
		JButton b3=new JButton("OBJECTIVE");
		JButton b4=new JButton("EDUCATION");
		JButton b5=new JButton("SKILLS");
		JButton b6=new JButton("HOBBIES");
		JButton b7=new JButton("EXPERIENCE");
		JButton b8=new JButton("EXIT");
		
		f1.setLayout(null);
		
		l1.setBounds(160,20,150,30);
		l2.setBounds(135,70,150,30);
		b1.setBounds(115,110,150,30);
		b2.setBounds(115,150,150,30);
		b3.setBounds(115,190,150,30);
		b4.setBounds(115,230,150,30);
		b5.setBounds(115,270,150,30);
		b6.setBounds(115,310,150,30);
		b7.setBounds(115,350,150,30);
		b8.setBounds(135,450,110,30);
		
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
		JLabel a1=new JLabel("INFO SECTION");				
		JLabel name=new JLabel("Name");
		JLabel phone=new JLabel("Phone Number");
		JLabel address=new JLabel("Address");
		JLabel email=new JLabel("Email");
		JLabel website=new JLabel("Website");
		JLabel fb=new JLabel("Facebook Profile");
		JLabel ig=new JLabel("Instagram Profile");
		
		JTextField t1=new JTextField("");
		JTextField t2=new JTextField("");
		JTextField t3=new JTextField("");
		JTextField t4=new JTextField("");
		JTextField t5=new JTextField("");
		JTextField t6=new JTextField("");
		JTextField t7=new JTextField("");
		
		JButton next=new JButton("NEXT");
		JButton back=new JButton("BACK TO MAIN MENU");

		f2.add(a1);
		f2.add(name);
		f2.add(phone);
		f2.add(address);
		f2.add(email);
		f2.add(website);
		f2.add(fb);
		f2.add(ig);
		f2.add(next);
		f2.add(back);
		
		f2.add(t1);
		f2.add(t2);
		f2.add(t3);
		f2.add(t4);
		f2.add(t5);
		f2.add(t6);
		f2.add(t7);

		f2.setLayout(null);

		a1.setBounds(200,20,150,30);				
		name.setBounds(30,70,150,30);
		phone.setBounds(30,105,150,30);
		address.setBounds(30,140,150,30);
		email.setBounds(30,175,150,30);
		website.setBounds(30,210,150,30);
		fb.setBounds(30,245,250,30);
		ig.setBounds(30,280,300,30);
		
		t1.setBounds(200,70,250,30);
		t2.setBounds(200,105,250,30);
		t3.setBounds(200,140,250,30);
		t4.setBounds(200,175,250,30);
		t5.setBounds(200,210,250,30);
		t6.setBounds(200,245,250,30);
		t7.setBounds(200,280,250,30);
		
		next.setBounds(180,360,110,30);
		back.setBounds(140,400,190,30);

		f2.setSize(500,520);
		f2.setResizable(false);
		f2.setLocationRelativeTo(null);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		

		//f3 material
		JLabel a2=new JLabel("PROFILE SECTION");				
		JLabel description=new JLabel("Enter your Description");
		JTextArea des=new JTextArea("");
		JButton next3=new JButton("NEXT");
		JButton back3=new JButton("BACK");
		JButton back3m=new JButton("BACK TO MAIN MENU");
        
        des.setLineWrap(true);
		des.setWrapStyleWord(true);
		
		f3.setLayout(null);

		a2.setBounds(165,20,150,30);
		description.setBounds(153,50,200,30);
		des.setBounds(30,80,380,200);
		next3.setBounds(155,320,110,30);
		back3.setBounds(155,360,110,30);
		back3m.setBounds(115,400,190,30);
		
		f3.add(a2);
		f3.add(description);
		f3.add(des);
		f3.add(back3);
		f3.add(next3);
		f3.add(back3m);

		f3.setSize(460,500);
		f3.setResizable(false);
		f3.setLocationRelativeTo(null);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		
		//f4 material
		JLabel a3=new JLabel("OBJECTIVE SECTION");				
		JLabel description2=new JLabel("Enter your Objective in Detail");
		JTextArea des2=new JTextArea("");
		JButton next4=new JButton("NEXT");
		JButton back4=new JButton("BACK");
		JButton back4m=new JButton("BACK TO MAIN MENU");

        des2.setLineWrap(true);
		des2.setWrapStyleWord(true);
		
		f4.setLayout(null);

		a3.setBounds(155,20,150,30);
		description2.setBounds(135,50,200,30);
		des2.setBounds(30,80,380,200);
		next4.setBounds(155,320,110,30);
		back4.setBounds(155,360,110,30);
		back4m.setBounds(115,400,190,30);
		
		f4.add(a3);
		f4.add(description2);
		f4.add(des2);
		f4.add(back4);
		f4.add(next4);
		f4.add(back4m);

		f4.setSize(460,500);
		f4.setResizable(false);
		f4.setLocationRelativeTo(null);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
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
		
		//back to main menu button
		back4m.addActionListener(new ActionListener()
		{	
		public void actionPerformed(ActionEvent e) 
			{
				f4.setVisible(false);
				f1.setVisible(true);
			}
		}
		);
					
		//frame 5 material ==> education
		JLabel a4=new JLabel("EDUCATION SECTION");							
		JLabel level=new JLabel("Level");
		JLabel date=new JLabel("Date (YYYY-MM-DD)");
		JLabel uni=new JLabel("University");
		
		JTextField e1=new JTextField("");
		JTextField e2=new JTextField("");
		JTextField e3=new JTextField("");
		
		JButton next5=new JButton("NEXT");
		JButton back5=new JButton("BACK");
		JButton back5m=new JButton("BACK TO MAIN MENU");
		
		f5.setLayout(null);
		
		a4.setBounds(180,20,150,30);
		level.setBounds(30,70,200,30);
		date.setBounds(30,105,200,30);
		uni.setBounds(30,140,200,30);
		
		e1.setBounds(200,70,250,30);
		e2.setBounds(200,105,250,30);
		e3.setBounds(200,140,250,30);
		
		next5.setBounds(185,210,110,30);
		back5.setBounds(185,250,110,30);
		back5m.setBounds(145,290,190,30);
		
		f5.add(a4);
		f5.add(level);
		f5.add(date);
		f5.add(uni);
		f5.add(e1);
		f5.add(e2);
		f5.add(e3);
		f5.add(back5);
		f5.add(back5m);
		f5.add(next5);

		f5.setSize(500,400);
		f5.setResizable(false);
		f5.setLocationRelativeTo(null);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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
		back5m.addActionListener(new ActionListener()
		{	
		public void actionPerformed(ActionEvent e) 
			{
				f5.setVisible(false);
				f1.setVisible(true);
			}
		}
		);				
		
		//f6 material==> skills
		JLabel a5=new JLabel("SKILLS SECTION");
		JLabel sl=new JLabel("Enter upto FIVE Skills");
		JLabel p1=new JLabel("1. ");
		JLabel p2=new JLabel("2. ");
		JLabel p3=new JLabel("3. ");
		JLabel p4=new JLabel("4. ");
		JLabel p5=new JLabel("5. ");
		JTextField st1=new JTextField("");
		JTextField st2=new JTextField("");
		JTextField st3=new JTextField("");
		JTextField st4=new JTextField("");
		JTextField st5=new JTextField("");
		
		JButton back6=new JButton("BACK");
		JButton back6m=new JButton("BACK TO MAIN MENU");
		JButton next6=new JButton("NEXT");
		
		f6.setLayout(null);
		a5.setBounds(140,20,150,30);
		sl.setBounds(125,50,150,30);
		st1.setBounds(70,80,250,30);
		st2.setBounds(70,125,250,30);
		st3.setBounds(70,170,250,30);
		st4.setBounds(70,215,250,30);
		st5.setBounds(70,260,250,30);

		p1.setBounds(30,80,250,30);
		p2.setBounds(30,125,250,30);
		p3.setBounds(30,170,250,30);
		p4.setBounds(30,215,250,30);
		p5.setBounds(30,260,250,30);

		next6.setBounds(125,320,110,30);
		back6.setBounds(125,360,110,30);
		back6m.setBounds(85,400,190,30);
		
		f6.add(a5);
		f6.add(p1);
		f6.add(p2);
		f6.add(p3);
		f6.add(p4);
		f6.add(p5);
		f6.add(sl);
		f6.add(st1);
		f6.add(st2);
		f6.add(st3);
		f6.add(st4);
		f6.add(st5);
		f6.add(back6);
		f6.add(back6m);
		f6.add(next6);
				
		f6.setSize(390,500);
		f6.setResizable(false);
		f6.setLocationRelativeTo(null);
		f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
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
						
		//hobbies section		
		JLabel a6=new JLabel("HOBBIES SECTION");
		JLabel h=new JLabel("Enter upto FIVE Hobbies");
		JLabel q1=new JLabel("1. ");
		JLabel q2=new JLabel("2. ");
		JLabel q3=new JLabel("3. ");
		JLabel q4=new JLabel("4. ");
		JLabel q5=new JLabel("5. ");
		JTextField h1=new JTextField("");
		JTextField h2=new JTextField("");
		JTextField h3=new JTextField("");
		JTextField h4=new JTextField("");
		JTextField h5=new JTextField("");
		
		JButton back7=new JButton("BACK");
		JButton back7m=new JButton("BACK TO MAIN MENU");
		JButton next7=new JButton("NEXT");
		
		
		f7.setLayout(null);
		a6.setBounds(135,20,150,30);
		h.setBounds(120,50,150,30);
		h1.setBounds(70,80,250,30);
		h2.setBounds(70,125,250,30);
		h3.setBounds(70,170,250,30);
		h4.setBounds(70,215,250,30);
		h5.setBounds(70,260,250,30);

		q1.setBounds(30,80,250,30);
		q2.setBounds(30,125,250,30);
		q3.setBounds(30,170,250,30);
		q4.setBounds(30,215,250,30);
		q5.setBounds(30,260,250,30);

		next7.setBounds(125,320,110,30);
		back7.setBounds(125,360,110,30);
		back7m.setBounds(85,400,190,30);
		
		f7.add(a6);
		f7.add(q1);
		f7.add(q2);
		f7.add(q3);
		f7.add(q4);
		f7.add(q5);
		f7.add(h);
		f7.add(h1);
		f7.add(h2);
		f7.add(h3);
		f7.add(h4);
		f7.add(h5);
		f7.add(back7);
		f7.add(back7m);
		f7.add(next7);

		f7.setSize(390,500);
		f7.setResizable(false);
		f7.setLocationRelativeTo(null);
		f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
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
		back7m.addActionListener(new ActionListener()
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
		
		//EXPERIENCE FRAME==>frame 8
		JLabel a7=new JLabel("EXPERIENCE SECTION");							
		JLabel e_name=new JLabel("Experience Name");
		JLabel e_date=new JLabel("Date (YYYY-MM-DD)");
		JLabel e_description=new JLabel("Description");
			
		JTextField x1=new JTextField("");
		JTextField x2=new JTextField("");
		JTextArea x3=new JTextArea("");
		
		JButton back8=new JButton("BACK");
		JButton back8m=new JButton("BACK TO MAIN MENU");
		JButton register=new JButton("REGISTER");
		JButton generate=new JButton("GENERATE");
		
        x3.setLineWrap(true);
		x3.setWrapStyleWord(true);

		f8.setLayout(null);
		
		a7.setBounds(180,20,150,30);
		e_name.setBounds(30,70,200,30);
		e_date.setBounds(30,105,200,30);
		e_description.setBounds(30,140,200,30);
		
		x1.setBounds(200,70,250,30);
		x2.setBounds(200,105,250,30);
		x3.setBounds(200,140,250,75);
		
		back8.setBounds(185,250,110,30);
		register.setBounds(185,290,110,30);
		generate.setBounds(185,330,110,30);
		back8m.setBounds(145,370,190,30);
		
		f8.add(a7);
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

		f8.setSize(500,480);
		f8.setResizable(false);
		f8.setLocationRelativeTo(null);
		f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","lunaaurora123/");
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
					
					JOptionPane.showMessageDialog(null, "Information inserted successfully!","Information", JOptionPane.PLAIN_MESSAGE);
				}

				catch(Exception ex)
				{
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR 404",JOptionPane.PLAIN_MESSAGE);
				}

			}
		}
		);
		
				
		//OUTPUT FRAME
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("G:/DBS Project/Thing2.png").getImage().getScaledInstance(550, 747, Image.SCALE_DEFAULT));
		JLabel bgm = new JLabel();
		bgm.setIcon(imageIcon);

		JTextArea g1=new JTextArea();			//name
		g1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24));
        g1.setLineWrap(true);
		g1.setWrapStyleWord(true);
		g1.setEditable(false);

		JLabel g2=new JLabel();					//phno
		JLabel g3=new JLabel();					//address
		JLabel g4=new JLabel();					//email
		JLabel g5=new JLabel();					//website
		JLabel g6=new JLabel();					//fb
		JLabel g7=new JLabel();					//ig

		JTextArea g8=new JTextArea();			//profile des
		g8.setFont(new java.awt.Font("Arial", Font. BOLD, 12));
        g8.setLineWrap(true);
		g8.setWrapStyleWord(true);
		g8.setEditable(false);

		JTextArea g9=new JTextArea();			//objective des
		g9.setFont(new java.awt.Font("Arial", Font. BOLD, 12));
        g9.setLineWrap(true);
		g9.setWrapStyleWord(true);
		g9.setEditable(false);

		JLabel g10=new JLabel();				//education level
		JLabel g11=new JLabel();				//education date
		JTextArea g12=new JTextArea();			//education uni
		g12.setFont(new java.awt.Font("Arial", Font. BOLD, 12));
        g12.setLineWrap(true);
		g12.setWrapStyleWord(true);
		g12.setEditable(false);

		JLabel g13=new JLabel();				//skill1
		JLabel g14=new JLabel();				//skill2
		JLabel g15=new JLabel();				//skill3
		JLabel g16=new JLabel();				//skill4
		JLabel g17=new JLabel();				//skill5

		JLabel g18=new JLabel();				//hobbies1
		JLabel g19=new JLabel();				//hobbies2
		JLabel g20=new JLabel();				//hobbies3
		JLabel g21=new JLabel();				//hobbies4
		JLabel g22=new JLabel();				//hobbies5

		JLabel g23=new JLabel();				//experience name
		JLabel g24=new JLabel();				//experience date
		JTextArea g25=new JTextArea();			//experience des
		g25.setFont(new java.awt.Font("Arial", Font. BOLD, 12));
        g25.setLineWrap(true);
		g25.setWrapStyleWord(true);
		g25.setEditable(false);

		//output generate button
		generate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				f8.setVisible(false);
				f9.setVisible(true);
			
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","lunaaurora123/");
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
					String universitys=rset.getString("u_name");
					String dates=rset.getString("edu_date");		//date in string doubt
					
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
					String exp_date=rset.getString("exp_date");
					String exp_des=rset.getString("e_description");
					
					
					g1.setText(names);
					g2.setText(s_phno);	
					g3.setText(adds);
					g4.setText(emails);	
					g5.setText(websites);
					g6.setText(fbs);	
					g7.setText(igs);
					g8.setText(profiles);	
					g9.setText(objectives);	
					g10.setText(levels);
					g11.setText(dates);	
					g12.setText(universitys);
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
					
					} //While END

					//CV FRAME
					f9.setLayout(null);
					
					
					bgm.setBounds(0,0,590,710);
					g1.setBounds(35,70,155,60);
					g2.setBounds(270,37,260,30);
					g3.setBounds(270,61,260,30);
					g4.setBounds(270,87,260,30);
					g5.setBounds(270,112,260,30);
					g6.setBounds(270,137,260,30);
					g7.setBounds(270,164,260,30);

					g8.setBounds(33,185,160,205);

					g9.setBounds(33,450,160,205);	

					g10.setBounds(250,470,270,30);
					g11.setBounds(250,484,270,30);
					g12.setBounds(250,510,270,30);
					
					g13.setBounds(250,584,130,30);
					g14.setBounds(250,606,130,30);
					g15.setBounds(250,627,130,30);
					g16.setBounds(250,648,130,30);
					g17.setBounds(250,670,130,30);
					
					g18.setBounds(250,236,270,30);
					g19.setBounds(250,251,270,30);
					g20.setBounds(250,266,270,30);
					g21.setBounds(250,281,270,30);
					g22.setBounds(250,296,270,30);
					
					g23.setBounds(250,355,270,30);
					g24.setBounds(250,369,270,30);
					g25.setBounds(250,395,270,30);
						
					//set whatever u want to according to the frame color
					g1.setForeground(Color.WHITE);
					g1.setBackground(new java.awt.Color(43, 47, 48));

					g2.setForeground(Color.WHITE);
					g3.setForeground(Color.WHITE);
					g4.setForeground(Color.WHITE);
					g5.setForeground(Color.WHITE);
					g6.setForeground(Color.WHITE);
					g7.setForeground(Color.WHITE);
					
					g8.setForeground(Color.WHITE);
					g8.setBackground(new java.awt.Color(43, 47, 48));
					g9.setForeground(Color.WHITE);
					g9.setBackground(new java.awt.Color(43, 47, 48));
					
					g10.setForeground(new java.awt.Color(43, 47, 48));
					g11.setForeground(new java.awt.Color(43, 47, 48));
					g12.setForeground(new java.awt.Color(43, 47, 48));
					g13.setForeground(new java.awt.Color(43, 47, 48));
					g14.setForeground(new java.awt.Color(43, 47, 48));
					g15.setForeground(new java.awt.Color(43, 47, 48));
					g16.setForeground(new java.awt.Color(43, 47, 48));
					g17.setForeground(new java.awt.Color(43, 47, 48));
					g18.setForeground(new java.awt.Color(43, 47, 48));
					g19.setForeground(new java.awt.Color(43, 47, 48));
					g20.setForeground(new java.awt.Color(43, 47, 48));
					g21.setForeground(new java.awt.Color(43, 47, 48));
					g22.setForeground(new java.awt.Color(43, 47, 48));
					g23.setForeground(new java.awt.Color(43, 47, 48));
					g24.setForeground(new java.awt.Color(43, 47, 48));
					g25.setForeground(new java.awt.Color(43, 47, 48));
					g25.setBackground(Color.WHITE);

					f9.add(g1);
					f9.add(g2);
					f9.add(g3);
					f9.add(g4);
					f9.add(g5);
					f9.add(g6);
					f9.add(g7);
					f9.add(g8);
					f9.add(g9);
					f9.add(g10);
					f9.add(g11);
					f9.add(g12);
					f9.add(g13);
					f9.add(g14);
					f9.add(g15);
					f9.add(g16);
					f9.add(g17);
					f9.add(g18);
					f9.add(g19);
					f9.add(g20);
					f9.add(g21);
					f9.add(g22);
					f9.add(g23);
					f9.add(g24);
					f9.add(g25);
					
					f9.add(bgm);
					f9.setSize(560,735);
					f9.setResizable(false);
					f9.setLocationRelativeTo(null);
					f9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				}

				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex,"error 404 b",JOptionPane.PLAIN_MESSAGE);
				}			
			}
		}
		);

		//FRAME 1 SHIZZ
//		f1.getContentPane().setBackground(new java.awt.Color(43, 47, 48));
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setSize(400,550);
		f1.setLocationRelativeTo(null);
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
