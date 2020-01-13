package daily_coding_problems;

import java.util.Stack;

public class SerializeBinaryTree {
    public String serialise(Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(node);

        while (!nodeStack.empty()) {
            Node curr = nodeStack.pop();
            if (curr == null) {
                stringBuilder.append("null").append(" ");
                continue;
            }
            stringBuilder.append(curr.value).append(" ");
            nodeStack.push(curr.right);
            nodeStack.push(curr.left);
        }
        return stringBuilder.toString();
    }

    public Node deserialize(String deserializedNode) {

        return new Node(1, null, null);
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}