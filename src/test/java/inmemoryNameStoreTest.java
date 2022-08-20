import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class inmemoryNameStoreTest {
@Test
public void should_storeName_when_inastnce(){
    inmemoryNameStore store=new inmemoryNameStore();
    assertThat(store.getNames(),is(empty()));

}
    @Test
    public void should_storeName_when_A_Nameisgiven(){
        inmemoryNameStore store=new inmemoryNameStore();
        store.storeName("kamal");
        assertThat(store.getNames(),hasSize(1));

    }
    @Test
    public void should_storeName_when_A_storedNameisAvailable(){
        inmemoryNameStore store=new inmemoryNameStore();
        store.storeName("kamal");
        assertThat(store.getNames(),contains("kamal"));

    }
    @Test
    public void should_GetAllNames_when_store_hasmanynames(){
        inmemoryNameStore store=new inmemoryNameStore();
        store.storeName("kamal");
        store.storeName("Amal");
        assertThat(store.getNames(),containsInAnyOrder("Amal","kamal"));

    }
}
