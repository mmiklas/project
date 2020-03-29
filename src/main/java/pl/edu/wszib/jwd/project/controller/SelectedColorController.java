package pl.edu.wszib.jwd.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectedColorController {

    @Value("${app.title.select}")
    private String title;

    @GetMapping("/select")
    public String selectColorPage(Model model) {

        String[][] colors = {
                {"red","blue","purple","teal"},
                {"black","orange", "yellow", "green"},
                {"gray","silver", "olive", "lime"},
                {"navy","lime", "aqua", "fuchsia"}
        };

        model.addAttribute("colors",colors);
        model.addAttribute("title",title);
        return "select";
    }
}
