/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package poo;

import edu.princeton.cs.algs4.Draw;

public class App {    

    public static void main(String[] args) {
        Draw d = new Draw();
        d.clear(d.LIGHT_GRAY);// cor do fundo//
       /*  d.setPenColor(d.BLUE);//define a cor dos proximos comandos, até setar o proximo setPencolor//
        d.square(0.8, 0.2, 0.1);//desenha quadrado vazado//
        d.setPenRadius(0.05);//expessura da linha///
        d.filledSquare(0.2, 0.8, 0.1);//desenha quadrado prenchido//
        d.point(0.1, 0.1);//desenha um ponto na tela// */
        d.point(0.9, 0.9);//desenha um ponto na tela//
        d.setPenColor(d.RED);//define a cor dos proximos comandos, até setar o proximo setPencolor//
        d.line(0.1, 0.2, 0.85, 0.8); // desenha uma linha//
        /* d.circle(0.7, 0.65, 0.25); // desenha uma circulo//
        d.text(0.7,0.75, "POO"); d.text(0.7,0.55, "Java");//exreve texto//
        d.setPenColor(d.WHITE);//define a cor dos proximos comandos, até setar o proximo setPencolor//
        d.filledCircle(0.3, 0.3, 0.2);//desenha um circulo prenchido//
        d.setPenColor(d.BLACK);//define a cor dos proximos comandos, até setar o proximo setPencolor//
        double r2 = 0.08; double r3 = 0.05; double r4 = 0.17; double r5 = 0.19;
        d.setPenRadius(0.01);//expessura da linha///
        for (int i = 0; i < 12; i++) {
            double theta = Math.toRadians(30 * i);//loop para desenhar as 12 posições do relogio//
            //https://brasilescola.uol.com.br/matematica/simetria-no-circulo-trigonometrico.htm
            d.line(0.3 + r5*Math.sin(theta), 0.3 + r5*Math.cos(theta), 0.3 + r4*Math.sin(theta), 0.3 + r4*Math.cos(theta));
        }
        int horas = 9; int minutos = 40; int segundos = 20;//define o valor do relogio//
        double h = Math.toRadians(30 * horas);//360 graus / 12 horas = 30 graus cada hora//
        double m = Math.toRadians(6 * minutos);//360 graus / 60 minutos = 6 graus cada minuto// 
        double s = Math.toRadians(6 * segundos);//360 graus / 60 segundos = 6 graus cada segundo// 

        d.line(0.3, 0.3, 0.3 + r3 * Math.sin(h), 0.3 + r3 * Math.cos(h));

        d.line(0.3, 0.3, 0.3 + r3*2 * Math.sin(m), 0.3 + r3*2 * Math.cos(m));
        d.setPenColor(d.RED);d.setPenRadius(0.005);
        d.line(0.3, 0.3, 0.3 + r2*2 * Math.sin(s), 0.3 + r2*2 * Math.cos(s));
 */
    }
     
}
