package CloneGraph133;

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    Map<Integer,UndirectedGraphNode> nodes = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node==null){
            return null;
        }
        if(!nodes.containsKey(node.label)){
            nodes.put(node.label,
                    new UndirectedGraphNode(node.label));
        }
        else{
            return nodes.get(node.label);
        }
        for(UndirectedGraphNode neighbor:node.neighbors){
            UndirectedGraphNode neighborNode =
                    cloneGraph(neighbor);
            nodes.get(node.label).
                    neighbors.
                    add(cloneGraph(neighbor));

        }
        return nodes.get(node.label);

    }
}
