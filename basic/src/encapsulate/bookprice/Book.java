package encapsulate.bookprice;

public class Book {
    private final String publisher = "MyPublisher";
    private String isbn;
    private String name;
    private String author;
    private float weight;


    public String getPublisher() {
        return publisher;
    }
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

    private float calculateCost(){
        return this.weight * 1.2f;
    }

    private float calculateTax(){
        if(this.calculateCost() > 10){
            return 1.0f;

        }

        return 0.9f;
    }

    private float calculateProfit(){
        return (this.calculateCost() + this.calculateTax()) * 0.15f;
    }


    private float calculateDiscount() {
        if (author.equals("John")) return 2.0f;
        return 0f;
    }

    public float getSalePrice() {
        return calculateCost() + calculateTax() + calculateProfit() + calculateDiscount();
    }
    
}
