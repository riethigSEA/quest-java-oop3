public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int meters){this.altitude = meters;}
    public void setFlying(boolean flightStatus){ this.flying = flightStatus;}
    public boolean isFlying() {
        return flying;
    }

    public void takeOff(){System.out.println(this.getName() + " is taking off!");}
    public void land(){System.out.println(this.getName() + " is landing!");

        this.setAltitude(0);
        this.currentheight();
        this.setFlying(false);}
    public void currentheight(){System.out.println("current height "+ this.getAltitude());}
    public int ascend(int meters){
        if(!isFlying()) {
            this.setAltitude(this.getAltitude() + meters);

        }
        this.currentheight();
        return this.altitude;
    }
    public int descend(int meters){
        if(!isFlying() && this.getAltitude() != 0){

            this.altitude = this.getAltitude() - meters;

        }
        else{
            System.out.println("cannot descent any further. Cause we are already at the bottom!");

        }
        this.currentheight();
        return this.altitude;

    }


    @Override
    public String sing() {
        return "Screech!";
    }
}
