package modele;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double taille = 0;
        double poids = 0;
        double bmi = 0;

       System.out.print("Entrez votre taille: ");
        taille = sc.nextDouble();

        System.out.print("Entrez votre poids : ");
        poids = sc.nextDouble();

        bmi = poids / (taille * taille);

        System.out.println("Votre BMI est "+ bmi);

        if (bmi < 18.5){
        	System.out.println("maigreur: en-dessous de 18.5");
        }
        if (bmi >18.5 && bmi < 24.9){
        System.out.println("Corpulance Normale: 18.5-24.9 ");	
        }
        if (bmi > 25 && bmi <29.9){
        System.out.println("Surpoids: 25-29.9");	
        }
        if (bmi > 30){
       System.out.println("Obésité: au-dessus 30"); 	
        }
        
        
        
        
     }
    }
