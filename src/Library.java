public class Library  {

    public static void main(String[] args) {

        Book [] books = {
            new Book("Wiedźmin","Sapkowski","Znak", 1991),
            new Book("Wiedźmin","Sapkowski","Znak", 1991),
            new Book("Pan lodowego ogrodu", "Grzędowicz","Fabryka Słów", 2005),
        };

        Book book1 = books[0];
        Book book2 = books[2];



        System.out.println("Książka nr 1: " + book1);
        System.out.println("Książka nr 2: " + book2);

        if (book1.equals(book2)){
            System.out.println("To jest ta sama książka!");
        }else {
            System.out.println("To dwie różne książki");
        }


    }




}
