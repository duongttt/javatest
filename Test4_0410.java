//Bài 4: Cho một chuỗi. Yêu cầu tìm ký tự xuất hiện nhiều nhất trong chuỗi

//Get ký tự đầu tiên trong chuỗi: dùng String substring lấy từ ký tự -> đến ký tự. 
//Tính xem ký tự đó xuất hiện bao nhiêu lần trong chuỗi: dùng StringUtils.countMatches
//Lưu lại ký tự mới và số lần xuất hiện mới nếu như số lần xuất hiện của ký tự xét tiếp theo ở vòng lặp mới lớn hơn số lần xuất hiện ở vòng lặp cũ.
package test;

import org.apache.commons.lang.StringUtils;

public class Test4_0410 {
	public static void Findkytu(String chuoi) {
		int dodaichuoi = chuoi.length();                         //Do dai chuoi
		
		String charResult = "";                                  //Ky tu check  
		int cntResult = 0;                                       //So lan xuat hien

		for(int vitrikiemtra = 0; vitrikiemtra < dodaichuoi; vitrikiemtra++)
		{
			String y = chuoi.substring(vitrikiemtra, vitrikiemtra + 1);
			int solanxuathien = StringUtils.countMatches(chuoi, y);
			if (solanxuathien > cntResult) 
			{
				cntResult = solanxuathien;
				charResult = y;
				}
			chuoi = StringUtils.remove(chuoi, y);
			dodaichuoi = chuoi.length();
		}
		System.out.println(charResult + " xuat hien " + cntResult + " lan");
	}
	public static void main (String[]args){
		Findkytu("A Japanese court has blocked the restarting of two nuclear reactors in the western city of Takahama, after local people raised safety concerns.The plant had already obtained approval from the country's nuclear watchdog.But locals had petitioned the court in Fukui prefecture, where Takahama is located, to intervene, saying it would not withstand a strong earthquake.All 48 commercial reactors in Japan remain offline following 2011's Fukushima disaster.The BBC's Rupert Wingfield-Hayes in Tokyo says the ruling is a serious blow for Prime Minister Shinzo Abe's push to have the reactors restarted.Mr Abe has said the shutdown is damaging the struggling economy, forcing Japan to import expensive fossil fuels to make up the power shortfall.");
	}
}
