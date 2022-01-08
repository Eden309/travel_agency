package fr.lernejo.travelsite.travels;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class ControllerTravels {
    private final ArrayList<Travels> travels;

    public ControllerTravels() {
        travels = new ArrayList<>();
    }

    public ControllerTravels(ArrayList<Travels> travels) {
        this.travels = travels;
    }

    @GetMapping("/api/travels")
        public Iterable<Travels> getTravels(@RequestParam String userName) {
            travels.add(new Travels("Carribean", 32));
            travels.add(new Travels("Australia",35));
            return travels;
        }
}

