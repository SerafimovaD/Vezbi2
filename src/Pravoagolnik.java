import java.util.Scanner;

public class Pravoagolnik {
	public static void main(String []args) {
		double str1, str2, povrsina, perimetar;
		Scanner tastatura=new Scanner (System.in);
		System.out.print("Programata presmetuva povrsina na pravoagolnik");
		System.out.print("Vnesete dolzina na edna strana");
		str1=tastatura.nextDouble();
		System.out.print("Vnesete dolzina na druga strana");
		str2=tastatura.nextDouble();
		povrsina=str1*str2;
		perimetar=2*str1+2*str2;
		System.out.print("Perimetarot e: " + perimetar);
		//System.out.print(perimetar);
		System.out.print("Plostinata e: " + povrsina);
		//System.out.print(povrsina);
		
	}

}
