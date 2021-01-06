
abstract class Aactions implements IComparison, IObject{
    Guys type;
    private String Name;

    Aactions(Guys p, String n) {
        type = p;
        Name = n;
    }
    public Guys getType(){
        return type;
    }
    public String getName(){
        return Name;
    }
    public void exhausted(){
        System.out.println(" exhausted in the bay");
    }
    public void calmed_down(){
        System.out.println(" clamed down in the bay");
    }
    public void reigned(){
        System.out.println(" reigned here in all its glory");
    }}