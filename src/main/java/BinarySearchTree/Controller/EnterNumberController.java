package BinarySearchTree.Controller;

import BinarySearchTree.Entity.InputNumbers;
import BinarySearchTree.Service.InputNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EnterNumberController {
    @Autowired
    private InputNumberService inputNumbersService;

    @PostMapping("/enter-numbers")
    public void enterNumbers(@RequestBody List<Integer> numbers) {
        InputNumbers inputNumbers = new InputNumbers(numbers);
        inputNumbersService.saveInputNumbers(inputNumbers);
    }

    @GetMapping("/previous-trees")
    public List<InputNumbers> getPreviousTrees() {
        return inputNumbersService.getAllInputNumbers();
    }
}
