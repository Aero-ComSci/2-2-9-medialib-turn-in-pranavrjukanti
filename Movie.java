public class Movie
{
  private String title;
  private double length;
  private int rating;

  public Movie(String t, double l)
  {
    title = t;
    length = l;
    rating = 0;
  }

  public String getTitle()
  {
    return title;
  }

  public double getLength()
  {
    return length;
  }

  public int getRating()
  {
    return rating;
  }

  public void setRating(int r)
  {
    rating = r;
    if (rating < 0 || rating > 10)
      rating = 0;
  }

  public void adjustRating(int change)
  {
    rating += change;
    if (rating < 0 || rating > 10)
      rating = 0;
  }

  public boolean equals(Movie m)
  {
    return title.equals(m.title) && length == m.length && rating == m.rating;
  }

  public String toString()
  {
    return "\"" + title + "\" length: " + length + " rating: " + rating;
  }
}
