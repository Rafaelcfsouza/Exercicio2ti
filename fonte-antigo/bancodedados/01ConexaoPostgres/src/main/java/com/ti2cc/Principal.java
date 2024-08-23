package com.ti2cc;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        carroDAO dao = new carroDAO();

        if (dao.conectar()) {
            int opcao = 0;
            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1) Listar");
                System.out.println("2) Inserir");
                System.out.println("3) Excluir");
                System.out.println("4) Atualizar");
                System.out.println("5) Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1: // Listar
                        Carro[] carros = dao.getCarros();
                        for (Carro carro : carros) {
                            System.out.println(carro.toString());
                        }
                        break;

                    case 2: // Inserir
                        System.out.print("Marca: ");
                        String marca = scanner.next();
                        System.out.print("Modelo: ");
                        String modelo = scanner.next();
                        System.out.print("Ano: ");
                        int ano = scanner.nextInt();
                        System.out.print("Cor: ");
                        String cor = scanner.next();
                        Carro novoCarro = new Carro(-1, marca, modelo, ano, cor);
                        if (dao.inserirCarro(novoCarro)) {
                            System.out.println("Carro inserido com sucesso!");
                        }
                        break;

                    case 3: // Excluir
                        System.out.print("ID do carro a excluir: ");
                        int idExcluir = scanner.nextInt();
                        if (dao.excluirCarro(idExcluir)) {
                            System.out.println("Carro excluído com sucesso!");
                        }
                        break;

                    case 4: // Atualizar
                        System.out.print("ID do carro a atualizar: ");
                        int idAtualizar = scanner.nextInt();
                        System.out.print("Nova Marca: ");
                        String novaMarca = scanner.next();
                        System.out.print("Novo Modelo: ");
                        String novoModelo = scanner.next();
                        System.out.print("Novo Ano: ");
                        int novoAno = scanner.nextInt();
                        System.out.print("Nova Cor: ");
                        String novaCor = scanner.next();
                        Carro carroAtualizado = new Carro(idAtualizar, novaMarca, novoModelo, novoAno, novaCor);
                        if (dao.atualizarCarro(carroAtualizado)) {
                            System.out.println("Carro atualizado com sucesso!");
                        }
                        break;

                    case 5: // Sair
                        dao.close();
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } while (opcao != 5);

        } else {
            System.out.println("Não foi possível conectar ao banco de dados!");
        }
        scanner.close();
    }
}