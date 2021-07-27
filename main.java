package punto_2;
import java.util.Scanner;
public class main {
	
	static String Nombre;
	static String Apellido;
	static String Ciudad;
	static long Celular;
	static double ingreso;
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado: ");
		Nombre = entrada.nextLine();
		System.out.println("Ingrese su apellido: ");
		Apellido = entrada.nextLine();
		System.out.println("Ingrese su ciudad: ");
		Ciudad = entrada.nextLine();
		System.out.println("Ingrese su numero celular: ");
		Celular = entrada.nextLong();
		System.out.println("Ingrese su ingreso mensual: ");
		ingreso = entrada.nextDouble();
		
		double impt1 = ingreso *2;
		double impt2 = ingreso *0.50;
		
		impuestos imp1 = new impuestos(Nombre,Apellido,Ciudad,Celular,ingreso);
		
		System.out.println("************************************* Plataforma de Impuestos *********************************************************\n");
		System.out.println("Nombre del empleado: "+Nombre+" "+Apellido);
		System.out.println("Ciudad de residencia del empleado: "+Ciudad);
		System.out.println("Numero de Celular del empleado: "+Celular);
		
	    if (1500000<ingreso){   
			System.out.println("Te informo que debes pagar de impuestos: "+impt1);
		}
	    
		else{
			System.out.println("Te informo que debes pagar de impuestos:"+impt2);
		}
	    
		System.out.println("Ingreso trimestral: "+imp1.ing_trimestra());
		System.out.println("Ingreso semestral: "+imp1.ing_semestral());
		System.out.println("Ingreso anual: "+imp1.ing_anual()+"\n");
		System.out.println("***********************************************************************************************************************\n");
		
        entrada.close();
	}
}
