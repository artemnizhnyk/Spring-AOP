package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("My  beriem knigu iz UniLIbrary");
        System.out.println("-------------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("My vozvraschaem knigu v UniLibrary");
        return "Voina i mir";

    }

    public void getMagazine() {
        System.out.println("My beriem zurnal iz UniLIbrary");
        System.out.println("-------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("My vozvraschaem zurnal v UniLibrary");
        System.out.println("-------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("My  dobavlaem knigu v UniLIbrary");
        System.out.println("-------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("My  dobavlaem zurnal v UniLIbrary");
        System.out.println("-------------------------------------------");
    }

}
