package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Data d1 = new Data();
		System.out.println(" Infomra o dia: ");
		d1.setDia(input.nextInt());

		System.out.println(" Informe o mes: ");
		d1.setMes(input.nextInt());
		
		System.out.println(" Informe o ano: ");
		d1.setAno(input.nextInt());
		
		
		System.out.println(" *****VIZUALIZANDO OS DADOS******");
		System.out.println( d1);
		
		
		
		
		
	
	}   

}
