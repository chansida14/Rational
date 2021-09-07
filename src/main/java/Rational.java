class Rational {
    long numerator , denominator ;
    class Illegal extends Exception {
        String reason;
        Illegal (String reason) {
            this.reason = reason;
        }
    }
    Rational() {
        // to be completed
        denominator = 1;
        numerator = 1;

        if (denominator==0){
            throw new RuntimeException("The value of denominator is zero");
        }
    }
    Rational(long numerator , long denominator ) throws Illegal {

        denominator = this.denominator;

        numerator = this.numerator;

        if (denominator==0){
            throw new RuntimeException("The value of denominator is zero");
        }

    }
    private void simplestForm () {
        long computeGCD ;
        computeGCD = GCD(Math.abs( numerator ), denominator );
        numerator /= computeGCD ;
        denominator /= computeGCD ;
    }
    // find the greatest common denominator
    private long GCD(long a, long b) {
        if (a%b ==0) return b;
        else return GCD(b,a%b);
    }

public void add(Rational x) {
    numerator = ( numerator * x. denominator ) + (x. numerator * denominator );
    denominator = ( denominator * x. denominator );
    simplestForm ();
}

    public void subtract(Rational x) {
        numerator = ( numerator * x. denominator ) - (x. numerator * denominator );
        denominator = ( denominator * x. denominator );
        simplestForm ();    }

    public void multiply(Rational x) {

        denominator = denominator * x.denominator;

        numerator = numerator * x.numerator;

        simplestForm();
    }

    public void divide(Rational x) {
        denominator = denominator * x.numerator;

        numerator = numerator * x.denominator;

        simplestForm();
    }

    public boolean equals(Object x) {

        Rational a = Rational.class.cast(x);
        simplestForm();
        a.simplestForm();
        if(a.numerator == numerator&& a.denominator == denominator){
            return true;
        }
        else
            return false;

    }

    public long compareTo(Object x) {
        // to be completed
        Rational a = Rational.class.cast(x);
        simplestForm();
        a.simplestForm();
        //less
        if ((numerator*a.denominator)<(denominator*a.numerator)){
            return -1;
        } else if ((numerator*a.denominator)>(denominator*a.numerator)){
            return 1;
        } else
            return 0;
    }

    public String toString () {
        return numerator + "/" + denominator;
    }


    public static void main(String [] args) {
        System.out.println("This is Rational class.");
    }
}
