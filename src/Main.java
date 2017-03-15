import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // Телефонный справочник
        HomePhone homePhone = new HomePhone("334-67-80", "Минск");
        MobilePhone mobilePhone = new MobilePhone("+375 25 7680909", "MTS");

        Contact contact1 = new Contact("Вася ", "Петров ", homePhone, mobilePhone);

        HomePhone homePhone2 = new HomePhone("224-55-18", "Могилёв");
        MobilePhone mobilePhone2 = new MobilePhone("+375 44 7680099", "Velcom");

        Contact contact2 = new Contact("Вова ", "Иванов ", homePhone2, mobilePhone2);

        String[] strs = new String[]{contact1.toString(), contact2.toString()};

        InputOutputData.writeDataToFile("textFile.txt", strs);

        //ArrayList<String> listOfContact = InputOutputData.readDataFromFile("textFile.txt");
        //System.out.println(listOfContact);

        String dbAdmin = DatabaseConfig.getValue("db.username");
        System.out.println(dbAdmin);
        String dbPass = DatabaseConfig.getValue("db.password");
        System.out.println(dbPass);
        String dbPort = DatabaseConfig.getValue("db.port");
        System.out.println(dbPort);
    }
}
