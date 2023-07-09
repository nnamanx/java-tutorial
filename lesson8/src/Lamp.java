public class Lamp {
    boolean isOn;

    //Getting current
    void isOnRn(){
        if(this.isOn == true){
            System.out.println("Current state of lamp is on");
        } else System.out.println("Current state of lamp is off");
    }

    //Set state of lamp
    boolean setLamp(boolean isOn){
        this.isOn = isOn;
        return this.isOn;
    }
}
