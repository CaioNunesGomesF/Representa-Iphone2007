package Function;

import Function.MultifunctionalAppliance.Configuracao;
import Function.internetExplorer.Internet;
import Function.telephone.Contact;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Configuracao configuracao = new Configuracao();

        int opcao;


            System.out.println("O que deseja acessar? ");
            System.out.println("1- Internet Explorer");
            System.out.println("2- Telephone");
            System.out.println("3- Music");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println(configuracao.search());
                    break;
                case 2:
                    System.out.println(configuracao.SavesContact());
                    break;
                case 3:
                    configuracao.search();
                    configuracao.playMusic();
                    break;
            }






    }
}
