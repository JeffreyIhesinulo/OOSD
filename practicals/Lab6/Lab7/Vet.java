public class Vet {
    String name;
    public Vet(String name) {
        this.name = name;
        
    }
    public void vaccinate(Animal a){
        System.out.println(name+" is vaccinating");

        if (a instanceof Dog dog) {
            System.out.println("Dog has been vaccinated: "+ dog.getName()); 
        }
        else if(a instanceof Cat cat)
            System.out.println("Cat has been vaccinated: "+ cat.getName());
    }
    
}
