package jukebox;
        
public class Song
{
    //Attributes to display customers when they pick song
    private String songName;
    private int duration; //in seconds
    
    Song(String songName, int duration)
    {
        this.songName = songName;
        this.duration = duration;
    }
    
    public String getSongName()
    {
        return this.songName;
    }
    
    public int getDuration()
    {
        return this.duration;
    }
}