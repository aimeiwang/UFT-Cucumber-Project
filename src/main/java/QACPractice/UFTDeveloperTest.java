package QACPractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.hp.lft.cucumberv4.CucumberReporter"},
                 features = "classpath:QACPractice")
public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Test
    public void test() throws GeneralLeanFtException {
    }

}