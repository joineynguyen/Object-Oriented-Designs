package jukebox;

public class CDPlayer 
{
    //Jukebox's cd player can hold up to 5 CD's but can be changed under max num cds constant
    final int MAX_NUM_CDS = 5;
    private CD[] cdCollection = new CD[MAX_NUM_CDS];
    
    
    public CDPlayer()
    {
       
 
    }
    
    public boolean addCD(CD cd)
    {
       for(int i = 0; i < MAX_NUM_CDS; i++)
       {
           if(cdCollection[i] == null)
           {
               cdCollection[i] = cd;
               return true;
           }
       }
       return false;
    }
    
    //Eject CD by choice
    public boolean ejectCD(int cdCollectionIndex)
    {
        if(cdCollection[cdCollectionIndex] == null)
        {
            return false;
        }
        
        cdCollection[cdCollectionIndex] = null;
        return true;
    }
    
    //Ejects the last CD by default
    public boolean ejectCD()
    {
        for(int i = cdCollection.length - 1 ; i > 0; i--)
        {
            if(cdCollection[i] != null)
            {
                cdCollection[i] = null;
                return true;
            }
        }
        return false;
    }
    
    
    public Song getSong(int cdIndex, int songIndex)
    {
        return cdCollection[cdIndex].getSong(songIndex);
    }
    
   
}
