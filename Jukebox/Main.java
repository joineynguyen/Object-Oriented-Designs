package jukebox;

public class Main 
{
    public static void main(String[] args) 
    {
        //Physical CD #1
        CD cd1 = new CD("Artist1", "Album1");
        cd1.addSong(new Song("Song1-1", 120));
        cd1.addSong(new Song("Song1-2", 120));
        cd1.addSong(new Song("Song1-3", 120));
        cd1.addSong(new Song("Song1-4", 120));
        cd1.addSong(new Song("Song1-5", 120));
    
        //Physical CD #2
        CD cd2 = new CD("Artist2", "Album2");
        cd2.addSong(new Song("Song2-1", 120));
        cd2.addSong(new Song("Song2-2", 120));
        cd2.addSong(new Song("Song2-3", 120));
        cd2.addSong(new Song("Song2-4", 120));
        cd2.addSong(new Song("Song2-5", 120));
        
        //Physical CD #3
        CD cd3 = new CD("Artist3", "Album3");
        cd3.addSong(new Song("Song3-1", 120));
        cd3.addSong(new Song("Song3-2", 120));
        cd3.addSong(new Song("Song3-3", 120));
        cd3.addSong(new Song("Song3-4", 120));
        cd3.addSong(new Song("Song3-5", 120));
        
        //Physical CD #4
        CD cd4 = new CD("Artist4", "Album4");
        cd4.addSong(new Song("Song4-1", 120));
        cd4.addSong(new Song("Song4-2", 120));
        cd4.addSong(new Song("Song4-3", 120));
        cd4.addSong(new Song("Song4-4", 120));
        cd4.addSong(new Song("Song4-5", 120));
        
        //Physical CD #5
        CD cd5 = new CD("Artist5", "Album5");
        cd5.addSong(new Song("Song5-1", 120));
        cd5.addSong(new Song("Song5-2", 120));
        cd5.addSong(new Song("Song5-3", 120));
        cd5.addSong(new Song("Song5-4", 120));
        cd5.addSong(new Song("Song5-5", 120));
        
        //Creating jukebox and inserting in physical cd's
        Jukebox myJukebox = new Jukebox();
        myJukebox.receiveCD(cd1);
        myJukebox.receiveCD(cd2);
        myJukebox.receiveCD(cd3);
        myJukebox.receiveCD(cd4);
        myJukebox.receiveCD(cd5);
    }
    
}
