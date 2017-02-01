package nl.stil4m.mollie;

import java.lang.reflect.Field;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import nl.stil4m.mollie.mocks.DummyMethod;
import static junit.framework.TestCase.fail;
import static nl.stil4m.mollie.TestUtil.strictDynamicClientWithApiKey;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultObjectMappingTest {

    @Test
    public void testShouldNotFailByDefaultOnAdditionalFields() throws Exception {
        DynamicClient client = new DynamicClientBuilder().build();
        RequestExecutor requestExecutor = (RequestExecutor) getInternalField(client, "requestExecutor");
        ObjectMapper objectMapper = (ObjectMapper) getInternalField(requestExecutor, "objectMapper");

        objectMapper.readValue("{\"id\":\"x\", \"name\":\"Foo\"}", DummyMethod.class);
    }

    @Test
    public void testShouldFailForStrictObjectMapperOnAdditionalFields() throws Exception {
        DynamicClient client = strictDynamicClientWithApiKey();
        RequestExecutor requestExecutor = (RequestExecutor) getInternalField(client, "requestExecutor");
        ObjectMapper objectMapper = (ObjectMapper) getInternalField(requestExecutor, "objectMapper");

        try {
            objectMapper.readValue("{\"id\":\"x\", \"name\":\"Foo\"}", DummyMethod.class);
            fail();
        } catch (UnrecognizedPropertyException e) {
            assertThat(e.getPropertyName(), is("name"));
        }
    }

    private static <T> Object getInternalField(T target, String field) throws IllegalAccessException {
        try {
            Class<?> targetClass = target.getClass();
            Field cField = targetClass.getDeclaredField(field);
            cField.setAccessible(true);
            return cField.get(target);
        } catch (NoSuchFieldException e) {
            return null;
        }
    }


}
