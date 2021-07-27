package Forma_2;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double G, Abril,Mayo,Junio;
		long Total;
		String Nombre, Apellido;
		
		
		 System.out.println("Ingrese su nombre: ");
	        Nombre = entrada.nextLine();
	        
	        System.out.println("Ingrese su apellido: ");
	        Apellido = entrada.nextLine();
	

	        System.out.println("DIGITE las ganancias \n" );
	        G = entrada.nextDouble();
	        
	      
	       Ganancias prueba = new Ganancias(G);
	       Abril = prueba.Marzo()*0.80;
	       Mayo = (prueba.Febrero()+prueba.Marzo())/3;
	       Junio =(prueba.Enero()+prueba.Febrero()+prueba.Marzo()+Abril+Mayo)/5;
	       Total = (long) (prueba.Enero()+prueba.Febrero()+prueba.Marzo()+Abril+Mayo+Junio);
	       
	       System.out.println("\n El administrador es "+Nombre+" "+Apellido+"\n");
	       
	       System.out.println("************************************* Ganancias del mes *********************************************************\n");
           System.out.println("Mes de enero la ganancias fue: "+prueba.Enero());
           System.out.println("Mes de febrero la ganancias fue: "+prueba.Febrero());
           System.out.println("Mes de marzo la ganancias fue: "+prueba.Marzo());
           System.out.println("Mes de abril la ganancia fue: "+Abril );
           System.out.println("Mes de Mayo la ganancia fue: "+Mayo);
           System.out.println("Mes de junio la ganancia fue: "+Junio);
           System.out.println("El total  la ganancia en el primer semestre del año fue: "+Total+"\n");
           System.out.println("*****************************************************************************************************************");

           entrada.close();

	}

}
