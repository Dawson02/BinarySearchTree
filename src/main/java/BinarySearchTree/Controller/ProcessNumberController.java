package BinarySearchTree.Controller;

import BinarySearchTree.Service.TreeConstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProcessNumberController {
    @Autowired
    private TreeConstructionService treeConstructionService;

    @PostMapping("/process-numbers")
    public String processNumbers(@RequestBody List<Integer> numbers) {
        return treeConstructionService.constructTreeJson(numbers);
    }
}
