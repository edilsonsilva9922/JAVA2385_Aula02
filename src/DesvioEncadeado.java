import java.util.Scanner;

public class DesvioEncadeado {

    public static void main(String[] args) {
        /*Uma ONG resolveu prestar um servi�o bem diferente: ela oferece vans para buscar pessoas com qualquer tipo de dificuldade de locomoção para poderem votar.
         * Para evitar problemas no momento do embarque, por�m, voc� foi convidado a criar um programa que valide a idade dos passageiros: caso tenham 16 anos ou
         * menos, não podem votar (e nem embarcar). Caso tenham entre 16 anos e 18 incompletos, podem optar por votar ou não. Caso tenham mais de 18 anos, devem
         * votar obrigatoriamente.
         * Crie um programa que receba a idade dos passageiros em potencial e indique se podem embarcar e votar.*/

        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Por favor, digite a idade do passageiro.");
        idade = leitor.nextInt();

        /*Aqui devemos criar uma solução para realizar as verificaçães.*/
        if (idade < 16) {
            System.out.println("O passageiro nnão podem votar (e nem embarcar)");
        } else if (idade >= 18) {
            System.out.println("O passageiro deve votar obrigatoriamente");
        } else {
            System.out.println("O voto do passageiro pode optar por votar ou não");
        }


        leitor.close();

    }
}
