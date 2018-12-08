import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class windou implements ActionListener
{
	 TextField aa = new TextField();
     TextField ab = new TextField();
     TextField ba = new TextField();
     TextField bb = new TextField();
     TextField ca = new TextField();
     TextField cb = new TextField();
     TextField da = new TextField();
     TextField db = new TextField();//设置文本框
     
     Label ad1 = new Label("     +");
     Label xi1 = new Label("i");
     Label ad2 = new Label("     +");
     Label xi2 = new Label("i");
     Label ad3 = new Label("     +");
     Label xi3 = new Label("i");
     Label ad4 = new Label("     +");
     Label xi4 = new Label("i");
     Label kong = new Label("          ");//设置标签
     
     Button equal= new Button("=");//设置‘=’按钮
     
     JFrame jFrame;//设置框架
     
     JComboBox<Character> comboBox;
     JComboBox<Character> comboBox1;//设置下拉列表
     
     boolean flag = true;
      
	 complex a =  new complex(0,0);
	 complex b =  new complex(0,0);
	 complex c =  new complex(0,0);
	 complex d =  new complex(0,0);
	 
	 String a1,a2,b1,b2;
	 Double A,B,C,D;
     
     public windou() 
     {
        	 JFrame jFrame = new JFrame();
        	 Container container = jFrame.getContentPane();
        	 
        	 comboBox = new JComboBox<Character>();
        	 comboBox.setBounds(11,11,80,21);
        	 comboBox.addItem('+');
        	 comboBox.addItem('-');
        	 comboBox.addItem('*');
        	 comboBox.setFont(new Font("宋体",30,30));
        	 
        	 comboBox1 = new JComboBox<Character>();
        	 comboBox1.setBounds(110,11,80,21);
        	 comboBox1.addItem('+');
        	 comboBox1.addItem('-');
        	 comboBox1.addItem('*');
        	 comboBox1.setFont(new Font("宋体",30,30));//编辑下拉列表
        	 
        	 aa.setFont(new Font("宋体",Font.BOLD,30));
        	 ab.setFont(new Font("宋体",Font.BOLD,30));
        	 ba.setFont(new Font("宋体",Font.BOLD,30));
        	 bb.setFont(new Font("宋体",Font.BOLD,30));
        	 ca.setFont(new Font("宋体",Font.BOLD,30));
        	 cb.setFont(new Font("宋体",Font.BOLD,30));
        	 da.setFont(new Font("宋体",Font.BOLD,30));
        	 db.setFont(new Font("宋体",Font.BOLD,30));
        	 da.setEditable(false);
        	 db.setEditable(false);//编辑文本框
        	 inputLimit(aa);
 			 inputLimit(ab);
 			 inputLimit(ba);
 			 inputLimit(bb);
 			 inputLimit(ca);
			 inputLimit(cb);
        	 
        	 ad1.setFont(new Font("宋体",Font.BOLD,30));
        	 xi1.setFont(new Font("宋体",Font.BOLD,30));
        	 ad2.setFont(new Font("宋体",Font.BOLD,30));
        	 xi2.setFont(new Font("宋体",Font.BOLD,30));
        	 ad3.setFont(new Font("宋体",Font.BOLD,30));
        	 xi3.setFont(new Font("宋体",Font.BOLD,30));
        	 ad4.setFont(new Font("宋体",Font.BOLD,30));
        	 xi4.setFont(new Font("宋体",Font.BOLD,30));
        	 
        	 equal.setFont(new Font("宋体",Font.CENTER_BASELINE,30));//编辑按钮
        	 
        	 container.setLayout(new GridLayout(4,4));
        	 container.add(kong);
        	 container.add(aa); container.add(ad1); container.add(ab); container.add(xi1);
        	 container.add(comboBox);
        	 container.add(ba); container.add(ad2); container.add(bb); container.add(xi2);
        	 container.add(comboBox1);
        	 container.add(ca); container.add(ad3); container.add(cb); container.add(xi3);
        	 container.add(equal);
        	 container.add(da); container.add(ad4); container.add(db); container.add(xi4);//将各部分添加到边框中
        	 comboBox.addActionListener(this);
        	 container.setBackground(Color.white);
        	 jFrame.setVisible(true);
        	 jFrame.setSize(600, 200);
        	 jFrame.setTitle("复数计算器");
        	 jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        	 
        	 init();
         }
     private void init()
     {
    	 result();
    	 result2();
     }
	public void actionPerformed(ActionEvent arg0) 
	{
		
		
	}
	
	 public void inputLimit(TextField a)
	  {
		 a.addKeyListener(new KeyAdapter() {

           public void keyPressed(KeyEvent e) {
           char ch = e.getKeyChar();
           if(!(ch>='0'&& ch<='9') && !(ch == KeyEvent.VK_PERIOD)&&!(ch== KeyEvent.VK_DELETE)&&!(ch==KeyEvent.VK_BACK_SPACE))
           {
                        Dialog();
                    }
              }
         });
}
	 
	 public void result() 
	 {
		    inputLimit(aa);
			inputLimit(ab);
			inputLimit(ba);
			inputLimit(bb);
		  equal.addMouseListener(new MouseAdapter()
		  {
			  @SuppressWarnings("unlikely-arg-type")
			public void mouseClicked(MouseEvent e)
			  {
					a1 = aa.getText();
					b1 = ab.getText();
					a2 = ba.getText();
					b2 = bb.getText();
					A = Double.parseDouble(a1);
					B = Double.parseDouble(b1);
					C = Double.parseDouble(a2);
					D = Double.parseDouble(b2);
					complex a = new complex(A,B);
					complex b = new complex(C,D);
				if("+".equals(comboBox.getSelectedItem().toString()))
				{
					c = c.add(a,b);
				}
				if("-".equals(comboBox.getSelectedItem().toString()))
				{
					c = c.sub(a,b);
				}
				if("*".equals(comboBox.getSelectedItem().toString()))
				{
					c = c.mul(a,b);
				}
			  }
			});
	 }//设置监听器，并对监听到的项目进行特定的操作
	 public void result2() 
	 {
		    inputLimit(ca);
			inputLimit(cb);
		  equal.addMouseListener(new MouseAdapter()
		  {
			  @SuppressWarnings("unlikely-arg-type")
			public void mouseClicked(MouseEvent e)
			  {
					a1 = ca.getText();
					b1 = cb.getText();
					A = Double.parseDouble(a1);
					B = Double.parseDouble(b1);
					complex a = new complex(A,B);
				if("+".equals(comboBox1.getSelectedItem().toString()))
				{
					d = d.add(c,a);
					a2 = String.valueOf(d.real);
					b2 = String.valueOf(d.image);
					da.setText(a2);
					db.setText(b2);
					da.getText();
					db.getText();
				}
				if("-".equals(comboBox1.getSelectedItem().toString()))
				{
					d = d.sub(c,a);
					a2 = String.valueOf(d.real);
					b2 = String.valueOf(d.image);
					da.setText(a2);
					db.setText(b2);
					da.getText();
					db.getText();
				}
				if("*".equals(comboBox1.getSelectedItem().toString()))
				{
					d = d.mul(c,a);
					a2 = String.valueOf(d.real);
					b2 = String.valueOf(d.image);
					da.setText(a2);
					db.setText(b2);
					da.getText();
					db.getText();
					
				}
			  }
			});
	 }//设置监听器，并对监听到的项目进行特定的操作
	
     public void Dialog()
	    {
    	    JDialog dialog = new JDialog(jFrame, "输入有误！", true);
	        dialog.setBounds(400, 400, 300, 100);
	        JPanel jPanel = new JPanel();
	        jPanel.setLayout(new BorderLayout());
	        JLabel jLabel = new JLabel("您输入的信息有误，请检查！");
	        jLabel.setFont(new Font("宋体", 1, 20));
	        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        JButton jButton = new JButton("确定");
	        jPanel.add(jLabel, BorderLayout.CENTER);
	        jPanel.add(jButton, BorderLayout.SOUTH);
	        dialog.add(jPanel);
	        dialog.validate();
	        dialog.setResizable(false);
	        dialog.setVisible(true);
	    }//设定对话框
	 
	public static void main(String[] args)
	{
	        new windou();
	}
}
