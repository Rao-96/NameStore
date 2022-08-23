

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class DbNameStore implements NameStore {
    String connectionfileName="http://root:12345678@localhost:3306";
    String db="namestore";
    @Override
    public void storeName(String name){
//        try{
//            FileWriter writer=new FileWriter(fileName,true);
//            writer.append(name+"\n");
//            writer.close();
//        }catch(IOException e){
//            throw new RuntimeException("File can't read"+e);
//
//        }
        //to be done

    }
    @Override
    public List<String>getNames(){
//        try{
//            return Files.readAllLines(Path.of(fileName));
//
//        }catch(RuntimeException | IOException e){
//            throw new RuntimeException("File can't read"+e);
//        }

        //to ber done
        return null;
    }
    public void setDB(){

    }

}
