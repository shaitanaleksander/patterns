package observer;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {

    private final List<Receiver> receivers;

    public PostOffice() {
        this.receivers = new ArrayList<>();
    }

    public void registerClient(Receiver receiver) {
        receivers.add(receiver);
    }

    public void postNewspaper(String string) {
        System.out.println("new newspaper is out !!!");
        receivers.forEach( s -> s.receive(string));

    }
}
// TODO: 31.05.2023  future example need to be shown