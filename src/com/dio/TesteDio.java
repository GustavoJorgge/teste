package com.dio;
import java.util.Scanner;
public class TesteDio {

	public static void main(String[] args) {		
			    Scanner ler = new Scanner(System.in);

			    int menu;

				//menu com as opçoes disponiveis
			    System.out.printf("Entre com uma das opçoes:\n");
			    System.out.printf("1-Netflix \n2-Amazon Prime \n3-HBO max \n4-Disney plus\n");
			    System.out.printf("Sua opção: ");

			    //escolha
			    menu = ler.nextInt();

				//saida apos a escola
				switch(menu){
			    case 1:
			    	System.out.printf("Abrindo Netflix\n");
			    break;

			    case 2:
			    	System.out.printf("Abrindo Amazon Prime\n");
			    break;

			    case 3:
			    	System.out.printf("Abrindo HBO max\n");
			    break;

			    case 4:
			    	System.out.printf("Abrindo Disney plus\n");
			    break;

				//caso o usuario entre com um valor indisponivel
			    default:
			    	System.out.printf("Opção invalida\n");
			    break;
				}
			}
		


		// TODO Auto-generated method stub

	}


