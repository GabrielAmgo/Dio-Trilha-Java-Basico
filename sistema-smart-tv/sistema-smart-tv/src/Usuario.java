

public class Usuario {
        public static void main(String[] args) throws Exception{
            
            SmartTv smartTv = new SmartTv();

            smartTv.increaseVolume();
            smartTv.increaseVolume();


            smartTv.changeChannel(52);
            System.out.println(smartTv.channel);

            System.out.println("Actual volume: " + smartTv.volume);

            System.out.println("Is TV on?: " + smartTv.on);
            System.out.println("Actual channel?: " + smartTv.channel);
            System.out.println("Actual volume?: " + smartTv.volume);

            smartTv.turnOn();
            System.out.println("New Status -> Is TV on?: " + smartTv.on);

            smartTv.turnOff();
            System.out.println("New Status -> Is tv on?: " + smartTv.on);
        }

}
