package encapsulate.book;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private final String publisheer = "MyPublisheer";
    private float weight;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisheer() {
        return publisheer;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        if (weight < 0) {
            
            this.weight = 0;
            System.out.println("Error: Weight can not be negative");
        }
        this.weight = weight;
    }

    
}
