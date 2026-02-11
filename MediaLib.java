public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  private static int numEntries = 0;

  public static String owner = "Pranav Jukanti";

  public static int getNumBooks()
  {
    return numBooks;
  }

  public static int getNumMovies()
  {
    return numMovies;
  }

  public static int getNumSongs()
  {
    return numSongs;
  }

  public static int getNumEntries()
  {
    return numEntries;
  }

  public static String getOwner()
  {
    return owner;
  }

  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      numBooks++;
      numEntries++;
    }
  }

  public void addMovie(Movie m)
  {
    if (movie == null)
    {
      movie = m;
      numMovies++;
      numEntries++;
    }
  }

  public void addSong(Song s)
  {
    if (song == null)
    {
      song = s;
      numSongs++;
      numEntries++;
    }
  }

  public String toString()
  {
    String info = "";

    if (book != null)
      info += "Book: " + book + "\n";

    if (movie != null)
      info += "Movie: " + movie + "\n";

    if (song != null)
      info += "Song: " + song + "\n";

    return info;
  }
}
