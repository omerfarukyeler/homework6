package homeworks_6;

public class car_properties {
	
	
	
	static String platform  ;                  //"porsche"
	
	static int ilan_no ;                       //19495710;
	
	static String marka ;                      //"Porshe";
	
	static int seri ;                          //911;
	
	static String model ;                      //"Carrera4";
	
	static int yil = 2015 ;
	
	double kilometre = 32.438 ;
	
	static String vites_tipi ="otomatik";
	
	static String yakit_tipi ="Benzin";
	
	static String kasa_tipi = "Coupe";
	
	static String motor_hacmi ="3436" ;
	
	static String motor_gucu =" 345 hp";
	
	static String cekis ="AWD(Elektronik)";
	
	static String boya_durumu ="1 boyali";
	
	static String kimden ="Galeriden";
	
	public car_properties() {
		
		this.motor_hacmi ="3436";
		
		this.motor_gucu = "345 hp";
		
		this.cekis ="AWD(Elektronik)";
		
		this.boya_durumu = "1 boyali";
				
		this.kimden ="Galeriden";	
	}
	
	public car_properties(int yil,double kilometre,String vites_tipi,String yakit_tipi,String kasa_tipi) {
		
		this.yil =yil;
		this.kilometre =kilometre;
		this.vites_tipi=vites_tipi;
		this.yakit_tipi =yakit_tipi;
		this.kasa_tipi =kasa_tipi;
	}
	
	
		
	
	public void showInfos1(){
		
		System.out.println("Arabanin yili        :" + this.yil);
		System.out.println("Arabanin kilometresi :" + this.kilometre);
		System.out.println("Arabanin vites tipi  :" + this.vites_tipi);
		System.out.println("Arabanin yakit tipi  :" + this.yakit_tipi);
		System.out.println("Arabanin kasa tipi   :" + this.kasa_tipi);
		
	}
	
	public void showInfos2() {
		
		System.out.println("Motor hacmi          :" + this.motor_hacmi);
		System.out.println("Motor gucu           :" + this.motor_gucu);
		System.out.println("Cekis                :" + this.cekis);
		System.out.println("Boya durumu          :" + this.boya_durumu);
		System.out.println("Kimden               :" + this.kimden);
		
		
		
	}
	
	public void showInfos() {
		
		System.out.println("Site ismi            :"+this.platform);
		System.out.println("Ilan no              : "+this.ilan_no);		
		System.out.println("Marka                :"+this.marka);
		System.out.println("Seri                 :"+this.seri);
		System.out.println("Model                :"+this.model);
	}
	
	
		
	
		
	}
	
	
	


