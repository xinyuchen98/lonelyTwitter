package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class MoodHappy extends Mood {
    private Date currdate;

    public MoodHappy() {
        currdate = new Date();
    }

    public MoodHappy(Date initdate) {
        currdate = initdate;
    }

    public void setDate(Date newdate) {
        currdate = newdate;
    }
    public Date getDate() {
        return currdate;
    }

    public String getMoodStr() {
        return "happy";
    }
}
