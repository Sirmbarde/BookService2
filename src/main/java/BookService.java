import java.util.ArrayList;

public class BookService {

    public ArrayList<Author> authors;
    private ArrayList<Book> bookslist=new ArrayList<>();

    public BookService() {
        this.authors = new ArrayList<>();
        this.bookslist = new ArrayList<>();

    }

    //list of authors

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    //list of books

    public ArrayList<Book> getBooks() {
        return bookslist;
    }

    //add book to the list

    public void addBook(Book book) {
        this.bookslist.add(book);
    }


    // remove book from the list

    public void removeBook(Book book) {
        this.bookslist.remove(book);
    }


    // verifying if a book is on the list
    public Book findBookByName(String bookTitle) {
        for (Book book : bookslist) {
            if (bookTitle.equalsIgnoreCase(book.getTitle())) {
                return book;
            }
        }
        return null;
    }

// returning a list of books by Fantasy. First two rows are needed in order to return list of books

    public ArrayList<Book>listByTypeFantasy () {
        ArrayList<Book>booksByFantasy=new ArrayList<>();

        for (Book book:bookslist) {
            if (book.getGenre().equals(Genre.FANTASY)) {
                booksByFantasy.add(book);
            }
        }
        return listByTypeFantasy();
    }


    public Author findBookByAuthor(String authorName) {
        for (Author author : authors) {
            if (authorName.equalsIgnoreCase(author.getName())) {
                return author;
            }
        }
        return null;
    }

    // returning a list of books released before 1999

       public ArrayList<Book>listOfBooksBefore1999() {
           ArrayList<Book>booksByFantasy=new ArrayList<>();
        for (Book book : bookslist) {
            if (book.getYearOfRelease()<1999) {
                return book;
            }
        }
        return null;
    }

    //returning list of books written by provided author

    //method that returns an arraylist of books (first line of code)
    public ArrayList<Book> listOfBooksByAuthor (Author providedAuthor) {
        ArrayList<Book> authorBooks=new ArrayList<>();

        for (Book book:bookslist) {
            for (Author authorItr: book.getAuthors()) {

                if (providedAuthor.equals(authorItr)) {
                    authorBooks.add (book);
                }
            }
            return authorBooks;
        }
    }

    //returning the most expensive book

       public Book mostExpensiveBook () {

           //create variable that stores that most expensive and set the initial value to the first book in the array

           Book mostExpensive = booklist.get(0);

           for (Book book : booklist) {
               if (book.getPrice() > mostExpensive.getPrice()) {
                   mostExpensive = book;
               }
               return mostExpensive;
           }
       }


    //returning cheapest book

    public Book cheapestBook () {

        Book mostCheapest= booklist.get (0);
        for (Book book:bookslist) {
            if (book.getPrice()<mostCheapest.getPrice()) {
                mostCheapest=book;
            }
        }
        return mostCheapest;
    }

    //returning book written ny 3 authors

    public Book bookByThreeAuthors () {

        for (Book book:bookslist) {

            //size is the size of array list

            if (book.getAuthors().size ()==3) {
                return book;
            }
        }
        return null;
    }

    //verifying a book is on the list

    public Boolean verifyBook (Book book) {

        // booklist.contains() is a method in the arratList that returns true if the item is present in the arraylist
        return booklist.contains (book);
    }
}


