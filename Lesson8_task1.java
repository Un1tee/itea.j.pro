package Lesson8_tasks;

public class Lesson8_task1 {
    public class Book {
        private String title;
        private String author;
        private String publisher;
        private double price;

        public Book(String title, String author, String publisher, double price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            if(price > 10) {
                this.price = price;
            } else {
                this.price = 10;
                System.out.println("Ціна повинна бути більшою за 10. Значення було примусово встановлено як 10.");
            }
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getPublisher() {
            return publisher;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if(price > 10) {
                this.price = price;
            } else {
                this.price = 10;
                System.out.println("Ціна повинна бути більшою за 10. Значення було примусово встановлено як 10.");
            }
        }

        public void printInfo() {
            System.out.println("Назва книги: " + title);
            System.out.println("Автор: " + author);
            System.out.println("Видавець: " + publisher);
            System.out.println("Ціна: " + price + " грн");
        }

    }

    public void main(String[] args) {
        Book book = new Book("Пітер Пен", "Джеймс Беррі", "Фоліо", 15.99);
        book.printInfo();

        book.setPrice(7);
        book.printInfo();
    }
}
