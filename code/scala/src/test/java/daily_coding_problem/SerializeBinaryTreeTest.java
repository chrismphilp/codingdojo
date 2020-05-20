package daily_coding_problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializeBinaryTreeTest {

    private SerializeBinaryTree serializeBinaryTree;

    @Before
    public void setup() {
        serializeBinaryTree = new SerializeBinaryTree();
    }

    @Test
    public void serialize_should_create_the_correct_string_for_balanced_tree() {
        Node root = new Node("5", null, null);
        Node node1 = new Node("2", null, null);
        Node node2 = new Node("3", null, null);
        root.left = node1;
        root.right = node2;
        assertEquals("5 2 null null 3 null null", serializeBinaryTree.serialise(root));
    }

    @Test
    public void serialize_should_create_the_correct_string_for_unbalanced_tree() {
        Node root = new Node("5", null, null);
        Node node1 = new Node("2", null, null);
        Node node2 = new Node("1", null, null);
        node1.left = new Node("3", null, null);
        node2.right = new Node("4", null, null);
        root.right = node2;
        root.left = node1;
        assertEquals("5 2 3 null null null 1 null 4 null null", serializeBinaryTree.serialise(root));
    }

    @Test
    public void deserialize_should_correctly_create_balanced_tree() {
        Node root = serializeBinaryTree.deserialize("5 2 null null 3 null null");
        assertEquals("2", root.left.value);
        assertEquals("3", root.right.value);
    }

    @Test
    public void deserialize_should_correctly_create_unbalanced_tree() {
        Node root = serializeBinaryTree.deserialize("5 2 3 null null null 1 null 4 null null");
        assertEquals("2", root.left.value);
        assertEquals("3", root.left.left.value);
    }
}
