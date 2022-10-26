public class Bar {


    public static void main(String[] args) throws TooColdTemperatureException, TooHotTemperatureException {
        Client client = new Client("Juan");
        int value = (int) Math.floor(Math.random()*10+1);
        CoffeCup coffeCup = new CoffeCup(value);
        try{
            client.drinkCoffe(coffeCup);
        }catch (TooColdTemperatureException e){
            throw new TooColdTemperatureException("Too cold");
        }catch (TooHotTemperatureException e){
            throw new TooColdTemperatureException("Too hot");
        }
    }

}
