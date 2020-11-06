package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, inter;
		System.out.println("Introduzac el primer valor");
		a=teclado.nextInt();
		System.out.println("Introduzac el segundo valor");
		b=teclado.nextInt();
		inter = a;
		a = b;
		b = inter;
		
		System.out.println("Ahora el primer valor vale " + a);
		System.out.println("Ahora el segundo valor vale " + b);
		teclado.close();
	}

}
/*
PROGRAMA ejercicio11
VARIABLES
    ENTERO a, b, inter
INICIO
    ESCRIBIR "Introduzca el primer valor"
    LEER a

    ESCRBIR "Introduzca el segundo valor"
    LEER b

 	inter = a
 	a = b
 	b = inter
    
FIN
*/