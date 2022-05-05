package activites;

public class Book
{
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    public Book(String title1, String author1, String publisher1, int booksSold)
    {
        title = title1;
        author = author1;
        publisher = publisher1;
        copiesSold = booksSold;
    }

    public void setTitle(String title1)
    {
        title = title1;
    }

    public void setAuthor(String author1)
    {
        author = author1;
    }

    public void setPublisher(String publisher1)
    {
        publisher = publisher1;
    }

    public void setCopiesSold(int booksSold)
    {
        copiesSold = booksSold;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public int getCopiesSold()
    {
        return copiesSold;
    }
}


