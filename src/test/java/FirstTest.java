import org.junit.Assert;
import org.junit.Test;
import sample.First;

public class FirstTest {

    @Test
    public void testReturnHello(){
        First first=new First();
        Assert.assertSame("Hello Jenkins world",first.returnHello());
    }

}
