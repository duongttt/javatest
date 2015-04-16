package test;
//Bài 3: số hoàn hảo là số có tổng các ước nhỏ hơn nó bằng chính nó
//ví dụ: 6 = 3 + 2 + 1
//viết chương trình in ra các số hoàn hảo từ 1-1000

//Xét số bị chia = a. Check xem số bị chia chia hết cho những số chia nào, thì ghi lại những số chia đó và tính cộng dồn lại.
//Nếu tổng các số chia này = số bị chia (ở đây đã loại bỏ luôn phép chia cho chính nó) -> đó là số hoàn hảo
public class Test3_0410 {
	public static void main(String[]args){
		int sobichia = 1;
		while (sobichia < 1000){
			int sochia = 1;
			int tong = 0;
		    for (sochia = 1; sochia < sobichia; sochia++)
		{
	    if (sobichia % sochia == 0)
	    	{
		    tong = tong + sochia;
		    }
		}
		if (sobichia == tong)
		{
			System.out.println(sobichia);	    		 		     
		}
		sobichia++;
   }
	}
}