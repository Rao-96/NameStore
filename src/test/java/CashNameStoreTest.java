import org.junit.jupiter.api.Test;

import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.*;

public class CashNameStoreTest {
@Test
    public void should_CacheAndwriteToFileStore_when_AValueIsStored(){
    NameStore filestore=mock(NameStore.class);
    doNothing().when(filestore).storeName("Kamal");
    CashNameStore store=new CashNameStore(filestore);
    store.storeName("kamal");
verify(filestore).storeName("kamal");

    }
@Test
    public void should_returnAllValuesInFileStoreForTheFirstTime_When_GetNamesCalled(){
    NameStore filestore=mock(NameStore.class);
    doNothing().when(filestore).storeName("New Name");
    doReturn(List.of("New Name","Old name1","old name2")).when(filestore).getNames();
    CashNameStore store=new CashNameStore(filestore);
    store.storeName("New Name");
    assertThat(store.getNames(),containsInAnyOrder("Old name1","old name2","New Name"));
    verify(filestore).storeName("New Name");
verify(filestore).getNames();
}
}
