package exercicio;

import java.util.Scanner;



public class EbacExercicio {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in); 
		System.out.println("Digite a nota do  Teste 1 ");
		double matematicaNota1 =s.nextDouble();
		
	     Scanner s2 =new Scanner(System.in);
	     System.out.println("Digite a nota do Teste  2  ");
	     double matematicaNota2 = s2.nextDouble();
		
		Scanner s3= new Scanner(System.in);
		System.out.println("Digite a nota do Teste  3  ");
		double matematicaNota3 =s3.nextDouble();
		
		
	   Scanner s4= new Scanner(System.in );
	   System.out.println("Digite a nota do Teste  4  ");
	     
	   double  matematicaNota4 = s4.nextDouble();	
	
		
		double mediaMatematica =  (matematicaNota1 + matematicaNota2 + matematicaNota3 + matematicaNota4) / 4;
		
	
		
		if(mediaMatematica  >= 7) {
			System.out.println("Foi aprovado"+" "+ mediaMatematica);
			
			}else if (mediaMatematica < 7 && mediaMatematica >= 5 ) {
				System.out.println("Recuperação"+" "+ mediaMatematica);
				
			}else {
			System.out.println("Reprovado !" +" "+ mediaMatematica);
		}
		
	}

	}


