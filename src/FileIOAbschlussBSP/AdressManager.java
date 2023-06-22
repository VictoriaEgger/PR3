package FileIOAbschlussBSP;

import UE11.Product;

import java.io.*;
import java.util.ArrayList;

public class AdressManager {
    private ArrayList<Adress> adresses = new ArrayList<>();

    public ArrayList<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<Adress> adresses) {
        this.adresses = adresses;
    }

    public void add(Adress a) {
        adresses.add(a);
    }

    public void printAllAdresses() {
        int i = 0;
        for (Adress a : adresses) {
            System.out.println("Eintrag " + i + ": " + a.toString());
            i++;
        }
    }

    public void exportToCsv(String path, String seperator) throws AdressExportException, AddressExportFileAlreadyExistsException {


        File f = new File(path);
        if (f.exists()) {

            throw new AddressExportFileAlreadyExistsException("File already exists.");
        }
        try {
            System.out.println("ADRESSE MANAGER: File " + path + " has been saved.");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("ADRESSE MANAGER: Saving the following adresses to: " + path + " ... ");
            for (Adress a : adresses) {
                String one_line = a.getFirstname() + seperator + a.getLastname() + seperator + a.getMobileNumber() + seperator + a.getEmail();
                System.out.println("Eintrag " + one_line);
            }

            for (Adress a : adresses) {
                String one_line = a.getFirstname() + seperator + a.getLastname() + seperator + a.getMobileNumber() + seperator + a.getEmail();
                System.out.println("SAVED Eintrag " + one_line);
                bw.write(one_line);
                bw.newLine();

            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("IO Exception : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void loadFromCsv(String path, String seperator) throws AdressLoadException, AddressLoadWrongFormatException {

        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("ADDRESS MANAGER: Printing all adresse from FILE: " + path);

            String oneline = ""; //"Ernst,Merz,066453223,email@3";    //String initialisieren, mit der genauen menge an werten

            while ((oneline = br.readLine()) != null) { //Solange noch etwas auf der online ist (über den br von der file) wird das ausgeführt


                String[] outpuArray = oneline.split(seperator, 4); //Temporärer Array der schaut wo ein "," ist. Maximal 4 Werte werden unterteilt
                String firstname = outpuArray[0];       // 4 Werte festlegen
                String lastname = outpuArray[1];
                String tel = outpuArray[2];
                String email = outpuArray[3];


                Adress temp = new Adress(firstname, lastname, tel, email);     //Die werte die er gefunden hat wird in dieses Adress object gespeichert
            }
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
            } catch (IOException e) {
            throw new AddressLoadWrongFormatException(e.getMessage());
        }

    }


    @Override
    public String toString() {
        return "AdressManager{" +
                "adresses=" + adresses +
                '}';
    }
}
