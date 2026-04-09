public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // This method adheres to DIP by accepting the abstraction rather than concrete classes
    public void borrowResource(LibraryResource resource) {
        System.out.println(name + " is requesting to borrow a resource...");
        resource.borrow();
        System.out.println("Transaction complete.\n");
    }
}