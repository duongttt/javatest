package test;
//Bài 1: Viết một hàm, có 2 đối số, trả về số lớn nhất trong 2 số truyền vào




public class Test1_0410 {	
	public static double compare(double x, double y) {
		if(x < y) 
		return y; 
		else return x;
	}
	public static void main(String[] args){
		System.out.println(compare(20.9, 20));
			
	}
}



