package observer;

public class Main {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        Human annet = new Human();
        Human sveta = new Human();

        Robot arnold = new Robot();

        postOffice.registerClient(annet);
        postOffice.registerClient(sveta);
        postOffice.registerClient(arnold);



        postOffice.postNewspaper("hello from marc ");
    }
}
