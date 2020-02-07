package clase1;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realice un programa que pida un nombre, apellido,edad, numero de telefono
		//se debe mostrar en pantalla los 4 datos ingresados.

		
Scanner sc =new Scanner(System.in);// el in es el dato de entrada
		
		
		String nombre, apellido;
		int edad, tfono;
		
		
 System.out.print("Ingrese un nombre");
 nombre=sc.nextLine();
 System.out.print("Ingrese un apellido");
 apellido=sc.nextLine();
 System.out.print("Ingrese Edad");
 edad=sc.nextInt();
 System.out.print("Ingrese numero de telefono");
 tfono=sc.nextInt();
 
 System.out.print("Su nombre es: \n"+nombre +"\n"+ "Su apellido es: \n"+ apellido + " se edad es: \n"+edad+"Su nuemero de telefono es: \n"+ tfono);//' ' es el espacio entre las variables a mostrar en pantalla 
 
		
		
		
		
		
		
	}

}
