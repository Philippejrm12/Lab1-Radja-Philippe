package main.java.ca.etsmtl.log720.lab1.log720.lab1;

import java.util.ArrayList;

import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client {

    private ArrayList<Reaction> reaction_list;
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

        reaction_list = new ArrayList<Reaction>();
        folder_list = new ArrayList<Dossier>();
        infraction_list = new ArrayList<Infraction>();
    }

    public ArrayList<Reaction> get_reaction_list() {
        return null;
    }

    public void add_reaction_in_system(String description, int niveau) {}

    public ArrayList<Dossier> find_folder_by_name(String name) {
        return null;
    }

    public ArrayList<Dossier> find_folder_by_plate(String plate) {
        return null;
    }

    public ArrayList<Dossier> find_folder_by_license(String license) {
        return null;
    }

    public ArrayList<Infraction> get_infration_list() {
        return null;
    }

    public void add_infraction_in_folder(int infraction_id, int folder_id) {}

    public void add_reaction_in_folder(int reaction_id, int folder_id) {}
}
