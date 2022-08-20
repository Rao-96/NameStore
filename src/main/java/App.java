
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        NameStore filestore=new inmemoryNameStore();
        NameStore nameStore=new CashNameStore(filestore);

        while(scanner.hasNextLine()){
            String name=scanner.nextLine();
            if("show".equals(name)){
                nameStore.getNames().forEach(System.out::println);

            }
            else{
                nameStore.storeName(name);
            }
        }
    }
}
