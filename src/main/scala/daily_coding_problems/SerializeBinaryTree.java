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
        String serializedTree = stringBuilder.toString();
        return serializedTree.substring(0, serializedTree.length() - 1);
    }

    public Node deserialize(String deserializedNode) {
        String[] arrayOfNodes = deserializedNode.split(" ");
        Stack<Node> nodeStack = new Stack<>();

        Node curr = new Node(arrayOfNodes[0], null, null);
        int count = 0;
        boolean rightSide = false;

        for (String nodeValue : arrayOfNodes) {

            if (count == 0) {
                count++;
                continue;
            }

            if (nodeValue.equals("null") && !rightSide) {
                rightSide = true;
            } else if (nodeValue.equals("null") && rightSide) {
                curr = nodeStack.pop();
            } else if (!rightSide) {
                Node created = new Node(nodeValue, null, null);
                curr.left = created;
                nodeStack.push(curr);
                curr = created;
            } else {
                Node created = new Node(nodeValue, null, null);
                curr.right = created;
                nodeStack.push(curr);
                curr = created;
                rightSide = false;
            }
        }
        while (!nodeStack.empty())curr = nodeStack.pop();
        return curr;
    }
}

class Node {
    String value;
    Node left;
    Node right;

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}