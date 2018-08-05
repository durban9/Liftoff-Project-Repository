package FrameInventory.controllers;

import FrameInventory.data.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping(path="menu")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping(path="")
    public String main(Model model){
        HashMap<String, String> associateChoices = new HashMap<>();
        associateChoices.put("search", "Search");
        associateChoices.put("list", "List");


        model.addAttribute("title", "Hello, VisionWorks Associate! How would you like to search the inventory?");
        model.addAttribute("actions", associateChoices);

        return "index";

    }


}
