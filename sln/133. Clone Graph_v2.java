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
        Queue<UndirectedGraphNode> q = new LinkedList<>();
        q.add(node);
        UndirectedGraphNode graphCopy = new UndirectedGraphNode(node.label);
        map.put(node, graphCopy);
        while (!q.isEmpty()) {
            UndirectedGraphNode graph = q.poll();
            for (UndirectedGraphNode neighbor : graph.neighbors) {
                if (map.containsKey(neighbor)) {
                    map.get(graph).neighbors.add(map.get(neighbor));
                } else {
                    UndirectedGraphNode neighborCopy = 
                        new UndirectedGraphNode(neighbor.label);
                    map.get(graph).neighbors.add(neighborCopy);
                    map.put(neighbor, neighborCopy);
                    q.add(neighbor);
                }
            }
        }
        
        return graphCopy;
    }
}