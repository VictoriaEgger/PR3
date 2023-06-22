package FileIOAbschlussBSP;

public class Main {
    public static void main(String[] args) {
        Adress a1 = new Adress("Peter", "Fox","066455656", "email@1");
        Adress a2 = new Adress("Arnold", "Hugo","066453333", "email@2");
        Adress a3 = new Adress("Ernst", "Merz","066453223", "email@3");

        AdressManager adressManager =new AdressManager();
        adressManager.add(a1);
        adressManager.add(a2);
        adressManager.add(a3);

        adressManager.printAllAdresses();

        System.out.println();

        try {
            adressManager.exportToCsv("adresses.txt", ", ");
        } catch (AdressExportException e) {
            throw new RuntimeException(e);
        } catch (AddressExportFileAlreadyExistsException e) {
            System.out.println("ERROR: File already exists");
        }

        System.out.println();

        try {
            adressManager.loadFromCsv("adresses.txt", ",");
        } catch (AdressLoadException | AddressLoadWrongFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
