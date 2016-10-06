package main.java.ca.etsmtl.log720.lab1;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import java.util.ArrayList;

public class Client {

    private ArrayList<Dossier> folder_list;
    private ArrayList<Infraction> infraction_list;

    public Client() {

        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
        try {
            NamingContextExt nc = NamingContextExtHelper.narrow(orb.resolve_initial_references(""));
            NameComponent [] name = new NameComponent[] {
                    new NameComponent("","")
            };
            //Registraire resgistraire = RegistraireHelper.
        } catch (InvalidName invalidName) {
            invalidName.printStackTrace();
        }

        folder_list = new ArrayList<Dossier>();
        infraction_list = new ArrayList<Infraction>();
    }

    public ArrayList<Dossier> get_folders_list() {
        return null;
    }

    public ArrayList<Infraction> get_infractions_list() {
        return null;
    }

    public void add_folder(String nom, String prenom, String noPermis, String noPlaque, int niveau) {
    }

    public void add_infration(String description, int niveau) {
    }
}
