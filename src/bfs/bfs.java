package bfs;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class bfs {
    static class Node{
        int label;
        LinkedList<Node> neighbours;
    }

    public static void main(String [] arg0){
        Node head = new Node();
        head.label = 0;
        head.neighbours = new LinkedList<>();
        Node node1 = new Node();
        node1.label = 1;
        node1.neighbours = new LinkedList<>();
        Node node2 = new Node();
        node2.label = 2;
        node2.neighbours = new LinkedList<>();
        Node node3 = new Node();
        node3.label = 3;
        node3.neighbours = new LinkedList<>();
        Node node4 = new Node();
        node4.label = 4;
        node4.neighbours = new LinkedList<>();
        Node node5 = new Node();
        node5.label = 5;
        node5.neighbours = new LinkedList<>();

        head.neighbours.add(node1);node1.neighbours.add(head);
        head.neighbours.add(node2);node2.neighbours.add(head);
        node1.neighbours.add(node3);node3.neighbours.add(node1);
        node1.neighbours.add(node4);node4.neighbours.add(node1);
        node4.neighbours.add(node5);node5.neighbours.add(node4);

        /*
             0
            / \
            1 2
           / \
           3 4
              \
              5
         */
        bfs(head);
        boolean [] visited = new boolean[6];
        dfs(head, visited);


    }

    public static void bfs(Node head){

        List<Boolean> visited = new ArrayList<>();


        Deque<Node> queue = new ArrayDeque<>();


        visited.add(head.label, true);
        queue.offer(head);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.label);

            for(Node neighbour:node.neighbours){
                if(neighbour.label >=visited.size()){
                    visited.add(neighbour.label,false);
                }
                    if(!visited.get(neighbour.label)){
                        visited.add(neighbour.label, true)  ;
                        queue.offer(neighbour);
                }
            }
        }
        System.out.println("-----------");

    }

    public static void dfs(Node head, boolean []visited){
        if(visited[head.label]){return;}
        visited[head.label] = true;
        System.out.println(head.label);

        for(Node neightbour:head.neighbours){
            if(!visited[neightbour.label]){

                dfs(neightbour,visited);
            }
        }
    }
}
