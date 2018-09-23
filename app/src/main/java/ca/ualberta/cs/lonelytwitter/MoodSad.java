package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class MoodSad extends Mood {
    private Date currdate;

    public MoodSad() {
        currdate = new Date();
    }

    public MoodSad(Date initdate) {
        currdate = initdate;
    }

    public void setDate(Date newdate) {
        currdate = newdate;
    }
    public Date getDate() {
        return currdate;
    }

    public String getMoodStr() {
        return "sad";
    }
}
