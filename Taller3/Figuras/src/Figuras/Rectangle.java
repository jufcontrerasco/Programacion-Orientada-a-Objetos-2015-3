package Figuras;

public class Rectangle {
	 private double length=1;
	 private double width=1;
	 
	 public Rectangle(double length, double width) {
		 this.setLength(length);
	     this.setWidth(width);
	     }   
	 public double getLength() {
	     return length;
	     }
	 public void setLength(double length) {
	     if(length<20.0&&length>0.0){
	    	this.length = length;
	     	}else{
	     		System.out.println("The value is out of range");
	     		}
	     }
	 public double getWidth() {
	     return width;
	     }
	 public void setWidth(double width) {
	     if(width<20.0&&width>0.0){
	    	 this.width = width;
	     	 }else{
	     		 System.out.println("The value is out of range");
	     	 	 }
	     }
	 public double getPerimeterr(){
	     return 2*(width+length);
	     }
	 public double getArear(){
	     return width*length;
	     }   
}
