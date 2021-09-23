package junitprograms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BackGroundColorjunit.class, FirstProgramjunit.class })
public class AllTests {

}
