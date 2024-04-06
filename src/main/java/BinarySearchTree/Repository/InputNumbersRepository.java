package BinarySearchTree.Repository;

import org.springframework.stereotype.Repository;
import BinarySearchTree.Entity.InputNumbers;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface InputNumbersRepository extends JpaRepository<InputNumbers, Long> {
}
