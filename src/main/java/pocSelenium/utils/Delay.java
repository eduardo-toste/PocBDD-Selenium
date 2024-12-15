package pocSelenium.utils;

public class Delay {

    public void delay(long milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
