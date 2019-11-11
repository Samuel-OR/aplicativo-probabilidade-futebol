/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obi;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class papel {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int n=dado.nextInt();
        if(n>=1 && n<=(10^5)){
        int[] a=new int[n];
        int maior=0;
        for(int i=0;i<n;i++){
        a[i]=dado.nextInt();
            if(a[i]>maior){
            maior=a[i];
            }
        }
        int p=1;
        int pmaior=0;
        for(int i=1;i<maior;i++){
            for(int c=0;c<n;c++){
                if(c==0){
                    if(a[c]>i){
                      p=p+1;  
                    }
                }else{
                    if(a[c]>i && a[c-1]<i){
                        p=p+1;
                    }
                }
            }
            if(p>pmaior){
                pmaior=p;
            }
            p=1;
        }
        System.out.println(pmaior);
}
    }
}