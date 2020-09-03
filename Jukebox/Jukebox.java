package jukebox;

import java.util.ArrayList;

public class Jukebox 
{
    //Each song play is $1. Not accepting any bills larger than 20 or coins.
    private Bank bank = new Bank(); 
    private CDPlayer cdPlayer = new CDPlayer(); //CD player can hold 5 CDs
    /*Anybody that inserts money/chooses song shares the same number of credits.
    Any unused credit may be used by another person.
    1 credit = $1 = 1 song selection to be placed into queue
    */
    private int credit;
    private ArrayList<Song> songQueue = new ArrayList<Song>();
    
    public Jukebox()
    {
      
    }
    
    //When owner slides cd into cd slot and the jukebox's sensor senses it
    public void receiveCD(CD cd)
    {
        //If jukebox's cd collection is full, rejects as it pushes the cd back out of slot
        if(!cdPlayer.addCD(cd))
        {
            System.out.println("CD slots are full. Please remove a CD.");
            return;
        }
        
        System.out.println("CD accepted.");
    }
    
    //When owner presses eject button without selecting any cd's, it removes the last cd
    public void ejectCD()
    {
        //No cd's found
        if(!cdPlayer.ejectCD())
        {
            System.out.println("No CD's found.");
            return;
        }
        //Ejects last cd
        System.out.println("Last CD ejected.");
    }
    
    //When the owner is on a current cd in menu and they press the eject button
    public void ejectThisCD(int cdCollectionIndex)
    {
        //If any reason the touch screen displays a cd selected but no actual cd was found
        if(!cdPlayer.ejectCD(cdCollectionIndex))
        {
            System.out.println("CD not found.");
            return;
        }
        System.out.println("Selected CD has been ejected.");
    }
        
    /* When a customer places money bill into slot, the jukebox has a sensor that scans the bill for USD amount and legitimacy
    We are going to have integers represent USD bills: 1, 5, 10, 20. Any other integer will be deemed non-legit or too large of a bill
    */
    public void receiveBill(int bill)
    {
        if(!bank.addMoney(bill))
        {
            System.out.println("Unable to accept bill.");
            return;
        }
        
        this.credit += bill;
        System.out.println("Bill accepted.");
    }
    
    //When owner goes into settings, jukbox shows balance
    public void showBalance()
    {
        System.out.println("Balance: $" + bank.getBalance());
    }
    
    //Show credit to customers on screen
    public void showCredits()
    {
        System.out.println("Credits: " + this.credit);
    }
    
    //When customer chooses song from touch screen, it saves the cd index of cd collection and song index in that cd to then add the song into queue.
    public void selectSong(int cdIndex, int songIndex)
    {
        //If jukebox has no credits then cannot select song
        if(this.credit < 0)
        {
            System.out.println("Insufficient credit.");
            return;
        }
        
        //If customer has enough credit, then song is added to queue and credit decrements 1
        Song songSelected = cdPlayer.getSong(cdIndex, songIndex);
        songQueue.add(songSelected);
        this.credit -= 1;
        System.out.println("Song added: " + songSelected.getSongName());
    }
    
    public void playSongsInQueue()
    {
        Song songToPlay = songQueue.remove(0);
        System.out.println("Now playing: " + songToPlay.getSongName());
    }
}
