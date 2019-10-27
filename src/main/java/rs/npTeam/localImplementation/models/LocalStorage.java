package rs.npTeam.localImplementation.models;

import interfaces.File_Manipulation_Interface;
import interfaces.User_Interface;
import model.User;
import model.UserPriority;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocalStorage implements File_Manipulation_Interface, User_Interface {

    private LocalStorage instance = null;

    private LocalStorage() {
        runLocal();
    }

    void runLocal() {

        //C:\Users\pavlenski\Desktop\SOFT KOMP\malina

        String path;

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER DESIRED PATH: ");
        path = sc.nextLine();

        String username;
        String password;

        if(!path.isEmpty()) {
            System.out.println("PATH SET..");

           // List<String> result = new ArrayList<>();

            try {
                File file = new File(path);

                if(file.exists()) {
                    System.out.println("FILE EXISTS");
                    System.out.println("FILE CREATED..\n..PLEASE LOGIN..\nUSERNAME:");

                    if(file.isDirectory()) {
                        //search(".*\\.txt", file, result);
                    }
                } else {
                    System.out.println("FILE DOESNT EXIST");
                    file.mkdir();
                    System.out.println("FILE CREATED.. \n..ENTER YOUR CREDENTIALS..\nUSERNAME:");
                    username = sc.nextLine();
                    System.out.println("PASSWORD:");
                    password = sc.nextLine();

                    User admin = new User(username, password, UserPriority.ADMIN);
                    System.out.println(admin + " CREATED!");
                }

                /*for (String s : result) {
                    System.out.println(s);
                }*/

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("printerror");
        }

    }


    @Override
    public void create_dir(File file) {

    }

    @Override
    public void create_multiple_dir() {

    }

    @Override
    public void generate_archive() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void delete_rek() {

    }

    @Override
    public void find() {

    }

    @Override
    public void put_files() {

    }

    @Override
    public void get_files() {

    }

    @Override
    public void sign_in() {

    }

    @Override
    public void sign_out() {

    }

    @Override
    public void create_user() {

    }

    @Override
    public void delete_user() {

    }

    public LocalStorage getInstance() {
        if(instance == null) instance = new LocalStorage();
        return instance;
    }
}
