package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Student;
import utils.ConsoleUtils;


/* 
Crie uma classe chamada Aluno para armazenar os dados de um estudante. Essa
classe deve possuir o nome do aluno e duas notas. Implemente um método
responsável por calcular a média das cinco notas e outro método para exibir os
dados do aluno na tela. No programa principal, crie um objeto da classe Aluno,
atribua valores para o nome e para as notas, calcule a média e apresente todas
essas informações ao usuário.
*/

public class Ex2 implements Exercise {

    private static final int LIMIT = 5;

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 1 ---\n");

        Student student = new Student("Eduardo");

        int last_int = 0;
        while (last_int < LIMIT) {
            try{

                for(int i=last_int; i<LIMIT; i++){
                    System.out.println("Digite a "+(i+1)+"ª nota.");
                    System.out.print("||");
                    double num = sc.nextDouble();
                    if(num < 0 || num > 10){
                        throw new InputMismatchException();
                    }
                    student.addNote(num);
                    last_int = i + 1;
                    ConsoleUtils.clear();
                }
            }catch(InputMismatchException e){
                ConsoleUtils.clear();
                System.out.println("Digite apenas números maiores ou igual a zero e que não seja maior que 10!\n");
                sc.nextLine();
            }catch(Exception e){
                ConsoleUtils.clear();
                e.printStackTrace();
            }
        }

        System.out.println(student.toString());
    }
}