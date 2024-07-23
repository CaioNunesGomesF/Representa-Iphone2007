package Function.MultifunctionalAppliance;

import Function.MusicPlayer.Music;
import Function.internetExplorer.Internet;
import Function.telephone.Contact;

import java.util.Scanner;

public class Configuracao implements Internet, Music, Contact {
    @Override
    public String SelectYourMusic() {

        Scanner sc = new Scanner(System.in);
        System.out.println("O que deseja pesquisar? ");
        String name = sc.nextLine();

        return "Buscando a musica " + name + ".";
    }

    @Override
    public void playMusic() {
        System.out.println("Musica encontrada, tocando.");
    }

    @Override
    public String search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("O que deseja pesquisar? ");
        String pesquisa = sc.nextLine();


        return "Pesquisando por " + pesquisa + ".";
    }

    @Override
    public String SavesContact() {
        return "Ana Silva: (11) 9876-5432\n" +
                "Pedro Santos: (21) 5555-1234\n" +
                "Mariana Oliveira: (31) 9876-7890\n" +
                "Lucas Pereira: (41) 1234-5678\n" +
                "Isabela Almeida: (51) 9876-4321";
    }


}
