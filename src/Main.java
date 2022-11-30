import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter=new FileWriter("Alphabet.txt")) {
            fileWriter.write("""
                    A a
                    B b
                    C c
                    ...
                    ...
                    Z z
                   0
                   1
                   2
                   3
                   4
                   5
                   5
                   6
                   7
                   8
                   9
                
                  """);
        }catch (IOException e){
            System.out.println("Error!");
        }
        try(FileReader fileReader=new FileReader("Alphabet.txt")) {
            Scanner scanner =new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error!!!");
        }
    }
}