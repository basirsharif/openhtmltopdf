package tests.public_apis.css.properties.factory;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.xhtmlrenderer.css.constants.CSSName;
import org.xhtmlrenderer.css.sheet.factory.OutlinePropertyDeclarationFactory;
import org.xhtmlrenderer.css.sheet.factory.PropertyDeclarationFactory;

/**
 * outline property assignment tests.
 *
 * @author   Patrick Wright
 */
public class OutlinePropertyExplosionTest extends AbstractPropertyExplosionTest {
    /**
     * Constructor for the OutlinePropertyExplosionTest object
     *
     * @param name  PARAM
     */
    public OutlinePropertyExplosionTest( String name ) {
        super( name );
    }
    
    /**
     * Returns a new PropertyDeclarationFactory that we are testing against.
     * Example: <pre>
     *   protected PropertyDeclarationFactory newPropertyDeclarationFactory() {
     *     return BorderSidePropertyDeclarationFactory.instance();
     *   }
     * </pre>
     *
     * @return A new PropertyDeclarationFactory
     */
    protected PropertyDeclarationFactory newPropertyDeclarationFactory() {
        return OutlinePropertyDeclarationFactory.instance();
    }

    /**
     * Returns an initialized Map with test cases. The key is the selector, the value is a two-dimensional Object array,
     * first element the property assignment, second element a Map of exploded property/values. Example:
     * <pre>
     *  Map temp = new HashMap();
     *  Map testVals = null;
     *  testVals = new HashMap();
     *  testVals.put( CSSName.BORDER_COLOR_TOP, Color.BLACK );
     *  testVals.put( CSSName.BORDER_WIDTH_TOP, "1pt" );
     *  testVals.put( CSSName.BORDER_STYLE_TOP, "solid" );
     *  temp.put( "p#BTAllV1", new Object[]{"{ border-top: black 1pt solid; }", testVals} );
     * </pre> You can define as many selectors and comparison cases as you like.
     *
     * @return Initialized test map; see desc.
     */
    protected Map buildTestsMap() {
        Map temp = new TreeMap();
        Map testVals = new TreeMap();

        testVals = new HashMap();
        testVals.put(CSSName.OUTLINE_COLOR, "black");
        testVals.put(CSSName.OUTLINE_STYLE, "solid");
        testVals.put(CSSName.OUTLINE_WIDTH, "thick");
        appendTestPermutations(temp,
                               "p#OutlineStyleAll",
                               CSSName.OUTLINE_SHORTHAND,
                               new String[]{"thick", "solid", "black"},
                               testVals);

        return temp;
    }

    /**
     * A unit test suite for JUnit
     *
     * @return   The test suite
     */
    public static Test suite() {
        return new TestSuite( OutlinePropertyExplosionTest.class );
    }
} // end class

/*

 * $Id$

 *

 * $Log$
 * Revision 1.3  2005/01/29 16:00:42  pdoubleya
 * No longer use identifier-replaced values on PDs.
 *
 * Revision 1.2  2005/01/24 14:32:31  pdoubleya
 * Cleaned imports, removed references to FSCSSTestCase.
 *
 * Revision 1.1  2005/01/24 14:26:48  pdoubleya
 * Added to CVS.
 *

 *

*/

