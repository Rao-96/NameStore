
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class inmemoryNameStore implements NameStore {
    private List<String>names=new ArrayList<>();
    @Override
    public void storeName(String name){
        names.add(name);

    }
    @Override
    public List<String>getNames(){
        return names;
    }
}
