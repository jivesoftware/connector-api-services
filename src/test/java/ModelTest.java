import com.fasterxml.jackson.databind.JsonNode;
import com.jivesoftware.services.model.jive.Result;
import io.nodus.Nodus;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by erwolff on 4/1/15.
 */

@Test
public class ModelTest {

    public void testResult() {
        Nodus result = Nodus.builder(Result.class).build();
        JsonNode resultNode = result.getJson();
        Assert.assertNotNull(resultNode);
    }
}
