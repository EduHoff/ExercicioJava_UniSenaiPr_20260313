package exercises;

import java.util.Scanner;

import entities.Lamp;

/* 
Crie uma classe chamada Lâmpada para representar o funcionamento de uma
lâmpada. Essa classe deve possuir uma informação que indique se a lâmpada está
ligada ou desligada. Implemente métodos que permitam ligar a lâmpada, desligála
e mostrar seu estado atual. No programa principal, crie um objeto dessa classe,
ligue a lâmpada, exiba seu estado na tela, depois desligue-a e exiba novamente o
estado atualizado.
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