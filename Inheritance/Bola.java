import java.util.Scanner;

public class Bola
{
	public static void main(String[] args)
	{
		JariJari R = new JariJari();
		Volume Vol = new Volume();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Super Class");
		System.out.print("Masukkan Nilai Jari jari: ");
		R.r = input.nextDouble();
		R.JariJari();
		System.out.println();
		
		System.out.println("Sub Class");
		System.out.print("Masukkan Nilai Jari jari: ");
		Vol.r = input.nextDouble();
		Vol.phi = 3.14;
		Vol.x = 4/3;
		Vol.Volume();
	}
}