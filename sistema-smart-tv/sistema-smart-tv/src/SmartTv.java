public class SmartTv {
    
    boolean on = false;
    int channel = 1;
    int volume = 25;
        

    public void turnOn(){
        on=true;
    }
    
    public void turnOff(){
        on=false;
    }

    public void increaseVolume(){
        volume++;
        System.out.println("The volume was set to: "+volume);
    }

    public void decreaseVolume(){
        volume--;
    }
    }

