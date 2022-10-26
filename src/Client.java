public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drinkCoffe(CoffeCup coffeCup) throws TooHotTemperatureException, TooColdTemperatureException {
        System.out.println("Client " + getName() + " start to drink... ");
        if(coffeCup.getTemperature()>80){
            throw new TooHotTemperatureException("Client burned");
        } else if(coffeCup.getTemperature()<20){
            throw new TooColdTemperatureException("Customer has left the coffee because it was too cold");
        } else{
            System.out.println("Customer is satisfied with his coffee");
        }

    }


}
