
abstract class Makhluk
{
    abstract void berjalan();
    void tidur()
    {
        System.out.println("kucing sedang tidur");
    }
}

/**
 * inheritance
 */
interface Hewan 
{
    void makan();
    
}

class Kucing extends Makhluk implements Hewan
{
    @Override
    void berjalan()
    {
        System.out.println('kusing sedang berjalan');
    }

    @Override
    public void makan()
    {
        System.out.println("kucing sedang makan");
    }
}

public class InterAbs
{
    public static void main(String args[]) {
        Kucing miaw = new Kucing();
        miaw.berjalan();
        miaw.makan();
        miaw.tidur();
    }
}