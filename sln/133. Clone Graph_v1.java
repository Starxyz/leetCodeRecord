/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
        if (node == null) return null;
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        return DFS(node, map);
    }
    
    private UndirectedGraphNode DFS(UndirectedGraphNode graph, 
                                   Map<UndirectedGraphNode, UndirectedGraphNode> map) {
        if (map.containsKey(graph)) {
            return map.get(graph);
        }
        
        UndirectedGraphNode graphCopy = new UndirectedGraphNode(graph.label);
        map.put(graph, graphCopy);
        for (UndirectedGraphNode neighbor : graph.neighbors) {
            graphCopy.neighbors.add(DFS(neighbor, map));
        }
        
        return graphCopy;
    }
}