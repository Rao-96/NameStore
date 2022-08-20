import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class FileBasedNameStoreTest {
    @Test
    public void should_Store_when_call_StoreName_is_called(){
        NameStore store=new FileBasedNameStore();
        assertThat(store.getNames(),is(empty()));
        store.storeName("kamal");
        assertThat(store.getNames(),contains("kamal"));
    }
    @Test
    public void should_GetAll_when_call_getName_is_called(){
        NameStore store=new FileBasedNameStore();
        store.storeName("kamal");
        store.storeName("nimal");
        assertThat(store.getNames(),containsInAnyOrder("kamal","nimal"));
    }
}
