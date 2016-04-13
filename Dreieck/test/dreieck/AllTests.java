package dreieck;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ gleichSchenkeligTest.class, gleichSeitigTest.class, rechtWinkeligTest.class, testIstDreieck.class })
public class AllTests {

}
