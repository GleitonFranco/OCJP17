package tree;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeMain {

    public static void main(String[] args) {
        List<List<Integer>> indexes = new ArrayList<>();
        List<Integer> queries = new ArrayList<>();

//        indexes.add(List.of(3));
//        indexes.add(List.of(2, 3));
//        indexes.add(List.of(-1, -1));
//        indexes.add(List.of(-1, -1));
//        queries.add(2);
//        queries.add(1);
//        queries.add(1);

        // 1
//        indexes.add(List.of(5));
//        indexes.add(List.of(2, 3));
//        indexes.add(List.of(-1, 4));
//        indexes.add(List.of(-1, 5));
//        indexes.add(List.of(-1, -1));
//        indexes.add(List.of(-1, -1));
//        queries.add(1);
//        queries.add(2);

    indexes.add(List.of(17));
    indexes.add(List.of(2, 3));
    indexes.add(List.of(4 ,5));
    indexes.add(List.of(6, -1));
            indexes.add(List.of(-1, 7));
    indexes.add(List.of(8 ,9));
    indexes.add(List.of(10 ,11));
    indexes.add(List.of(12 ,13));
            indexes.add(List.of(-1, 14));
            indexes.add(List.of(-1, -1));
    indexes.add(List.of(15, -1));
    indexes.add(List.of(16, 17));
            indexes.add(List.of(-1, -1));
            indexes.add(List.of(-1 ,-1));
            indexes.add(List.of(-1, -1));
            indexes.add(List.of(-1, -1));
            indexes.add(List.of(-1, -1));
            indexes.add(List.of(-1, -1));
        queries.add(2);
                queries.add(2);
                queries.add(3);

        List<List<Integer>> ret = swapNodes(indexes, queries);
        System.out.println(ret);
    }

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
        final List<List<Integer>> performed = new ArrayList<>();
        final int total = indexes.get(0).get(0);
        final List<Node> todosNodes = mountTree(total);
        final Node root = todosNodes.get(1);
        marshallTree(indexes, total, todosNodes);
        List<List<Node>> linhas = new ArrayList<>();
        linhas.add(new ArrayList<>());
        final int totalSwap = queries.get(0);
        List<Node> result = new ArrayList<>();
        for (int i = 1; i <= totalSwap; i++) {
            result = new ArrayList<>();
            sweep2(root, 1, queries.get(i), result);
            performed.add(result.stream().map(n -> n.value).collect(Collectors.toList()));
        }
        return performed;
    }

    private static void marshallTree(List<List<Integer>> indexes, int total, List<Node> todosNodes) {
        Node left, right, umNode;
        for (int i = 1; i <= total; i++) {
            Integer indexLeft = indexes.get(i).get(0);
            if (indexLeft == -1) {
                left = new Node();
            } else {
                left = todosNodes.get(indexLeft);
            }
            Integer indexRight = indexes.get(i).get(1);
            if (indexRight == -1) {
                right = new Node();
            } else {
                right = todosNodes.get(indexRight);
            }
            umNode = todosNodes.get(i);
            umNode.left = left;
            umNode.right = right;
            left.parent = right.parent = umNode;
        }
    }

    private static List<Node> mountTree(int total) {
        final List<Node> todosNodes = new ArrayList<>();
        Node umNode;
        todosNodes.add(null);
        for (int i = 1; i <= total; i++) {
            umNode = new Node();
            umNode.value = i;
            umNode.i = i;
            todosNodes.add(umNode);
        }
        return todosNodes;
    }

    public static void sweep2(Node node, int level, final int k, List<Node> result) {
        if (node == null || (node.value == 1 && result.contains(node.left) && result.contains(node.right))) {
            return;
        }
        if (level == k && !result.contains(node.left)) {
            Node oneNode = node.left;
            node.left = node.right;
            node.right = oneNode;
        }
        if (node.left.value == -1 || result.contains(node.left)) {
            if (!result.contains(node)) result.add(node);
            if (node.right.value == -1 || result.contains(node.right)) {
                sweep2(node.parent, level -1, k, result);
            } else {
                sweep2(node.right, level +1, k, result);
            }
        } else {
            sweep2(node.left, level +1, k, result);
        }
    }

}

class Node {
    Node left;
    Node right;
    Node parent;
    int i;
    int value = -1;
}
