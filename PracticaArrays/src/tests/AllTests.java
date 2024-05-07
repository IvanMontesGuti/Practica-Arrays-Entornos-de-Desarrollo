package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testMaxima.class, testMedia.class, testMediana.class, testMinima.class })
public class AllTests {

}
