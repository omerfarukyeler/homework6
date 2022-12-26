package homeworks_6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
	
	car_properties car3 = new car_properties();
	
    System.out.print("site ismi giriniz : " );
	
	car_properties.platform = scan.nextLine();
	
	
	
	System.out.print("ilan no giriniz :");
	
	car_properties.ilan_no =scan.nextInt();
	
	System.out.print("marka giriniz	  : ");
	
	car_properties.marka =scan.nextLine();
	
	scan.nextLine();
	
	System.out.print("seri giriniz :");
	
	car_properties.seri =scan.nextInt();
	
	System.out.print("model giriniz :");
	
	car_properties.model =scan.nextLine();
	
	scan.nextLine();	
	

	car_properties car1 = new car_properties(2015,32.438,"otomatik","Benzin","Coupe");//parametreli
	
	car_properties car2 = new car_properties();//parametresiz 
	
	
	car3.showInfos();
	
	car1.showInfos1();
	
	car2.showInfos2();
	
	
	}
	
	   

}
