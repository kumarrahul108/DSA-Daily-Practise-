
class Railway 
{
    private int seat;
    private String train;

    // seat 
    public void setSeat(int seat)
    {
        this.seat = seat;
    } 

    public int getSeat()
    {
        return seat;
    }

    // train name
    public void setTrain(String train)
    {
        this.train = train;
    } 

    public String getTrain()
    {
        return train;
    }

}


public class P8_getter 
{
    public static void main(String[] args) 
    {
        Railway r = new Railway();
        r.setSeat(56);
        r.setTrain("Vikramshila Express"); 

        System.out.println("Train Name : " + r.getTrain());
        System.out.println("Seat No. : " +r.getSeat());
    }    
}
