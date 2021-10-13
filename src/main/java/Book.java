import java.util.ArrayList;

public class Book {

    public String title;
    public int price;
    public int yearOfRelease;
    public ArrayList<Author> authors;
    public Genre genre;


    Book (String title, int price, int yearOfRelease, String authorList, Genre genre, ArrayList<Author> authors) {

        this.title=title;
        this.price=price;
        this.yearOfRelease=yearOfRelease;
        this.authors=authors;
        this.genre =genre;
    }

    public String getTitle () {
        return title;
    }

    public int getPrice () {
        return price;
    }

    public int getYearOfRelease () {
        return yearOfRelease;
    }



public Genre getGenre () {
        return genre;
}

    public ArrayList <Author>getAuthors () {
        return authors;
    }




}
