import java.util.ArrayList;

public class Album {
  private static ArrayList<Album> albums = new ArrayList<Album>();
  private String mTitle;
  private int mId;
  private String mArtist;

  public Album(String title) {
    mTitle = title;
    albums.add(this);
    mId = albums.size();
  }

  public String getTitle() {
    return mTitle;
  }

  public static ArrayList<Album> all() {
    return albums;
  }

  public int getId() {
    return mId;
  }

  public static Album find(int id) {
    try {
      return albums.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
  public static void clear() {
    albums.clear();
  }
  public void addArtist(String artist) {
    mArtist = artist;
  }
  public String getArtist() {
    return mArtist;
  }
}
