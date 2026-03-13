package exercises;

import java.util.Scanner;

import entities.BankAccount;


/* 
Crie uma classe chamada ContaBancaria para representar uma conta simples.
Essa classe deve possuir o nome do titular e o saldo da conta. Implemente um
método para realizar depósito, um método para realizar saque e um método para
mostrar o saldo atual. O saque só poderá ser realizado caso exista saldo suficiente.
No programa principal, crie uma conta bancária, faça um depósito, depois tente
realizar um saque e, ao final, mostre o saldo restante.
*/

public class Ex3 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 3 ---\n");

        BankAccount account = new BankAccount("Eduardo", 3000);

        System.out.println(account);
        account.deposit(500.0);
        System.out.println(account);
        account.withdraw(4000.0);
        System.out.println(account);
        account.withdraw(500.0);
        System.out.println(account);
    }
}