package pl.coderslab.jspinitialproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.jspinitialproject.repositories.BottleRepository;

@Controller
@RequestMapping("/bottle")
public class BottleController {

    private final BottleRepository bottleRepository;

    public BottleController(BottleRepository bottleRepository) {
        this.bottleRepository = bottleRepository;
    }

    @GetMapping("/all")
    public String viewBottles(Model model){
        model.addAttribute("bottles", bottleRepository.findAll());
        return "bottles";
    }
}
