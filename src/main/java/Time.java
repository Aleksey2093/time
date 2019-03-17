public class Time {

    private long time;

    public Time() {
        time = 0;
    }

    public Time(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void addMilliseconds(long value) {
        this.time += value;
    }

    public void addSeconds(long value) {
        addMilliseconds(value * 1000);
    }

    public void addMinutes(long value) {
        addSeconds(value * 60);
    }

    public void addHours(long value) {
        addMinutes(value * 60);
    }

    public void addDays(long value) {
        addHours(value * 24);
    }

    public void addWeeks(long value) {
        addDays(value * 7);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Time) {
            return time == ((Time) obj).time;
        }
        return false;
    }

    public long getMilliseconds() {
        return time;
    }

    public long getSeconds() {
        return getMilliseconds() / 1000;
    }

    public long getMinutes() {
        return getSeconds() / 60;
    }

    public long getHours() {
        return getMinutes() / 60;
    }

    public long getDays() {
        return getHours() / 24;
    }

    public long getWeeks() {
        return getDays() / 7;
    }

    @Override
    public String toString() {
        long millis = time % 1000;
        long second = getSeconds() % 60;
        long minute = getMinutes() % 60;
        long hour = getHours() % 24;

        return String.format("%02d:%02d:%02d.%d", hour, minute, second, millis);
    }
}
