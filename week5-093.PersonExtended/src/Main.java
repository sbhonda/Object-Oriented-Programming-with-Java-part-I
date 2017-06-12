public class Main 
{
    public static void main(String[] args) 
    {
        Person pekka = new Person("Bday", 6, 6, 2016);

        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    }
}