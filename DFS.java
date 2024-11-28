import java.util.*;

public class DFS {
    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6, 7));
        graph.put(4, Collections.emptyList());
        graph.put(5, Collections.emptyList());
        graph.put(6, Collections.emptyList());
        graph.put(7, Collections.emptyList());

        int startNode = 1; // Starting node
        Set<Integer> visited = new HashSet<>();
        System.out.println("DFS Traversal:");
        dfs(graph, startNode, visited);
    }

    public static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.print(node + " ");

        // Visit neighbors
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            dfs(graph, neighbor, visited);
        }
    }
}
