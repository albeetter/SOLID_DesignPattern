public class TestProgram {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice Dela Cruz");

        // Instantiate different resource types
        LibraryResource designBook = new Book("Head First Design Patterns");
        LibraryResource scienceJournal = new Journal("Nature Magazine - April 2026");
        LibraryResource historyAudio = new AudioBook("The History of the World");

        // The student can borrow any resource type without modifying the Student class
        student.borrowResource(designBook);
        student.borrowResource(scienceJournal);
        
        // Demonstrating future flexibility
        student.borrowResource(historyAudio);
    }
}