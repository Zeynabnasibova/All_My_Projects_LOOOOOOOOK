package oopyoutube.ex9Interface;

public class Main {
    public static void main(String[] args) {

        Button button = new Button(new ButtorClickHandler());
        button.click();
        button.click();

        Button tvButton  = new Button(new EventHandler() {
            private boolean on = false;
            @Override
            public void execute() {
                if(on){
                    System.out.println("Tv off");
                    on = false;
                }else{
                    System.out.println("Tv on");
                    on = true;
                }
            }
        });

tvButton.click();
tvButton.click();

    }
}

interface EventHandler {

    void execute();

}

class ButtorClickHandler implements EventHandler{

    public void execute(){
        System.out.println("button clicked");
    }
}

class Button {
    EventHandler handler;
    Button(EventHandler action) {

        this.handler = action;
    }
    public void click(){
        handler.execute();
    }

}