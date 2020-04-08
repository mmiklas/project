package pl.edu.wszib.jwd.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wszib.jwd.project.dao.SelectedColorDao;
import pl.edu.wszib.jwd.project.model.SelectedColor;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class RestDataController {

    @Autowired
    SelectedColorDao selectedColorDao;

    @GetMapping("/data")
    public List<SelectedColor> getData(Model model) {
        List<SelectedColor> selectedColors = (List)selectedColorDao.findAll();
        return selectedColors;
    }
}
