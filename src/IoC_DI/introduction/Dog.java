package IoC_DI.introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
