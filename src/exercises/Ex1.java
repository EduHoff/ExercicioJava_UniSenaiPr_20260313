package exercises;

import java.util.Scanner;

import entities.Lamp;

/* 
Analise o código abaixo e faça o teste de mesa, indicando ao final qual será
a saída do programa.
*/

//OBS.: use o debugger caso queira fazer o teste de mesa

public class Ex1 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 1 ---\n");

        Lamp lampada = new Lamp();
        System.out.println(lampada.toString());
        lampada.switchLamp();
        System.out.println(lampada.toString());
        lampada.switchLamp();
        System.out.println(lampada.toString());
    }
}