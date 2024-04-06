package BinarySearchTree.Repository;

import org.springframework.stereotype.Repository;
import BinarySearchTree.Entity.TreeStructure;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TreeStructureRepository extends JpaRepository<TreeStructure, Long> {
}
