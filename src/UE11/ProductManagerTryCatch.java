package UE11;

import java.io.*;
import java.util.ArrayList;

public class ProductManagerTryCatch {

    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        System.out.println("Hat Produkt " + p.getProductName() + " hinzugefügt.");
        products.add(p);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }

    public void saveToFile(String path){
        System.out.println("File " + path + " has been saved.");
        File f = new File(path);
        try {


            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Product p : products) {         // reine ausgabe in die konsole, dass alle producte "hinzugefügt" werden
                System.out.println("ProductManager: Save to file: saving Product " + p.toString());
                bw.write(p.toString());         //Mit dem BufferedWriter werden die einzenen produkte zur liste hinzugefügt
                bw.newLine();                   // macht einen zeilenumbruch sonst in einer wurscht
            }

            System.out.println("flush...");
            bw.flush();
            System.out.println("closing file..." + path);
            bw.close();
        }
        catch (IOException e){
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void readFromFile(String path){
        System.out.println("Reading from products from file (" + path + ")..." );
        try {


            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            for (Product p : products) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("FileNotFoundExecption Message: " + fnfe.getMessage());
            fnfe.printStackTrace();
        }
        catch (IOException ioe){
            System.out.println("IOException: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }


}
