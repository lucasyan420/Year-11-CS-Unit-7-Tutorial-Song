import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;

    private ArrayList<String> listeners = new ArrayList<String>();

    public Song(){

    }

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int howMany(ArrayList<String> names){
        int newListeners = 0;
        for(String n: names){
            if(!listeners.contains(n.toLowerCase())){
                listeners.add(n.toLowerCase());
                newListeners ++;
            }
        }

        return newListeners;
    }
}
