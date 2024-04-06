package BinarySearchTree.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public class InputNumbersRepository {
    public interface InputNumbersRepository extends JpaRepository<InputNumbers, Long> {
}
