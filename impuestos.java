package punto_2;

public class impuestos {
	String Nombre, Apellido,Ciudad;
	long Celular;
    double  ingreso;
		
	public impuestos (String Nombre,String Apellido,String Ciudad,long Celular, double ingreso) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Ciudad = Ciudad;
		this.Celular = Celular;
		this.ingreso = ingreso;	
	}
	
	public long ing_trimestra() {
		long T=  (long) (ingreso * 3);
		return T;
	}
	
	public long ing_semestral() {
		long S= (long) (ingreso * 6);
		return S;
	}
	
	public long ing_anual() {
		long A= (long) (ingreso * 12);
		return A;
	}
	
}


	


