
public class Main {
	public static void main(String[] args) {
	    Insanlar insan0= new Insanlar();
		Insanlar insan2 = new Insanlar();
		Insanlar insan1 = new Insanlar();
		
		
		insan1.setad("MELİKE");
		insan1.setsoyad("ERKAN");
		insan1.setyas(21);
		insan1.setboy(168);
		insan1.setkilo(60);
		insan2.setad("CANAN");
		insan2.setsoyad("TANER");
		insan2.setyas(21);
		insan2.setboy(170);
		insan2.setkilo(80);
		insan0.setad("ALİ");
		insan0.setsoyad("VELİ");
		insan0.setyas(30);
		insan0.setkilo(80);
		insan0.setboy(180);
		
		System.out.println("AD:" + insan1.getad());
		System.out.println("SOYAD:" + insan1.getsoyad());
		System.out.println("YAS:" + insan1.getyas());
		System.out.println("KİLO:" + insan1.getkilo());
		System.out.println("BOY:" + insan1.getboy());

		System.out.println("-------------");
		
		System.out.println("AD:"+ insan2.getad());
		System.out.println("SOYAD:"+ insan2.getsoyad());
		System.out.println("YAS:"+ insan2.getyas());
		System.out.println("KILO:"+ insan2.getkilo());
		System.out.println("BOY:"+ insan2.getboy());
		
		System.out.println("-------------");
		
		System.out.println("AD:" + insan0.getad());
		System.out.println("SOYAD:" + insan0.getsoyad());
		System.out.println("YAS:" + insan0.getyas());
		System.out.println("KILO:" + insan0.getkilo());
		System.out.println("BOY:" + insan0.getboy());
	   
		NufusDB test = new NufusDB();
		test.Yazdir();
	}

       
        }
        
		
	