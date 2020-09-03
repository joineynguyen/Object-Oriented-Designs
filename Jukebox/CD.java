 
package jukebox;

import java.util.ArrayList;

public class CD 
{   
    //Attributes to show in menu while customers are picking songs. 
    private String artistName;
    private String albumName; //Also works as album title 
    private ArrayList<Song> songs = new ArrayList<Song>();
    
    /*
    Tracks will be stored as string for printing purposes instead of actual audio datatypes, since this is only a object oriented design project
    
    */
    
    public CD(String artist, String albumName)
    {
        this.artistName = artist;
        this.albumName = albumName;
       
    }
    
    public String getArtistName()
    {
        return this.artistName;
    }
    
    public String getAlbumName()
    {
        return this.albumName;
    }
    
    public void addSong(Song song)
    {
        songs.add(song);
    }
    
    public Song getSong(int songIndex)
    {
        return songs.get(songIndex);
    }
    
    
    
    
    public void printTracklist()
    {
        int counter = 1;
        
        System.out.println("Tracklist:");
        
        for(Song song : songs)
        {
            System.out.println(counter + ") " + song.getSongName());
        }
        
    }
    
    
    
}
