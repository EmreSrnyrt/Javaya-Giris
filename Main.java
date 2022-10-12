package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(                                   );

		String internetSubeButonu = "Ýnternet Þubeye Gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		System.out.println(                                   );
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar Düþtü Resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar Yükseldi Resmi");
		}else {
			System.out.println("Dolar eþittir resmi");
		}
		
		
		System.out.println(                                   );
		
		
		String kredi1 ="Hýzlý kredi";
		String kredi2 ="Mutlu emekli kredisi";
		String kredi3 ="Konut kredisi";
		String kredi4 ="Çiftçi kredisi";
		String kredi5 ="MSB kredisi";
		String kredi6 ="Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		System.out.println(                                   );
		
		String[] krediler = {"Hýzlý kredi","Mutlu emekli kredisi","Konut kredisi","Çiftçi kredisi","MSB kredisi","Meb kredisi"};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println(                                   );
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		System.out.println(                                   );
		
		int sayi1 = 10;
		int sayi2 =20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		System.out.println(                                   );
		
		int[] sayýlar1 = {1,2,3,4,5};
		int[] sayýlar2 = {10,20,30,40,50};
		
		sayýlar1 = sayýlar2;
		sayýlar2[0] = 100;
		
		System.out.println(sayýlar1[0]);
		System.out.println(                                   );
		
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
		
		
		
		
		
		
		
		
	}

}
