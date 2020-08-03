 
import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
	
		
		Scanner ts = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("Opciones (1,2): \n"+"1.Vectores: \n"+"2.Salir: \n");
			int k=ts.nextInt();
			
			if(k==1) {

				System.out.println("Dimension del vector: ");
				int t=ts.nextInt();
				
				int x=0;
				System.out.println("Primer vector: ");
				List vector1 = new List();
				
				for (int i = 0; i < t; i++) {
					x=ts.nextInt();
					vector1.add(x);
					
				}
				vector1.rec(vector1.head);

				System.out.println("Segundo vector: ");
				x=0;
				List vector2 = new List();	 
				for (int i = 0; i < t; i++) {
					x=ts.nextInt();
					vector2.add(x);
					
				}

				vector2.rec(vector2.head);
				 
				
				//////////////////////////////////////////////

		 
				Object[] arrayV= vector1.toArray();
			    Object[] arrayV2= vector2.toArray();
				 
				 
				 
				//SUMA DE VECTORES
				List vector3 = new List();
				//PRODUCTO ESCALAR
				List vector4 = new List();
				int resultado1,resultado,cont=0;
				do {
					try {
						resultado= (int)arrayV[cont]+ (int)arrayV2[cont];
						resultado1= (int)arrayV[cont]*(int)arrayV2[cont];
						vector3.add(resultado);
						vector4.add(resultado1);
						cont++;
					}catch(Exception e) {
						continue;
					}
					
				}while(cont<t);
				

				System.out.println();
				System.out.println("Suma de Vectores");
				vector3.rec(vector3.head);
				
				System.out.println();
				System.out.println("Producto Escalar");
				vector4.rec(vector4.head);
				
				int escalar=0;
				Object[] arrayV4= vector4.toArray();
				for (int i = 0; i < arrayV4.length; i++) {
					escalar= escalar+ (int) arrayV4[i];
				}

				System.out.println("Producto escalar: " + escalar);
				
			}else if(k==2) {
				break;
			}
			
		}
		 
		 
			
	}

}
