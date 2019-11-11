
import java.text.DecimalFormat;
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
public class NovoClass {

    public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new  DecimalFormat("#,#");
        
        double mat[][]= new double[12][12];
        
        int a = ler.nextInt();
        double soma = 0, media = 0;
        String b = ler.next();
        double c;
        if (b.equals("S")){          
                
            
            for (int i = 0; i < 12; i++) {
                mat[a][i] = ler.nextDouble();

                soma += mat[a][i];
            }
            
            
            //System.out.println(df.format(soma));
        }
        
         if (b.equals("M")) {
            for (int i = 0; i < 12; i++) {
                mat[a][i]  = ler.nextDouble();

                soma +=  mat[a][i] ;
            }
            
            System.out.println(df.format(soma/12));
        }
    }

}
