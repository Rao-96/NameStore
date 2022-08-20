import java.util.List;

public class CashNameStore implements NameStore{


    private NameStore cache;
    private final NameStore filestore;
private final boolean isFirstTimeRead=true;
    public CashNameStore(NameStore filestore) {

        this.filestore = filestore;
    }

    @Override
    public void storeName(String Name) {
//if(cache!=null){
//    cache.storeName(Name);
//}

filestore.storeName(Name);
    }

    @Override
    public List<String> getNames() {
//      List<String> namesinFileStore=filestore.getNames();
//      if(cache==null){
//          cache=new inmemoryNameStore();
//      }
//        for (String name:namesinFileStore
//             ) {
//            cache.storeName(name);
//        }
        return filestore.getNames();
    }
}
