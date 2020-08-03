import java.util.Scanner;

public class Barajas {
	
	public static List revolver(int n, List ob1) {
		
		List ob=new List();
		
		int i=0, cantidad=13;
		int array[]=new int[cantidad];
		array[i]=(int)(Math.random()*(13-1+1)+1);
		for (int k = 0; k < n; k++) {
			for (i = 1; i < cantidad; i++) {
				array[i]=(int)(Math.random()*(13-1+1)+1);
				for (int j = 0; j < i; j++) {
					if(array[i]==array[j]) {
						i--;
					}
				}
			}
		}
		
		for (int m = 0; m < array.length; m++) {
			ob.add(array[m]);
		}
		return ob;
		
	}
	
	public static List BarajaLlenar() {
		
		List ob=new List();
		for (int i = 1; i <= 13 ; i++) {
			ob.add(i);	
		}
		
		return ob;
	}
	
	public static void recorrer(List t,String n) {
		
		String x="";
		if(n=="picas") {
			x="P";
		}else if(n=="corazones") {
			x="C";
		}else if(n=="diamantes"){
			x="D";
		}else if(n=="treboles") {
			x="T";
		}
		
		List ob=t;
	
		for(ListNode node = ob.head; node !=null; node=node.next) {
			System.out.print(" "+ ob.getTo(node)+x);
		}
		
	}

	public static void main(String[] args) {
		
	 
	 List picas= new List();
	 picas=BarajaLlenar();
	 List diamantes =new List();
	 diamantes=BarajaLlenar();
	 List corazones= new List();
	 corazones=BarajaLlenar();
	 List treboles= new List();
	 treboles=BarajaLlenar();
	 
	 Scanner ts =new Scanner(System.in);
	 
	 while(true) {
		 System.out.println();
		 System.out.println("Opciones (1,2,3,4,6): \n"+"1.Mostrar Baraja: \n"+"2.Mostrar Palo: \n"+
	                     "3.Revolver Baraja: \n"+"4.Ornedar Baraja: \n"+"5.Ornedar Palo: \n" +"6.Salir: \n");
		 
		 int x=ts.nextInt();
		 
		 if(x==1) {
			  
			 recorrer(picas,"picas");
			 System.out.println();
			  
			 recorrer(diamantes,"diamantes");
			 System.out.println();
			 
			 recorrer(picas,"corazones");
			 System.out.println();
			  
			 recorrer(treboles,"treboles");
			 System.out.println();
			 
		 }else if(x==2) {
			 System.out.println("¿Que palo desea ver?(1,2,3,4): \n"+"1.Picas: \n"+"2.Corazones: \n"+
		                     "3.Treboles: \n"+"4.Diamantes: \n");
			 int y=ts.nextInt();
			 if(y==1) { 
				 recorrer(picas,"picas");
				 System.out.println();
			 }else if(y==2) {
				 recorrer(corazones,"corazones");
				 System.out.println();
			 }else if(y==3) {
				 recorrer(treboles,"treboles");
				 System.out.println();
			 }else if(y==4) {
				 recorrer(diamantes,"diamantes");
				 System.out.println();
			 }
		 }else if(x==3) {
			 System.out.println("¿Cuantas veces desea revolverla?: ");
			 int n=ts.nextInt();
			 picas=revolver(n,picas);
			 diamantes=revolver(n,diamantes);
			 corazones=revolver(n,corazones);
			 treboles= revolver(n,treboles);
		 
		 }else if(x==4) {
			 
			 picas=picas.sortList();
			 diamantes=diamantes.sortList();
			 corazones=corazones.sortList();
			 treboles=treboles.sortList();
		 
		 }else if(x==5) {
			 System.out.println("¿Que palo desea ordenar?(1,2,3,4): \n"+"1.Picas: \n"+"2.Corazones: \n"+
		                         "3.Treboles: \n"+"4.Diamantes: \n");
			 int y=ts.nextInt();
			 if(y==1) { 
				 picas=picas.sortList();
			 }else if(y==2) {
				 corazones=corazones.sortList();
			 }else if(y==3) {
				 treboles=treboles.sortList();
			 }else if(y==4) {
				 diamantes=diamantes.sortList();
			 }
			 
		 }else if(x==6) {
			 break;
		 }
	 
	 
	 
	 
	 }
	 
	 

	}

}
