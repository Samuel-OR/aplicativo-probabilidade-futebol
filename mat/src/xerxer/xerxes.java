/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class xerxes {
    public static void main(String[] args) {
        Scanner dado=new Scanner(System.in);
        int n=dado.nextInt();
        if(n%2!=0 &&(n>=1 && n<=999)){
        int xcont=0;
        int dcont=0;
        int x=0;
        int d=0;
        boolean erro=false;
        for(int i=1;i<=n;i++){
            d=dado.nextInt();
            x=dado.nextInt();
            if(x-d==1 || x-d==2 || d-x==4 || d-x==3){
                dcont=dcont+1;
            }
            if(d-x==1 || d-x==2 || x-d==4 || x-d==3){
                xcont=xcont+1;
        }
            if(x==d){
           erro = true;
                break;
            }
    }
        if(erro==false){
        if(dcont<xcont){
            System.out.println("xerxes");
        }else{
            System.out.println("dario");
        }
        }
}
}
}