/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */


public class Solution {
    Map<Integer,UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
       map = new HashMap<>(); 
       Clone(node);
       return node==null?null:map.get(node.label); 
    }
    /*
    dfs iterative
    */
    /*
    public void Clone(UndirectedGraphNode node){
        if(node== null){
            return;
        }
        Deque<UndirectedGraphNode> stack = new LinkedList<>();
        stack.push(node);
        while(!stack.isEmpty()){
            UndirectedGraphNode current = stack.pop();
            if(!map.containsKey(current.label)){
                map.put(current.label,new UndirectedGraphNode(current.label));
            }
            UndirectedGraphNode clone = map.get(current.label);
            for(UndirectedGraphNode neighbor:current.neighbors){
                if(!map.containsKey(neighbor.label)){
                    map.put(neighbor.label,new UndirectedGraphNode(neighbor.label));
                    stack.pop(neighbor);
                }
                clone.neighbors.add(map.get(neighbor.label));
                
            }
        }
        
    }*/
    /*
    bfs
    *//*
    public void Clone(UndirectedGraphNode node){
        if(node== null){
            return;
        }
        Deque<UndirectedGraphNode> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            UndirectedGraphNode current = queue.poll();
            if(!map.containsKey(current.label)){
                map.put(current.label,new UndirectedGraphNode(current.label));
            }
            UndirectedGraphNode clone = map.get(current.label);
            for(UndirectedGraphNode neighbor:current.neighbors){
                if(!map.containsKey(neighbor.label)){
                    map.put(neighbor.label,new UndirectedGraphNode(neighbor.label));
                    queue.offer(neighbor);
                }
                clone.neighbors.add(map.get(neighbor.label));
                
            }
        }
        
    }*/
    /*
    dfs recursive
    */
    public void Clone(UndirectedGraphNode node){
        if(node== null){
            return;
        }
            
        if(!map.containsKey(node.label)){
            map.put(node.label,new UndirectedGraphNode(node.label));
        }
        UndirectedGraphNode clone = map.get(node.label);
        for(UndirectedGraphNode neighbor:node.neighbors){
            if(!map.containsKey(neighbor.label)){
                    map.put(neighbor.label,new UndirectedGraphNode(neighbor.label));
                    Clone(neighbor);
                }
                clone.neighbors.add(map.get(neighbor.label));
                
            }
        }
        
    }
