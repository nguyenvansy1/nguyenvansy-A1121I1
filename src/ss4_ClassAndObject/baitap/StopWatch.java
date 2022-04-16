package ss4_ClassAndObject.baitap;
import java.util.Date;
public class StopWatch {
    private  int  startTime;
    private  int  endTime;

    public StopWatch()
    {

    }
    public StopWatch(int startTime, int endTime)
    {
      this.startTime = startTime ;
      this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int start()
    {
        this.startTime = (int) new Date().getTime();
        return this.startTime;
    }
    public  int stop()
    {
        this.endTime = (int) new Date().getTime();
        return this.endTime;
    }

    public int getElapsedTime()
    {
        return  this.endTime - this.startTime;
    }


}
