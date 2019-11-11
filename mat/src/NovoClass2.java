
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class NovoClass2 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        int maior=0,posicao=0;
        int n = ler.nextInt();
        int x[] = new int[n];
        
       
        
        for(int i =0; i<=5;i++){            
            x[i] = ler.nextInt();
            
            if(maior > x[i]){
                maior = x[i];
                posicao = i;
            }
        }
        
        System.out.println("Menor valor: "+maior);
        System.out.println("Posicao: "+posicao);
    }
}
