
public class Note
{
    private String note;
    private static int noteCouter = 0;
    
    public Note(String note) {
        this.note = note;
        noteCouter++;
    }
    
    public String getNote() {
        return this.note;
    }
    
    public int getNoteCount() {
        return noteCouter;
    }
    
}
