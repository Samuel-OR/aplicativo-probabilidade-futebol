
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
public class NovoClass3 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
        int maior=0,posicao=0,a;
        
        
       int n = ler.nextInt();
       int y[] = new int[n];
       
      
       int cont1=0,cont2=0;
       
        for (int i = 0; i < n; i++) {
            y[i] = ler.nextInt();           
        }
        
        int temp;
      
        for (int i = 0; i < n; i++){
	for (int j = i + 1; j < n; j++){

		if (y[i] > y[j]){
			temp = y[i]; 	
			y[i] = y[j];
			y[j] = temp;					

		}
    }}
        
        for (int i = 0; i < n; i++) {
            if(y[i]%2==0){
                System.out.println(y[i]);
            }
        }
        for (int i = n-1; i >= 0; i--) {
            if(y[i]%2!=0){
                System.out.println(y[i]);
            }
        }
        
}
}
