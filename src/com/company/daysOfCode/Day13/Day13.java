package com.company.daysOfCode.Day13;

import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }

    abstract static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook extends Book {
        MyBook(String title, String author) {
            super(title, author);
        }

        int price = 0;

        public MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        @Override
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
}
