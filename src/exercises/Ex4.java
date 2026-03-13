package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Product;



/* 
Desenvolva um programa em Java para gerenciar os produtos de uma loja de
conveniência, utilizando um ArrayList como estrutura de dados. Cada produto deve
ter, no mínimo, nome, preço de venda e quantidade em estoque. Para facilitar o uso
pelos funcionários, o programa precisa permitir consultas rápidas a um produto
pelo seu código (equivalente à posição no ArrayList), exibindo as informações
essenciais: nome, preço e quantidade disponível.
Quando ocorre uma venda, o sistema deve localizar o produto no ArrayList e
verificar se há estoque suficiente para atender ao pedido. Em caso positivo, deve
descontar a quantidade vendida do estoque e atualizar as informações no ArrayList.
Se o estoque for insuficiente, é importante exibir um aviso informando que a venda
não pode ser concluída.
A gerência também precisa de um mecanismo para alterar o valor de venda de
qualquer produto, a fim de aplicar promoções ou ajustar preços. Isso implica
encontrar o produto no ArrayList e redefinir seu preço de acordo com as instruções
recebidas.
Por fim, o programa deve exibir relatórios que mostrem todos os produtos
armazenados no ArrayList, apresentando as informações-chave de cada item para
auxiliar em conferências e decisões de compra.
*/

public class Ex4 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Estudo de caso 1 ---\n");


        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product("Coca-Cola", 5.50, 20)); // Cód 0
        inventory.add(new Product("Chocolate", 7.00, 15));  // Cód 1
        inventory.add(new Product("Salgadinho", 10.00, 5)); // Cód 2

        System.out.println("Consulta Cód 1: " + inventory.get(1));


        System.out.println("\nVendendo 3 Cocas (Cód 0)...");
        if (inventory.get(0).sell(3)) {
            System.out.println("Venda concluída!");
        }

        System.out.println("Vendendo 10 Salgadinhos (Cód 2)...");
        if (!inventory.get(2).sell(10)) {
            System.out.println("AVISO: Venda não concluída! Estoque insuficiente.");
        }

        System.out.println("\nAplicando promoção no Chocolate (Cód 1)...");
        inventory.get(1).setPrice(5.99);

        System.out.println("\n--- RELATÓRIO DE ESTOQUE ---");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("Código: " + i + " | " + inventory.get(i));
        }
    }
}