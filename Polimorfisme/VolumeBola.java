import java.util.Scanner;

public class VolumeBola
{
	public static void main(String[] args)
	{
		Phi phi = new Phi();
		R jari = new R();
		H con = new H();
		Volume Vol = new Volume();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Jari Jari Bola = ");
		Vol.r = in.nextDouble();
		Vol.phi = 3.14;
		Vol.h = 4 /3;
		Vol.Volume();
	}
}