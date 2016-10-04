package ca.etsmtl.log720.lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App 
{
    private static Client client;

    public static void main( String[] args )
    {
        System.out.println("Welcome - Système Voiture \n");
        main_menu();
        client = new Client();
    }

    public static void main_menu() {
        String menu = "1 - Obtenir la liste de réaction \n" +
                      "2 - Ajouté une réaction à un dossier \n" +
                      "3 - Ajouté une réaction dans le système \n" +
                      "4 - Chercher un dossier \n" +
                      "5 - Obtenir la liste des infractions possibles \n" +
                      "6 - Ajouté une infraction à un dossier \n" +
                      "7 - Quitter \n";
        System.out.println("Menu \n");
        System.out.println(menu);
        System.out.println("Choisisez une option");


        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int selected_option = Integer.parseInt(buffered_reader.readLine());

            switch (selected_option) {
                case 1: reaction_list();
                    break;
                case 2: add_reaction_to_file();
                    break;
                case 3: add_reaction_in_system();
                    break;
                case 4: find_file();
                    break;
                case 5: infraction_list();
                    break;
                case 6: add_infraction_in_folder();
                    break;
                case 7: system_exit();
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void reaction_list () {
        ArrayList<Reaction> reaction_list = client.get_reaction_list();
        for (Reaction reaction : reaction_list) {
            System.out.println(reaction.toString());
        }
    }

    private static void add_reaction_to_file () {
        System.out.println("\nEntrez le numéro de dossier \n");
        int reaction_id = 0;
        int folder_id = 0;

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            folder_id = Integer.parseInt(buffered_reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le numéro de la réaction \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reaction_id = Integer.parseInt(buffered_reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        client.add_reaction_in_folder(reaction_id, folder_id);
    }

    private static void add_reaction_in_system () {
        System.out.println("\nAjout d'une nouvelle réaction \n");
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

        client.add_reaction_in_system(description, niveau);
    }

    private static void find_file () {
        ArrayList<Dossier> folder_list = new ArrayList<Dossier>();
        System.out.println("\nTrouver un dossier \n");
        String menu = "1 - Nom et prénom \n" +
                      "2 - Numéro de plaque \n" +
                      "3 - Numéro de permis \n";
        System.out.println("Choisisez une de ces options pour trouver un dossier \n");
        System.out.println(menu);

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int selected_option = Integer.parseInt(buffered_reader.readLine());

            switch (selected_option) {
                case 1: folder_list = find_folder_by_name();
                    break;
                case 2: folder_list = find_folder_by_plate();
                    break;
                case 3: folder_list = find_folder_by_plate();
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Dossier folder : folder_list) {
            System.out.println(folder.toString());
        }
    }

    private static ArrayList<Dossier> find_folder_by_license () {
        String license = "";
        System.out.println("\nEntrez le numéro de plaque \n");

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            license = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client.find_folder_by_license(license);
    }

    private static ArrayList<Dossier> find_folder_by_plate () {
        String plate = "";
        System.out.println("\nEntrez le numéro de plaque \n");

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            plate = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client.find_folder_by_plate(plate);
    }

    private static ArrayList<Dossier> find_folder_by_name () {
        String name = "";
        System.out.println("\nEntrez le nom et prénom \n");

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = buffered_reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client.find_folder_by_name(name);
    }

    private static void infraction_list () {
        ArrayList<Infraction> infraction_list = client.get_infration_list();
        for (Infraction infraction : infraction_list) {
            System.out.println(infraction_list.toString());
        }
    }

    private static void add_infraction_in_folder () {
        System.out.println("\nEntrez le numéro de l'infration \n");
        int infraction_id = 0;
        int folder_id = 0;

        BufferedReader buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            infraction_id = Integer.parseInt(buffered_reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nEntrez le numéro de dossier \n");
        buffered_reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            folder_id = Integer.parseInt(buffered_reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        client.add_infraction_in_folder(infraction_id, folder_id);
    }

    private static void system_exit () {
        System.out.println("See you next time");
        System.exit(0);
    }
}
