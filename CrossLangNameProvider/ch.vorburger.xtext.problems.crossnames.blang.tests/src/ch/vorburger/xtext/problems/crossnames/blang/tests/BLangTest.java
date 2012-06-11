package ch.vorburger.xtext.problems.crossnames.blang.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(BLangWithADependencyInjectorProvider.class)
@RunWith(XtextRunner2.class)
public class BLangTest extends XtextTest {

    @Test public void testALang() throws Exception {
        testFile("a.alang");
    }

    @Test public void testBLang() throws Exception {
        testFile("b.blang", "a.alang");
    }

    @Test public void testB2Lang() throws Exception {
        testFile("b2.blang", "a.alang");
    }
}