package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(                                   );

		String internetSubeButonu = "�nternet �ubeye Gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		System.out.println(                                   );
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D��t� Resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar Y�kseldi Resmi");
		}else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		
		System.out.println(                                   );
		
		
		String kredi1 ="H�zl� kredi";
		String kredi2 ="Mutlu emekli kredisi";
		String kredi3 ="Konut kredisi";
		String kredi4 ="�ift�i kredisi";
		String kredi5 ="MSB kredisi";
		String kredi6 ="Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		System.out.println(                                   );
		
		String[] krediler = {"H�zl� kredi","Mutlu emekli kredisi","Konut kredisi","�ift�i kredisi","MSB kredisi","Meb kredisi"};
		
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
		
		int[] say�lar1 = {1,2,3,4,5};
		int[] say�lar2 = {10,20,30,40,50};
		
		say�lar1 = say�lar2;
		say�lar2[0] = 100;
		
		System.out.println(say�lar1[0]);
		System.out.println(                                   );
		
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		
		
		
		
		
		
		
		
	}

}
