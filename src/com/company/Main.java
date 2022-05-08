package com.company;

public class Main {

    public static void main(String[] args) {
        It dog = new It();
        dog.setAnimal("Dog");
        System.out.println(dog.getAnimal());
        dog.setName("Tuzik");
        System.out.println("Dog's name: " + dog.getName());
        dog.setKindOf("Husky");
        System.out.println("What kind of animal: " + dog.getKindOf());
        dog.setColor("black");
        System.out.println("Dog's color: " + dog.getColor()+"age");
        dog.setAge(8);
        System.out.println("Dog's age: " + dog.getAge());
        dog.setWeight(21.234);
        System.out.println("Dog's weight: "+ dog.getWeight()+"kg");

        Mychyk cat = new Mychyk();
        cat.setPet("Cat");
        System.out.println("What kind of animal: "+cat.getAge());
        cat.setName("Leo");
        System.out.println("Cat's name: " + cat.getName());
        cat.setAge(4);
        System.out.println("Cat's age: " +cat.getAge()+"age");
        cat.setColor("white");
        System.out.println("Cat's colors: " +cat.getColor());
        cat.setWeight(5);
        System.out.println("Cat's weight: "+cat.getWeight()+"kg");

        Popugay pop = new Popugay();
        pop.setBird("Parrot");
        System.out.println("What kind of bird: " +pop.getBird());
        pop.setName("Aleks");
        System.out.println("Parrot name's: " +pop.getName());
        pop.setColor("Blue");
        System.out.println("Parrot's color: " +pop.getColor());
        pop.setAge(15);
        System.out.println("Parrot's age: " +pop.getAge());
        pop.setWeight(1.1000);
        System.out.println("Parrot's weight: "+pop.getWeight()+"kg");

        Balyk fish = new Balyk();
        fish.setAqua("Fish");
        fish.setName("Wasabi");
        fish.setAge(2);
        fish.setKind("Blue tang");
        fish.setWeight(0.600);
        fish.setColor("Blue");

        System.out.println();

        System.out.println(fish.toString());
    
    }
}
