import java.sql.Timestamp;

public class Player
{
    private String name;
    private final int PLAYER_ID;
    private final Timestamp TIME_CREATED;
    
    private final static int iDMax = 99999999;
    private final static int iDMin = 10000000;
    
    public Player(String name) {
        this.name = name;
        PLAYER_ID = (int)(Math.random()*(iDMax-iDMin+1)+iDMin);
        TIME_CREATED = new Timestamp(System.currentTimeMillis());
    }    
    public void setName(String newname) {
        this.name = newname;
    }    
    public String getName() {
        return name;
    }    
    public int getPlayerID() {
        return PLAYER_ID;
    }
    public Timestamp getTimeCreated() {
        return TIME_CREATED;
    }
    
}