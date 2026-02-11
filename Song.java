public class Song
{
  private String title;
  private int rating;

  public Song(String t)
  {
    title = t;
    rating = 0;
  }

  public String getTitle()
  {
    return title;
  }

  public int getRating()
  {
    return rating;
  }

  public void setRating(int r)
  {
    rating = r;
  }

  public void adjustRating(int change)
  {
    rating += change;
  }

  public boolean equals(Song s)
  {
    return title.equals(s.title);
  }

  public String toString()
  {
    return "\"" + title + "\" rating: " + rating;
  }
}
