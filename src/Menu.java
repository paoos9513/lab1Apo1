import java.util.Scanner;

	public class Menu{
		//-----------------MENU------------------//
		public final static int ADD_STRING = 1;
		public final static int REAL_NUMBERS = 2;
		public final static int ARRAYS = 3;

		//-------------SUB MENU A--------------------//
		public final static int LENGTH_STRING = 4;
		public final static int CONCATENATE_STRING = 5;
		public final static int SEE_CHAR = 6;

		//-------------SUB MENU B--------------------//
		public final static int DIVISION = 7;
		public final static int RESIDUE = 8;

		//-------------SUB MENU C------------------//
		public final static int SEE_ARRAYS= 9;
		public final static int AVERAGE = 10;
		public final static int BIGGER = 11;
		public final static int NEW_ARRAY = 12;
		public final static int NEW_ARRAY_UNION_REPEAT = 13;
		public final static int NEW_ARRAY_NUMBERS_DIFF = 14;
		public final static int NEW_ARRAY_NUMBERS_EQUALS = 15;
		public final static int TURN_POSITIONS=16;
		public final static int ORDER_MINOR=17;


		//-------------SUB MENU D-----------------//

		public final static int SUM = 1;
		public final static int SUSBTRACTION = 2;
		public final static int MULTIPLY = 3;
		
		//-------------------------------------------//
		private static int[] array;
		private static int[] arrays1;
		private static int[] arrays2;
		private static int[] arrays3;
		private static int opt;
		private static Scanner scan;
		private static String[] string; 

		//_______________________________________________________MENU___________________________________________________________//
		
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
			System.out.println("(10).Indicar el valor promedio de los valores ingresados");
			System.out.println("(11).Indique el mayor valor de los valores ingresados al arreglo");
			System.out.println("(12).Generar un nuevo arreglo con diferentes operaciones(suma, resta o multiplicacion)");
			System.out.println("(13).Generar un nuevo arreglo con la union de los tres arreglos ingresados (con elementos repetidos)");
			System.out.println("(14).Generar un nuevo arreglo con la union de los tres arreglos ingresados(sin elementos repetidos)");
			System.out.println("(15).Generar un nuevo arreglo con la intercepcion de los tres arreglos ingresados (elementos repetidos)");
			System.out.println("(16).Girar n posiciones, los valores del arreglo, utilizando uno de los tres arreglos ingresados");
			System.out.println("(17).Ordene de menor a mayor los valores del arreglo");

		}
		
		public static void desSubMenuD(){

			System.out.println("------SUB MENU 4 C------ \n Ingrese la opcion de desea realizar con los arreglos:");		
			System.out.println("(1).Suma");			
			System.out.println("(2).Resta");
			System.out.println("(3).Multiplicacion");
		}


		//________________________________________________________MAIN__________________________________________________________//

		public static void main(String[] args){
			
			scan = new Scanner(System.in);
			
			desMenu1();
			
			opt = scan.nextInt();
			scan.nextLine();
			
			switch(opt){

				//para la opcion 1

				case ADD_STRING: //HACER DENTRO DE UN METODO//
					
					strings();
					

				break;
				
				//para la opcion 2

				case REAL_NUMBERS:

					// se ingresan dos numeros reales para realizar una division

					System.out.println("primer numero real mayor a 0");
					double num1 = scan.nextDouble();
					
					System.out.println("segundo numero real mayor a 0");
					double num2 = scan.nextDouble();
					
					// se despliega el sub menu b de la opcion #2

					desSubMenuB();
					opt = scan.nextInt();

					// se realizan las operaciones escogidas por el usuario
					
					if(opt== DIVISION){
						
						System.out.println(division(num1,num2));						
						
					} else if(opt==RESIDUE){
						
						System.out.println("la division es: " + division(num1,num2) + "\n el residuo es: " + modulo(num1,num2));
						
					}

					System.out.println("Finished");				
					
					
				break;
				
				//para la opcion 3
				case ARRAYS:

					// se crean tres arreglos de tipo int y el usuario ingresa el tamaño de cada uno
					// en el for el usuario ingresa los valores para almacenar en cada arreglos

					System.out.println("ingrese el tamaño del primer arreglo" + "\n recuerda que si deseas operar los arreglos entre si, deben tener el mismo tamaño");
					arrays1 = new int[scan.nextInt()];


					System.out.println("ingrese los valores que desea que contenga el primer arreglo");


					for(int i=0; i<arrays1.length; i++){

						arrays1[i]= scan.nextInt();

					}

					System.out.println("ingrese el tamaño del segundo arreglo");
					arrays2 = new int[scan.nextInt()];


					System.out.println("ingrese los valores que desea que contenga el segundo arreglo");

					for(int i=0; i<arrays2.length; i++){

						arrays2[i]= scan.nextInt();

					}

					System.out.println("ingrese el tamaño del tercer arreglo");
					arrays3 = new int[scan.nextInt()];

					System.out.println("ingrese los valores que desea que contenga el tercer arreglo");

					for(int i=0; i<arrays3.length; i++){

						arrays3[i]= scan.nextInt();

					}

					// se despliega el sub menu C de la opcion #3

					desSubMenuC();
					opt = scan.nextInt();

					// se realizan las operaciones escogidas por el usuruario del sub menu C

					if(opt==SEE_ARRAYS){//despliegue de arreglos

						desArreglos();

					} else if(opt==AVERAGE){//promedio de los valores que se encuentran  en el arreglo escogido por el usuario)

						System.out.println("el promedio es: " + promedioDeUnArreglo());

					} else if (opt==BIGGER) {//(indica el numero mayor que se encuentra en el arreglo escogido por el usuario)

						System.out.println("El numero mayor es: " + el_mayor());

					}else if (opt==NEW_ARRAY){
						
						desSubMenuD();
						opt = scan.nextInt();
						
						if(opt==SUM){

							sum_arrays();	

						}else if(opt==SUSBTRACTION){


						}else if(opt==MULTIPLY){

							multiply_arrays();
						}else{

							System.out.println("la opcion es invalida");

						}	

					}else if(opt==NEW_ARRAY_UNION_REPEAT){

						arraysJoined();
					}else if(opt==NEW_ARRAY_NUMBERS_DIFF){

						arraydiff();

					}else if(opt==NEW_ARRAY_NUMBERS_EQUALS){

						arrayEquals();

					}else if(opt==TURN_POSITIONS){


					}else if(opt==ORDER_MINOR){


					}else{

						System.out.println("la opcion es invalida");
					}
					
					System.out.println("Finished");	

				break;
			}	
		
		}
		public static void strings(){

			// se crean los arreglos de tipo String

			string = new String[3];

			System.out.println("primera palabra");
			string[0] = scan.nextLine();
					
			System.out.println("segunda palabra");				
			string[1] = scan.nextLine();
					
			System.out.println("tercera palabra");		
			string[2] = scan.nextLine();
					
			// se despliega el sub menu A de la opcion #1

			desSubMenuA();
			opt = scan.nextInt();

			// se realizan las opciones escogidas por el usuario
					

			if(opt==LENGTH_STRING){
						
						System.out.println("la longitud de la primera cadena es: " + string[0].length());
						System.out.println("la longitud de la segunda cadena es: " + string[1].length());	
						System.out.println("la longitud de la tercera cadena es: " + string[2].length());						
						
					} else if(opt==CONCATENATE_STRING){
						
						System.out.println("Las palabras ingresadas en oracion es: " +string[0] +" "+string[1] +" "+string[2]);
						
					} else {

						System.out.println("Ingrese una posicion");
						int position = scan.nextInt();

						position--;

						if(position>string[0].length() && position> string[1].length() && position> string[2].length()){

							System.out.println("la posicion ingresada es mayor a la cadena");

						}else {

							System.out.println(string[0].charAt(position)+ "\n" + string[1].charAt(position) +"\n" + string[2].charAt(position));
						}
					}
		}

		//----------------------------------------------------------METODO DIVISION 2--------------------------------------------------//

		//metodos para realizar las operaciones del sub menu B de la opcion numero #2
		public static double division(double num1, double num2){

			return num1/num2;

		}

		public static double modulo(double num1, double num2){

			return num1%num2;

		}

		//----------------------------------------------------------METODO ARREGLOS 3----------------------------------------------------//

		// metodos para realizar el despliegue de los arreglos del sub menu C de la opcion #3

		public static void desArreglos(){

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

		//----------------------------------------------------------------METODO PROMEDIO---------------------------------------------//

		//metodo para realizar un promedio de los valores ingresados en el arreglo escogido por el usuario

		public static double promedioDeUnArreglo(){

			System.out.println("Ingrese el numero del arreglo con el que desea trabajar, \n (1). arreglo #1 \n (2). arreglo #2 \n (3). arreglo #3");
			opt= scan.nextInt();

			int suma=0;
			double result=0;

			//para la opcion 1
			if(opt==1){

				for(int i=0; i<arrays1.length; i++){

					suma += arrays1[i]; 
					result= suma/arrays1.length;
				}

			}else if(opt==2){

				for(int i=0; i<arrays2.length; i++){

					suma += arrays2[i]; 
					result= suma/arrays2.length;

				}

			}else {

				for(int i=0; i<arrays3.length; i++){

					suma += arrays3[i];
					result= suma/arrays3.length; 

				}				
			}
			return result;
		}
		//--------------------------------------------------------------METODO EL MAYOR----------------------------------------------//

		//metodo que realiza la operacion para escoger el numero mayor que se encuentra en el arreglo que escoge el usuario

		public static int el_mayor(){

			System.out.println("Ingrese el numero del arreglo con el que desea trabajar, \n (1). arreglo #1 \n (2). arreglo #2 \n (3). arreglo #3");
			opt= scan.nextInt();
			int elMayor=0;

			//para el arreglo 1
			if(opt==1){

				for(int i=0; i<arrays1.length; i++){

					for(int j=0; j<arrays1.length; j++){

						if(arrays1[i]>arrays1[j]){

							elMayor= arrays1[i];

						}
					}
				}
			}

			//para el arreglo 2

			if(opt==2){

				for(int i=0; i<arrays2.length; i++){

					for(int j=0; j<arrays1.length; j++){

						if(arrays2[i]>arrays1[j]){

							elMayor= arrays2[i];

						}
					}
				}
			}

			//para el arreglo 3

			if(opt==3){

				for(int i=0; i<arrays3.length; i++){

					for(int j=0; j<arrays3.length; j++){

						if(arrays3[i]>arrays3[j]){

							elMayor= arrays3[i];

						}
					}
				}
			}

			return elMayor;
			
		}
		//------------------------------------------------------------------SUB MENU D----------------------------------------------------//

		//Metodo que me realiza la suma de dos arreglos escogidos por el usuario
		public static void sum_arrays(){
			

			int[] sumArrays;
			int[][] array = {arrays1,arrays2,arrays3};
			
			System.out.println("seleccione el primer arreglo que desea sumar");
			int opt1 = scan.nextInt()-1;
		
			System.out.println("seleccione el segundo arreglo que desea sumar");
			int opt2 = scan.nextInt()-1;			
			
			if(array[opt1].length==array[opt2].length){
				
				sumArrays = new int[array[opt1].length];
				
				for(int i=0; i<array[opt1].length ; i++){
					
					sumArrays[i] = array[opt1][i] + array[opt2][i];
					System.out.println(sumArrays[i]);
				}
				
			}else{
				
				System.out.println("los dos arreglos no tienen elmismo tamaño");
			}
			
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------//
		//Metodo de la resta de arreglos
		public static void susbtraction_arrays(){

			int[] sumArrays;
			int[][] array = {arrays1,arrays2,arrays3};

			System.out.println("seleccione el primer arreglo que desea sumar");
			int opt1 = scan.nextInt()-1;
		
			System.out.println("seleccione el segundo arreglo que desea sumar");
			int opt2 = scan.nextInt()-1;			
			
			if(array[opt1].length==array[opt2].length){
				
				sumArrays= new int[array[opt1].length];
				
				for(int i=0; i<array[opt1].length ; i++){
					
					sumArrays[i] = (array[opt1][i] * array[opt2][i]);
					System.out.println(sumArrays[i]);
				}
				
			}else{
				
				System.out.println("los dos arreglos no tienen elmismo tamaño");
			}	
		}

		//---------------------------------------------------------------MULTIPLIICACION------------------------------------------------------------------//

		//Metodo que me realiza la operacion de la multiplicacion de dos arreglos escogidos por elusuario

		public static void multiply_arrays(){

			int[] sumArrays;
			int[][] array = {arrays1,arrays2,arrays3};

			System.out.println("seleccione el primer arreglo que desea sumar");
			int opt1 = scan.nextInt()-1;
		
			System.out.println("seleccione el segundo arreglo que desea sumar");
			int opt2 = scan.nextInt()-1;			
			
			if(array[opt1].length==array[opt2].length){
				
				sumArrays= new int[array[opt1].length];
				
				for(int i=0; i<array[opt1].length ; i++){
					
					sumArrays[i] = (array[opt1][i] * array[opt2][i]);
					System.out.println(sumArrays[i]);
				}
				
			}else{
				
				System.out.println("los dos arreglos no tienen elmismo tamaño");
			}
		}	

		//Metodo que genera un nuevo arreglo con los tres arreglos ingresado y sus numeros repetidos

		public static void arraysJoined(){

			int[] arrayJoined = new int[arrays1.length+arrays2.length+arrays3.length];

			for(int i=0; i<arrays1.length; i++){

				arrayJoined[i] = arrays1[i];
				arrayJoined[arrays2.length+i] = arrays2[i];
				arrayJoined[arrays2.length+arrays3.length+i] = arrays3[i];
			}

			for(int i= 0; i<arrayJoined.length; i++ ){

				System.out.println(arrayJoined[i]);

			}
		}

		//Metodo que genera un nuevo arreglo con los tres arreglos ingresado sin elementos repetidos

		public static void arraydiff(){

			int[] arrayJoined = new int[arrays1.length+arrays2.length+arrays3.length];
			int[] arrayDiff= new int[arrayJoined.length];
			int counter=0;
			boolean isEqual = false;

			for(int i=0; i<arrays1.length; i++){

				arrayJoined[i] = arrays1[i];
				arrayJoined[arrays2.length+i] = arrays2[i];
				arrayJoined[arrays2.length+arrays3.length+i] = arrays3[i];
			}

			for(int i= 0; i<arrayJoined.length; i++ ){

				isEqual = false;

				for(int j=0; j<arrayJoined.length; j++){

					if(arrayJoined[i]==arrayDiff[j]){

						isEqual = true;

						break;

					}

				}
				
				if (isEqual==false){

					arrayDiff[counter]=arrayJoined[i];

					System.out.println(arrayDiff[counter]);

					counter++;

				}
			}

		}

		//Metodo que crea un arreglo con la union de los tres arreglos anteriores y agrega sus valores repetidos
		public static void arrayEquals(){

			int[] arrayJoined = new int[arrays1.length+arrays2.length+arrays3.length];
			int[] arrayequal= new int[arrayJoined.length];
			int counter=0;
			boolean isEqual = false;

			for(int i=0; i<arrays1.length; i++){

				arrayJoined[i] = arrays1[i];
				arrayJoined[arrays2.length+i] = arrays2[i];
				arrayJoined[arrays2.length+arrays3.length+i] = arrays3[i];
			}

			for(int i= 0; i<arrayJoined.length; i++ ){

				isEqual = false;

				for(int j=0; j<arrayJoined.length; j++){

					if(arrayJoined[i]!=arrayequal[j]){

						isEqual = true;

						break;

					}

				}
				
				if (isEqual==true){

					arrayequal[counter]=arrayJoined[i];

					System.out.println(arrayequal[counter]);

					counter++;

				}


			}
		}

		//METODO BURBUJA

		public static void burbuja(){

        		int i,j,aux;

        		System.out.println("Ingrese el arreglo que desea ordenar");
        		opt=scan.nextInt();

    		switch(opt){
    			case 1:

    			    for (i = 0; i < arrays1.length - 1; i++) {

           	 			for (j = 0; j < arrays1.length - i - 1; j++) {

                			if (arrays1[j + 1] < arrays1[j]) {

                    		aux = arrays1[j + 1];

                   		 arrays1[j + 1] = arrays1[j];

                   		 arrays1[j] = aux;
               	 	}
            	}
        	}

    			break;

        		case 2:
        			for (i = 0; i < arrays2.length - 1; i++) {

           	 			for (j = 0; j < arrays2.length - i - 1; j++) {

                			if (arrays2[j + 1] < arrays2[j]) {

                    		aux = arrays2[j + 1];

                    		arrays2[j + 1] = arrays2[j];
                    
                    		arrays2[j] = aux;
               	 		}
            		}

        		break;
        		
 
        		case 3:


        			for (i = 0; i < arrays3.length - 1; i++) {

           	 			for (j = 0; j < arrays3.length - i - 1; j++) {

                			if (arrays3[j + 1] < arrays3[j]) {

                   	 			aux = arrays3[j + 1];

                    			arrays3[j + 1] = arrays3[j];
                    
                   	 			arrays3[j] = aux;
               	 			}
            			}
        			}

        	}		break;

        		        	       	
		}

}
	