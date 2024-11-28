public class Child extends Parent {
    public void displayCount() {
        // Accessing the protected variable from the subclass
        System.out.println("Count using 'this.count': " + this.count);
        System.out.println("Count using 'count': " + count);
        System.out.println("Count using 'count': " + super.count);
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Count using 'child-count': " +child.count);
        child.displayCount(); // This will access the inherited protected variable
    }
}