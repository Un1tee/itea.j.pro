package Lesson9_tasks;

import java.util.*;

public class Catalog {
    private Map<String, Book> books;

    public Catalog() {
        books = new HashMap<>();
    }

    public void addBook(String title, String author) {
        books.put(title, new Book(title, author));
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public class Book {
        private String title;
        private String author;
        private List<BookHistory> history;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            history = new ArrayList<>();
        }

        public void addHistory(String readerName, Date startDate, Date endDate) {
            history.add(new BookHistory(readerName, startDate, endDate));
        }

        public List<BookHistory> getHistory() {
            return history;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    public class BookHistory {
        private String readerName;
        private Date startDate;
        private Date endDate;

        public BookHistory(String readerName, Date startDate, Date endDate) {
            this.readerName = readerName;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public String getReaderName() {
            return readerName;
        }

        public Date getStartDate() {
            return startDate;
        }

        public Date getEndDate() {
            return endDate;
        }
    }
}
