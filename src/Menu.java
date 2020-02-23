import java.util.Scanner;

	public class Menu{

		static int arrays1[];
		static int arrays2[];
		static int arrays3[];

		
		public static void desMenu1(){
			
			System.out.println(" ------MENU------ \n Ingrese el numero de opcion que desee realizar:");
			System.out.println("(1).Ingresar tres cadenas de caracteres");
			System.out.println("(2).Ingresar dos numeros reales mayores a cero");
			System.out.println("(3).Ingresar tres arreglos de numeros enteros");
			
		}
		public static void desSubMenuA(){

			System.out.println("------SUB MENU 1------ \n Ingrese la opcion de desea realizar con las palabras ingresadas:");			
			System.out.println("(4).Desplegar la longitud de cada una de las cadenas");			
			System.out.println("(5).Concatenar las tres cadenas y mostrar en pantalla");
			System.out.println("(6).Mostrar en pantalla el carácter ubicado en una posición de la cadena");
			
		}
		
		public static void desSubMenuB(){

			System.out.println("------SUB MENU 2------ \n Ingrese la opcion de desea realizar con los numeros ingresadas:");			
			System.out.println("(7).Mostrar la división  de ambos numeros");			
			System.out.println("(8).Mostrar la division y el residuo de ambos numeros");
			
		}

		public static void desSubMenuC(){

			System.out.println("------SUB MENU 3------ \n Ingrese la opcion de desea realizar con los numeros ingresadas:");		
			System.out.println("(9).Desplegar en pantalla los tres arreglos ingresados.");			
			System.out.println("(10).Indicar el valor promedio de los valores ingresados,");
			System.out.println("(11).Indique el mayor valor de los valores ingresados al arreglo");
			System.out.println("(12).");

		}

		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			
			desMenu1();
			
			int opt = scan.nextInt();
			scan.nextLine();
			
			String[] cadena = new String[3];
			
			switch(opt){


				case 1:

					// se crean los arreglos de tipo String

					System.out.println("primera palabra");
					cadena[0] = scan.nextLine();
					
					System.out.println("segunda palabra");				
					cadena[1] = scan.nextLine();
					
					System.out.println("tercera palabra");		
					cadena[2] = scan.nextLine();
					
					// se despliega el sub menu A de la opcion #1

					desSubMenuA();
					opt = scan.nextInt();

					// se realizan las opciones escogidas por el usuario
					
					if(opt==4){
						
						System.out.println("la longitud de la primera cadena es: " + cadena[0].length());
						System.out.println("la longitud de la segunda cadena es: " + cadena[1].length());	
						System.out.println("la longitud de la tercera cadena es: " + cadena[2].length());						
						
					} else if(opt==5){
						
						System.out.println("Las palabras ingresadas en oracion es: " +cadena[0] +" "+cadena[1] +" "+cadena[2]);
						
					}
					
					// falta hacer el punto 5 

				break;
				
				

				case 2:

					// se ingresan dos numeros reales para realizar una division

					System.out.println("primer numero real mayor a 0");
					double num1 = scan.nextDouble();
					
					System.out.println("segundo numero real mayor a 0");
					double num2 = scan.nextDouble();
					
					// se despliega el sub menu b de la opcion #2

					desSubMenuB();
					opt = scan.nextInt();

					// se realizan las operaciones escogidas por el usuario
					
					if(opt==7){
						
						System.out.println(division(num1,num2));						
						
					} else if(opt==8){
						
						System.out.println("la division es: " + division(num1,num2) + "\n el residuo es: " + modulo(num1,num2));
						
					}

					System.out.println("Finished");				
					
					
				break;
				
				case 3:

					// se crean tres arreglos de tipo int y el usuario ingresa el tamaño de cada uno
					// en el for el usuario ingresa los valores para almacenar en cada arreglos

					System.out.println("ingrese el tamaño del primer arreglo");
					arrays1 = new int[scan.nextInt()];


					System.out.println("ingrese los valores que desea que contenga el primer arreglo");


					for(int i=0; i<arrays1.length; i++){

						arrays1[i]= scan.nextInt();

					}

					System.out.println("ingrese el tamaño del segundo arreglo");
					arrays2 = new int[scan.nextInt()];


					System.out.println("ingrese los valores que desea que contenga el segundo arreglo");

					for(int i=0; i<arrays1.length; i++){

						arrays2[i]= scan.nextInt();

					}

					System.out.println("ingrese el tamaño del tercer arreglo");
					arrays3 = new int[scan.nextInt()];

					System.out.println("ingrese los valores que desea que contenga el tercer arreglo");

					for(int i=0; i<arrays1.length; i++){

						arrays3[i]= scan.nextInt();

					}

					// se despliega el sub menu C de la opcion #3

					desSubMenuC();
					opt = scan.nextInt();

					// se realizan las operaciones escogidas por el usuruario del sub menu C

					if(opt==9){

						desArreglos(arrays1, arrays2, arrays3);


					}





					System.out.println("Finished");	


				break;
				
				
			
				
			}
			

			
		}

		//metodos para realizar las operaciones del sub menu B de la opcion numero #2
		public static double division(double num1, double num2){

			return num1/num2;

		}

		public static double modulo(double num1, double num2){

			return num1%num2;

		}

		// metodos para realizar las operaciones del sub menu C de la opcion #3

		public static void desArreglos(int[] arrays1, int[] arrays2, int[] arrays3){

			System.out.println("el arreglo 1 tiene:");

			for(int i=0; i<arrays1.length; i++){

				System.out.println(arrays1[i]);

			}

			System.out.println("el arreglo 2 tiene:");

			for(int i=0; i<arrays2.length; i++){

				System.out.println( arrays2[i]);

			}
			System.out.println("el arreglo 3 tiene:");

			for(int i=0; i<arrays3.length; i++){

				System.out.println(arrays3[i]);

			}

		}
	


	
	}