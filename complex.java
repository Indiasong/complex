import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;

public class complex 
{
	   double real,image;
	   public complex(double x,double y)
	   {
		   real=x;
		   image=y;
	   }
	   public complex()
	   {
		   real=0;
		   image=0;
	   }
	  public complex add(complex a,complex b){
		   complex end=new complex();
		   end.real=a.real+b.real;
		   end.image=a.image+b.image;
		   return end;
	   }
	   public complex sub(complex a,complex b){
		   complex end=new complex();
		   end.real=a.real-b.real;
		   end.image=a.image-b.image;
		   return end;
	   }
	   public complex mul(complex a,complex b){
		   complex end=new complex();
		   end.real=a.real*b.real-a.image*b.image;
		   end.image=a.real*b.real+a.image*b.image;
		   return end;
	   }
}
