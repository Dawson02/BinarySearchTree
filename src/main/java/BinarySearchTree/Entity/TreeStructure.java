package BinarySearchTree.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TreeStructure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    private String treeJson;

    public TreeStructure(String treeJson) {
        this.treeJson = treeJson;
    }

    public long getId() {
        return id;
    }
}
