import javax.lang.model.util.SimpleAnnotationValueVisitor14;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("resource/myAccounts.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File is already there");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        BanckAccount account = new SavingAccount(1234567L,"Nivija",2000);
        BanckAccount account1 = new CurrentAccount(987654L,"Nivi",20000.00);

        try(FileWriter writer = new FileWriter("resource/myAccounts.txt",true)){
            writer.write(account.toString());
            writer.write(account.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Scanner reader = new Scanner(new File("resource/myAccounts.txt"));
            //System.out.println(reader.next());
            while (reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}