package BinarySearchTree.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "input_numbers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InputNumbers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    private List<Integer> numbers;

    public InputNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Long getId() {
        return id;
    }
}
