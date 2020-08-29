package com.hsm.notas;

import java.io.Console;
import java.util.Scanner;

public class notas {

public static void main(String[] args) {
		
	double[]  mediaBimestral = new double[2];
		double mediaSemestral[] = new double[2];
		String disciplina = "Matemática";
		String[] bimestre = new String[2];
		int notasProva[] = new int[2];
		int notasProjeto[] = new int[2];
		int notasExercicio[] = new int[2];
		String alunos[] = new String[2];
		int totalPeso = 5+3+2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("** Sistema de Gestão Acadêmica ** \n");
		System.out.print("-------------------------------------\n");
		System.out.print(" Cálculo de Notas \n");
		System.out.print("-------------------------------------\n");
		System.out.print(" \n");
		
		System.out.print("Avaliação Bimestral: " + disciplina + "\n");
		System.out.print("============================================\n");	
		
		
		for(int i=0; i<bimestre.length; i++) {
			
			System.out.print("Digite o nome do Aluno: \n");
			alunos[i] = sc.nextLine();
			//sc.nextLine();					
			System.out.print("-------------------------------------\n");
						
			System.out.print("Digite a nota da Prova Peso(5): \n");
			notasProva[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite a nota da Projeto Peso(3): \n");
			notasProjeto[i] = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite a nota da Lista de Exercicios Peso(2): \n");
			notasExercicio[i] = sc.nextInt();
			sc.nextLine();		
			
			System.out.print(i + "\n");
			//System.out.println("*** esoerando ***");
			  
		}
		
		for(int j=0; j < 3; j++) {
				mediaBimestral[j]= (double) (((notasProva[j] * 5) + (notasProjeto[j] * 3) + (notasExercicio[j] * 2) ) / totalPeso);
				mediaSemestral[j] = ( mediaBimestral[j] + mediaBimestral[j] + mediaBimestral[j])/3;			  
								
				System.out.println("\n Media Final: " + mediaSemestral[j]);
				if(mediaSemestral[j] >= 8) {
					System.out.println("Aluno: " + alunos[j] + " :Aprovado");
				}
				else {	
						if(mediaSemestral[j] < 5) {
							System.out.println("Aluno: " + alunos[j] + " :Reprovado");
						}
				else {
					System.out.println("Aluno: " + alunos[j] + " : (Prova Final)");
				}
						
						System.out.print("\n");
			}		
		}
	}
}
