package fr.lernejo.travelsite.inscription;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ControllerInscription {
    private final ArrayList<Inscription> inscriptions;

    public ControllerInscription() {
        inscriptions = new ArrayList<>();
    }

    public ControllerInscription(ArrayList<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    @PostMapping("/api/inscription")
    public void postInscription(@RequestBody Inscription inscription) {
        inscriptions.add(inscription);
    }

    @GetMapping("/api/inscription")
    public List<Inscription> getInscriptions() {
        return inscriptions;
    }
}
