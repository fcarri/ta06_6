package project6;

import java.util.Scanner;

public class ta06_6 {
	public static void main(String args[]){
		
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		try{
			
			System.out.println("Nombre sencer positiu: ");
			nombre = Integer.parseInt(sc.next());
			if (nombre >= 0) {
				System.out.print("n de xifres = "+npos(nombre));					
			}else {
				System.out.println("El nombre és negatiu ");
			}
			
		}catch (NumberFormatException ex) {
           
			System.out.println("El nombre no és sencer ");
			
		}							
									
		sc.close();
				
	}
		
	
	public static int npos (int nombre) {
		
		int nxifres = 0;
				
        while (nombre != 0) {
            nombre = nombre / 10;
            ++nxifres;
        }
		
		return nxifres;
	}
}
