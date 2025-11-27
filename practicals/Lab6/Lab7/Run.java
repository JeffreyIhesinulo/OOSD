public class Run {
    public static void main(String[] args) {
        Vet vet = new Vet("O'Connel");
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Huinya");
        vet.vaccinate(dog);
    }
    
}
