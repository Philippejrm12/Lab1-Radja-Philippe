package main.java.ca.etsmtl.log720.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App 
{
    private static Client client;

    public static void main( String[] args )
    {
        System.out.println("Welcome - Poste de Police \n");
        main_menu();
        client = new Client();
    }

    public static void main_menu() {
        String menu = "1 - Ajouter un dossier dans le système \n" +
                      "2 - Ajouter une infratction dans le système \n" +
                      "3 - Voir la liste des dossiers \n" +
                      "4 - Voir la liste des infraction \n" +
                      "5 - Quitter \n";
        System.out.println("Menu \n");
        System.out.println(menu);
        System.out.println("Choisisez une option");


        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int selected_option = Integer.parseInt(buffered_reader.readLine());

            switch (selected_option) {
                case 1: add_folder();
                    break;
                case 2: add_infraction();
                    break;
                case 3: show_folders();
                    break;
                case 4: show_infractions();
                    break;
                case 5: system_exit();
                    break;
                default: main_menu();
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void show_folders () {
        ArrayList<Dossier> folders_list = client.get_folders_list();
        for (Dossier folder : folders_list) {
            System.out.println(folder.toString());
        }
    }

    private static void show_infractions () {
        ArrayList<Infraction> infractions_list = client.get_infractions_list();
        for (Infraction infraction : infractions_list) {
            System.out.println(infraction.toString());
        }
    }

    private static void add_folder () {
        System.out.println("\nAjout d'un nouveau dossier \n");
        System.out.println("\nEntrez le nom \n");
        String nom = "";
        String prenom = "";
        String noPermis = "";
        String noPlaque = "";
        int niveau = 0;

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            nom = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le prénom \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            prenom = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le numéro de permis \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            noPermis = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le numéro de plaque \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            noPlaque = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le niveau \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            niveau = Integer.parseInt(buffered_reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        client.add_folder(nom, prenom, noPermis, noPlaque, niveau);
    }

    private static void add_infraction () {
        System.out.println("\nAjout d'une nouvelle infraction \n");
        System.out.println("Entrez la description \n");
        String description = "";
        int niveau = 0;

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            description = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le niveau \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            niveau = Integer.parseInt(buffered_reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        client.add_infration(description, niveau);
    }

    private static void system_exit () {
        System.out.println("See you next time");
        System.exit(0);
    }
}
