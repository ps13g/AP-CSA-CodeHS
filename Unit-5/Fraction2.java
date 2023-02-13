public class Fraction2 {
    private int num;
    private int denom;
    public Fraction2(int n, int d)
    {
        num = n; denom = d;
    }
    public int getNum()
    {
        return num;
    }
    public int getDenom()
    {
        return denom;
    }
    public void setNum(int n)
    {
        num = n;
    }
    public void setDenom(int d)
    {
        denom = d;
    }
    public String toString()
    {
        return num + "/" + denom;
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(3, 5);
        Fraction b = new Fraction(1, 4);
        Fraction c = a.multiply(b);
        public String multiply(Fraction other) { String f = "" + this.num*other.num + "/" + this.denom*other.denom; return f; }        System.out.println(c);
        }
    }
}
