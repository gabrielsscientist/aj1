package aj1labs;

public class aj1 {

	public static void main(String[] args) {
		//pág. 44
		String frase = new String("Epiousin é a melhor empresa do mundo!");
		System.out.println(frase);
		
		//pág.62
		int i = 999;
		short s;
		byte b;
				
		s = (short)i;
		b = (byte)s;
		
		//pág. 92
		String[] palavras = new String[3];
		
		palavras[0] = "Lobos";
		palavras[1] = "Uniso";
		
		for(int pos = 0; pos < palavras.length; pos++) {
			System.out.println(palavras[pos] + " ");
		}
		
		//pág. 107		
		int x[][] = new int[3][];
		x[0] = new int[2];
		x[1] = new int[3];
		x[2] = new int[4];
		x[0][0] = 6;
		
		int y[][][] = new int[3][2][2];
	}

}
