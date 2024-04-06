package BinarySearchTree.Service;

import org.springframework.beans.factory.annotation.Autowired;
import BinarySearchTree.Entity.InputNumbers;
import BinarySearchTree.Repository.InputNumbersRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

@Service
public class InputNumberService {
    @Autowired
    private InputNumbersRepository inputNumbersRepository;

    public void saveInputNumbers(InputNumbers inputNumbers) {
        inputNumbersRepository.save(inputNumbers);
    }

    public List<InputNumbers> getAllInputNumbers() {
        return inputNumbersRepository.findAll();
    }
}