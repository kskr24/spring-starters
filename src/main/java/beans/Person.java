package beans;

public class Person {
    private String name;
    private Parrot parrot;

    public void setName(String name){
        this.name = name;
    }

    public void setParrot(Parrot p){
        this.parrot = p;
    }

    public String getName(){
        return name;
    }

    public Parrot getParrot(){
        return parrot;
    }

}
