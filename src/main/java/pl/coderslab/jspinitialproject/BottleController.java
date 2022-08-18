package pl.coderslab.jspinitialproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import pl.coderslab.jspinitialproject.entities.Bottle;
import pl.coderslab.jspinitialproject.repositories.BottleRepository;

import java.awt.print.Book;

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

    @GetMapping("/add")
    public String addBottleView(Model model) {
        model.addAttribute("bottle", new Bottle());
        return "addbottle";
    }

    @PostMapping("/add")
    public RedirectView addBottle(@ModelAttribute("bottle") Bottle bottle, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/bottle/add", true);
        Bottle savedBottle = bottleRepository.save(bottle);
        redirectAttributes.addFlashAttribute("savedBottle", savedBottle);
        redirectAttributes.addFlashAttribute("addBottleSuccess", true);
        return redirectView;
    }
}
