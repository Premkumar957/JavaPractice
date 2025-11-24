//Polymorphism

//Method Overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cow extends Animal {
    
    void sound() {
        System.out.println("Cow moos");
    }
}

class Cat extends Animal {
    
    void sound() {
        System.out.println("Cat meows");
    }
}


//Method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String b, String a) {
        return a + b;
    }
}

