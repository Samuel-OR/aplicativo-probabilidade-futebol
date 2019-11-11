package mat;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import mat.Matematica;

public class Codigo_1 {

    public void calculo01() {
        Scanner dado = new Scanner(System.in);

        int x, y;
        double comb = 1, div = 1, fat = 1, resul;

        System.out.println("Digite a quantidade de times no campeonato:");
        x = dado.nextInt();
        System.out.println("Digite a quantidade de times a serem rebaixados:");
        y = dado.nextInt();

        //combinação
        for (int i = x; i > y; i--) {
            comb *= i;
        }
        for (int i = x - y; i >= 1; i--) {
            div *= i;
        }
        comb = comb / div;

        //fatorial
        for (int i = x; i >= 1; i--) {
            fat *= i;

        }

        //resultado
        resul = (comb / fat);;

        
       

        System.out.println("A probabilidade é: " + resul + " %");
        
        
    }

    public void calculo02() {

        //k quantidade desejada de ocorrencias
        // λ numero de eventos que ocorre em determinado periodo de tempo
        // e = 2,718 281 828 459 045 235 360 287.
        Scanner dado = new Scanner(System.in);

        double f = 0;
        double y = 0;
        int k = 0;
        double € = 2.718281828459045235360287;
        int k1 = 1;
        System.out.println("digite quantidade de gols que devem ocorrer");
        k = dado.nextInt();
        System.out.println("digite a media de gols do time por jogo");
        y = dado.nextDouble();

        for (int x = k; x >= 1; x--) {
            k1 = k1 * x;
        }

        f = ((Math.pow(€, -y)) * (Math.pow(y, k))) / k1;

        System.out.println("Probabilidade de marcar "+ k+ " em uma partida é: "+ f);
        
        
    }

    public void cauculo03() {

        Scanner dado = new Scanner(System.in);

        double xxx = 0, xx = 0;
        

        for (int i = 1; i < 3; i++) {

            double f = 0;
            double y = 0;
            int k = 0;
            double € = 2.718281828459045235360287;
            int k1 = 1;
            System.out.println("digite quantidade de gols que devem ocorrer time " + i);
            k = dado.nextInt();
            System.out.println("digite a media de gols do time " + i);
            y = dado.nextDouble();

            for (int x = k; x >= 1; x--) {
                k1 = k1 * x;
            }
            if (i == 1) {
                xxx = ((Math.pow(€, -y)) * (Math.pow(y, k))) / k1;
               
                
            } else {
                xx = ((Math.pow(€, -y)) * (Math.pow(y, k))) / k1;
                
            }

        }
        

        //DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Probabilidade deste placar ocorrer é: " + xxx * xx  + "%");
        
        
        
        
    }
    
    public void calcular04(){
        
        Scanner ler = new Scanner (System.in);
        int a, a1, a2, a3, a4, a5;
        double reba1, soma1, soma2;
        
        System.out.println("Forca da equipe entre 1 - 100");
        a = ler.nextInt();
        System.out.println("Qualidade do Elenco");
        a1 = ler.nextInt();
        System.out.println("Pontos Feitos no torneio");
        a2 = ler.nextInt();
        
        System.out.println("Qualidade dos proximos adversarios");
        a3 = ler.nextInt();
        
        System.out.println("Quantidade Pontos restantes");
        a4 = ler.nextInt();
        
        System.out.println("Jogos Restantes");
        a5 = ler.nextInt();
        
        
        soma1 = (a*a1*a2);
        soma2 =(a*a3*a4*a5);
        
        reba1 = soma1 / soma2;
        System.out.println("Probabilidade de ser rebaixado é: "+ reba1 + "%");
        
    }

    public static void main(String[] args) {
 Scanner dado = new Scanner(System.in);
 
DecimalFormat df = new DecimalFormat("#,###.0000");
double yt = 100 * 0.0453426;
        System.out.println(df.format(yt));
        
        double x = 123.123; 
        System.out.printf( "%.3f", x ); 

        int oi = 0;

        Codigo_1 M = new Codigo_1();

       

        System.out.println("Digite a opção que deseja");
        System.out.println("1 - Probabilidade de Rebaixamento Geral");
        System.out.println("2 - Probabilidade de ns Pontos/Partida");
        System.out.println("3 - Probabilidade de Ocorre determinado placar");
        System.out.println("4 - Probabilidade de Rebaixamento Especifico ");
        System.out.println("0 - Sair");
        System.out.println(" ----------------------------------------------- ");
        oi = dado.nextInt();

        while (oi != 0) {
            switch (oi) {
                case 1:
                    M.calculo01();
                    break;
                case 2:
                    M.calculo02();
                    break;
                case 3:
                    M.cauculo03();
                    break;
                case 4:
                    M.calcular04();
                    break;
            }
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - ");
             System.out.println("Digite a opção que deseja");
        System.out.println("1 - Probabilidade de Rebaxamento");
        System.out.println("2 - Probabilidade de ns Gols/Partida");
        System.out.println("3 - Probabilidade de Ocorre determinado placar");
         System.out.println("4 - Probabilidade de Rebaixamento Especifico ");
        System.out.println("0 - Sair");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        oi = dado.nextInt();
        }
        
        
    }
}
