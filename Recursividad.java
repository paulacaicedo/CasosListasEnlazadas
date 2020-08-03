
public class Recursividad {

	public static void main(String[] args) {
		
		 List lista = new List();
		 
		for(int i=0;i<10;i++) {
				
				lista.add(i);
		}
		
		lista.rec(lista.head);
			
			

	}

}
