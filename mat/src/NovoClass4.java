
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
public class NovoClass4 {

    public static int fib(int f){
         if(f<2){
             return 1;
         }
         return fib(f-1)+fib(f-2);
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0, posicao = 0;

            int a = ler.nextInt();
            int v[] = new int[a];

        
            for (int i = 0; i < a; i++) {
                v[i] = ler.nextInt();
            }

            for (int i = 0; i < a; i++) {
                if (a == 0) {
            System.out.println("Fib(" + 0 + ") = " + 0);
        } else if (a == 1) {
            System.out.println("Fib(" + 1 + ") = " + 1);
        } else {
                System.out.println("Fib(" + v[i] + ") = "+ fib(v[i]));
        }
            }

                 

                
      
            
        }
    }

