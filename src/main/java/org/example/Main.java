package org.example;

public class Main {
    public static void main(String[] args) {

        Book mobyDick = new Book("Moby Dick", "Herman Melville", "9780763630188");
        Book hardLand = new Book("Hard Land", "Benedict Wells", "9783257694369");
        Book lolita = new Book("Lolita", "Vladimir Nabokov", "9780140108088");

        Book[] books = {mobyDick, hardLand, lolita};

        Library myBookshelf = new Library(books);

        System.out.println(myBookshelf);
    }
}