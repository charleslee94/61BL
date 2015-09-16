import java.text.*;
import java.util.*;


public class Foothill
{
   public static void main(String[] args) throws Exception
   {
    iTunes Tunes1, Tunes2, Tunes3,Tunes4,Tunes5,Tunes6;
    Tunes1 = new iTunes();
    Tunes2 = new iTunes();
    Tunes3 = new iTunes();
    Tunes4 = new iTunes("All of Me","John Legend",100,1500);
   }
   
   static class iTunes
   {
    private String name, artist;
    private int bitRate, totalTime;
    
    static final int MIN_BITRATE = 64;
    static final int MAX_BITRATE = 705;
    static final int MIN_STR_LENGTH = 1;
    static final int MAX_STR_LENGTH = 80;
    static final int MIN_PLAY_TIME = 1000;
    static final int MAX_PLAY_TIME = 1000*60*60;
    static final int DEFAULT_BITRATE = 64;
    static final int DEFAULT_PLAY_TIME = 1000;
    static final String DEFAULT_STRING = " (undefined) ";
  
   public iTunes()
   {
    name = DEFAULT_STRING;
    artist = DEFAULT_STRING;
    bitRate = DEFAULT_BITRATE;
    totalTime = DEFAULT_PLAY_TIME;
   }
   
   public iTunes(String name,String artist, int bitRate, int totalTime )
   {
    if (!setName(name))
        this.name = name;
    if (!setArtist(artist))
        this.artist = artist;
    if (!setBitRate(bitRate))
        this.bitRate = bitRate;
    if (!setTotalTime(totalTime))
        this.totalTime = totalTime;
   }
   
   public boolean setName(String name)
   {
    if (name.length()< MIN_STR_LENGTH || name.length()>MAX_STR_LENGTH)
        return false;
        this.name = name;
        return true;
   }
   
   public boolean setArtist(String artist)
   {
    if (artist.length()< MIN_STR_LENGTH || 
            artist.length()>MAX_STR_LENGTH)
        return false;
        this.artist = artist;
        return true;
   }
   
   public boolean setBitRate(int bitRate)
   {
    if (bitRate<MIN_BITRATE || bitRate>MAX_BITRATE)
        return false;
    this.bitRate = bitRate;
    return true;
   }
   
   public boolean setTotalTime(int totalTime)
   {
    if (totalTime<MIN_PLAY_TIME || totalTime> MAX_PLAY_TIME)
        return false;
    this.totalTime = totalTime;
        return true;
   }
   
   public String getName()
   {
    return name;
   }
   
   public String getArtist()
   {
    return artist;
   }
   
   public int getBitRate()
   {
    return bitRate;
   }
   
   public int getTotalTime()
   {
    return totalTime;
   }
   
   public String toString()
   {
    
   }
   
   
}
}
