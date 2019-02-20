import java.io.IOException;


public class TIme {

    private int hour;
    private int minute;

    public TIme() {
        hour = 12;
        minute = 0;
    }


    public TIme(int h, int m) {
        if (h >= 1 && h <= 23) {
            hour = h;
        } else {
            hour = 0;
        }
        if (m >= 0 && m <= 59) {
            minute = m;
        } else {
            minute = 0;
        }
    }

    public String toString() {
        String s = "";
        if (hour < 10 && minute < 10) {
            s = "0" + hour + "0" + minute;
        } else if (hour < 10 && minute > 10) {
            s = "0" + hour + minute;
        } else if (hour > 10 && minute < 10) {
            s = hour + "0" + minute;
        } else if (hour == 0) {
            s = "0" + hour + minute;
        } else if (minute == 0) {
            s = hour + "0" + minute;
        }

        return s;

    }

    public String convert() {
        String c = "";
        if (hour > 12) {
            c = "0" + (24 - hour) + minute + "pm";
        } else {
            c = hour + minute + "am";
        }

        return c;
    }

    public void increment() {
        minute++;
        if (minute == 60) {
            hour++;
            minute = 0;
        } else if (hour == 24) {
            hour = 0;
        }
    }
}
