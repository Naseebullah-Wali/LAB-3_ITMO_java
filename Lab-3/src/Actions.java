

abstract class Actions implements IComparison, IObject{
    private Guys type;
    private String Name;

    Actions(Guys p, String n) {
       type = p;
       Name = n;
    }
    public Guys getType(){
        return type;
    }
    public String getName(){
        return Name;
    }
    public void admired(){
        System.out.println(" often admired and remaind ash clouds and dark crimsons");
    }
    public void idea (){
        System.out.println(" had no idea what happend to his friends in Moomin");
    }

    public void eruption(){
        System.out.println(" created From the vocanic eruption");
    }
    public void believed(){
        System.out.println(" believed that his friends are all sitting peacefully on their veranda and celebrating summer");
    }
    public void Sattle(){
        System.out.println(" had to settle scores with the Park Guard");
    }


    @Override
    public String toString() {

        return getName() + type;
    }

    @Override
    public boolean equals(Object obj) {


        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {

        return getName().hashCode() + type.hashCode();
    }
}