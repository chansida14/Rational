import org.junit.Assert;
import org.junit.Test;

    public class RationalTest {
        @Test
        public void testAdd() {
            Rational x = new Rational();
            x.numerator = 1;
            x.denominator = 2;
            Rational y = new Rational();
            y.numerator = 1;
            y.denominator = 4;
            x.add(y);
            Assert.assertEquals(3, x.numerator);
            Assert.assertEquals(4, x.denominator);
        }

        @Test
        public void testSubtract() {
            Rational x = new Rational();
            x.numerator = 1;
            x.denominator = 2;
            Rational y = new Rational();
            y.numerator = 1;
            y.denominator = 4;
            x.subtract(y);
            Assert.assertEquals(1, x.numerator);
            Assert.assertEquals(4, x.denominator);
        }

        @Test
        public void testMultiply() {
            Rational x = new Rational();
            x.numerator = 1;
            x.denominator = 2;
            Rational y = new Rational();
            y.numerator = 1;
            y.denominator = 4;
            x.multiply(y);
            Assert.assertEquals(1, x.numerator);
            Assert.assertEquals(8, x.denominator);
        }

        @Test
        public void testDivide() {
            Rational x = new Rational();
            x.numerator = 1;
            x.denominator = 2;
            Rational y = new Rational();
            y.numerator = 1;
            y.denominator = 4;
            x.divide(y);
            Assert.assertEquals(2, x.numerator);
            Assert.assertEquals(1, x.denominator);
        }

        @Test
        public void testEquals() {
            Rational x = new Rational();
            x.numerator = 1;
            x.denominator = 2;
            Rational y = new Rational();
            y.numerator = 4;
            y.denominator = 2;
            Rational z = new Rational();
            z.numerator = 2;
            z.denominator = 1;
            Rational w = new Rational();
            w.numerator = 2;
            w.denominator = 1;

            Assert.assertFalse("False ok", x.equals(y));
            Assert.assertTrue("True ok", y.equals(z));
            Assert.assertTrue("True ok", w.equals(z));
        }

        @Test
        public void testCompareTo() {
            Rational x = new Rational();
            x.numerator = 3;
            x.denominator = 5;
            Rational y = new Rational();
            y.numerator = 4;
            y.denominator = 2;
            Rational z = new Rational();
            z.numerator = 2;
            z.denominator = 1;

            Assert.assertEquals(-1, x.compareTo(y));
            Assert.assertEquals(1, y.compareTo(x));
            Assert.assertEquals(0, y.compareTo(z));
        }

        @Test
        public void testToString() {
            Rational x = new Rational();
            x.numerator = 1;
            x.denominator = 2;
            Rational y = new Rational();
            y.numerator = 3;
            y.denominator = 4;
            Assert.assertEquals("1/2", x.toString());
            Assert.assertEquals("3/4", y.toString());
        }
    }



