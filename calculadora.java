import java.math.BigInteger;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		 
		Scanner ts = new Scanner(System.in);
		
		int t;
		String num1,num2;
		System.out.println("Digite los 2 numeros: \n");
		
		System.out.println("Valor 1: ");
	    num1=ts.nextLine();
	    System.out.println("Valor 2: ");
	    num2=ts.nextLine();
	    
	    if(num1.length()>=30 && num2.length()>=30) {
			List lista = new List();
			for (int i = 0; i < num1.length(); i++) {
				lista.add(num1.charAt(i));
			}
			
			
			List lista1 = new List();
				 
			for (int i = 0; i < num2.length(); i++) {
				lista1.add(num2.charAt(i));
			}
			
		    
		    System.out.println("////////////////////////////////////////////////////");
		    
		    
		    String valor1="";
		    ListNode pointer=lista.head;
			while(pointer.next!=null){
				valor1=valor1 + lista.getTo(pointer);
				pointer=pointer.next;
			}
		    
			System.out.println("Valor Numerico: "+ valor1);
		    
		    System.out.println("////////////////////////////////////////////////////");

		    String valor2="";
		    ListNode pointer1=lista1.head;
			while(pointer1.next!=null){
				valor2=valor2 + lista.getTo(pointer1);
				pointer1=pointer1.next;
			}
			
			System.out.println("Valor Numerico: " + valor2);
			
			
		    System.out.println("////////////////////////////////////////////////////");
			
		    BigInteger numero1 = new BigInteger(valor1);
			BigInteger numero2 = new BigInteger(valor2);
			
			 
			
			
			if(numero1.compareTo(numero2)==1 || numero1.compareTo(numero2)==0) {
				
				while(true) {
				System.out.println("Opciones (1,2,3,4): \n"+"1.Sumar: \n"+"2.Restar: \n"+"3.Multiplicar: \n"+"4.Dividir: \n"+"5.Salir: \n" );
				 t=ts.nextInt();
				
				String resultado="";
				if(t==1) {
					System.out.println("Suma de los numeros: "+ numero1.add(numero2));
					resultado =String.valueOf(numero1.add(numero2));
					
				}else if(t==2){
					System.out.println("Resta de los numeros: "+ numero1.subtract(numero2));
					resultado =String.valueOf(numero1.subtract(numero2));
					
				}else if(t==3) {
					System.out.println("Multiplicacion de los numeros: "+ numero1.multiply(numero2));
					resultado =String.valueOf(numero1.multiply(numero2));
					
				}else if(t==4) {
					System.out.println("Division de los numeros: "+ numero1.multiply(numero2));
					resultado =String.valueOf(numero1.multiply(numero2));
				}else if(t==5) {
					break;
				}
			
				
				List result = new List();
				for (int i = 0; i < resultado.length(); i++) {
					result.add(resultado.charAt(i));
				}
				
				result.rec(result.head);
				
				}
				 
			}else if(numero1.compareTo(numero2)==-1) {
				
				while(true) {
				System.out.println("Opciones (1,2,3,4,5): \n"+"1.Sumar: \n"+"2.Restar: \n"+"3.Multiplicar: \n"+"4.Dividir: \n"+"5.Salir: \n"  );
				t=ts.nextInt();
				
				String resultado="";
				
				
				if(t==1) {
					System.out.println("Suma de los numeros: "+ numero2.add(numero1));
					resultado =String.valueOf(numero2.add(numero1));
					
				}else if(t==2){
					System.out.println("Resta de los numeros: "+numero2.subtract(numero1));
					resultado =String.valueOf(numero2.subtract(numero1));
					
				}else if(t==3) {
					System.out.println("Multiplicacion de los numeros: "+numero2.multiply(numero1));
					resultado =String.valueOf(numero2.multiply(numero1));
					
				}else if(t==4) {
					System.out.println("Division de los numeros: "+numero2.divide(numero1));
					resultado =String.valueOf(numero2.divide(numero1));
				}else if(t==5) {
					break;
				}
				  
				
				
				List result = new List();
				for (int i = 0; i < resultado.length(); i++) {
					result.add(resultado.charAt(i));
				}
				
				result.rec(result.head);
				
				} 
			
			
			
			
			}
	    	
	    }else {
	    	System.out.println("Numero mayores a 30 digitos");
	    }
		
		 
}
}