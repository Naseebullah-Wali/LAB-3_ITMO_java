

class ninth_wave extends Aactions{
    ninth_wave(Guys p, String n){

        super(p, n);
    }
    public void exhausted(){
        System.out.print(getType() + " ");
        System.out.print(getName());

        super.exhausted();
    }
    public void calmed_down(){
        System.out.print(getType() +" ");
        System.out.print(getName());

        super.calmed_down();
    }
}