package test;
//Bài 2: Viết hàm giải phương trình bậc 2
public class Test2_0410 {
	public static void ptb2 (double a, double b, double c){
		double delta = b*b - 4*a*c;
		if (delta < 0)
		{
			System.out.println("Phuong trinh vo nghiem");	
		}
		else if (delta == 0)
		{
		    double x1 = (-b)/2*a;
		    System.out.println("Phuong trinh co nghiem kep:" + "x1 = " + x1);
		}
		else 
		{
			double x1 = (-b - Math.sqrt(delta))/2*a;
			double x2 = (-b + Math.sqrt(delta))/2*a;
		    System.out.println("Phuong trinh co 2 nghiem phan biet:");	
		    System.out.println("x1=" + x1);
		    System.out.println("x2=" + x2);
		}
		
	}
	public static void main(String[] args){
		ptb2 (2, 4, 2);
		//System.out.println();
	}
	

}
