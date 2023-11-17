package OOPS;


// Classical Java implementation of singleton
// design pattern
class Singleton
{
    private static Singleton obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {

    }

    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }

    public static void main(String[] args) {
        Singleton x =  new Singleton();
        Singleton y = new Singleton();
        System.out.println(x.getInstance());
        System.out.println(y.getInstance());

    }
}
