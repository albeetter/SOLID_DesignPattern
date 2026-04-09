public class AudioBook implements LibraryResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Sending digital access link for AudioBook: " + title);
    }
}