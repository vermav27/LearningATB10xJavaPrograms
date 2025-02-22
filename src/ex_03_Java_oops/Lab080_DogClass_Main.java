package ex_03_Java_oops;

public class Lab080_DogClass_Main {
    public static void main(String[] args) {

        Lab079_DogClass dog1 = new Lab079_DogClass();
        Lab079_DogClass dog2 = new Lab079_DogClass();

        dog1.nameOfDog = "Kesar";
        dog1.breed = "GSD";
        dog1.expectedAge = 14;

        dog2.nameOfDog = "Sully";
        dog2.breed = "Labrador";
        dog2.expectedAge = 20;

        String dog1barking = dog1.bark();
        System.out.println(dog1barking);

        String dog2running = dog2.run();
        System.out.println(dog2running);

    }
}
