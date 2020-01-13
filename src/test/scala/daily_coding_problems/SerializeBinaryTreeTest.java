package daily_coding_problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerializeBinaryTreeTest {

    private SerializeBinaryTree serializeBinaryTree;

    @BeforeEach
    public void setup() {
        serializeBinaryTree = new SerializeBinaryTree();
    }

    @Test
    public void serialize_should_create_the_correct_string() {
        Node root = new Node(5, null, null);
        Node node1 = new Node(2, null, null);
        Node node2 = new Node(3, null, null);
        root.left = node1;
        root.right = node2;
        assertEquals("5 2 null null 3 null null ", serializeBinaryTree.serialise(root));
    }
}
