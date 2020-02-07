package clase1;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);// el in es el dato de entrada
		
		
		String nombre, apellido;
		
		
 System.out.print("Ingrese un nombre");
 nombre=sc.nextLine();
 System.out.print("Ingrese un apellido");
 apellido=sc.nextLine();
 
 System.out.print(nombre+ ' '+ apellido);//' ' es el espacio entre las variables a mostrar en pantalla 
 
 
 
	}

}
