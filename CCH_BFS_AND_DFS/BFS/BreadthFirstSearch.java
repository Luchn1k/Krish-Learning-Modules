
import Submitting.Graph.Graph;
import Submitting.Graph.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static String traverse(Node startNode, Graph graph){

        if(startNode==null)
            return "Graph Is Empty";
        StringBuilder returnString =null;
        Queue<Node> bfsQueue = new LinkedList<>();
        bfsQueue.add(startNode);
        while(!bfsQueue.isEmpty()){
            Node currentNode = bfsQueue.poll();
            if(!currentNode.isVisited()){
                currentNode.setVisited();
                if(returnString == null){
                    returnString = new StringBuilder("[").append(currentNode);
                }else {
                    returnString.append(", ").append(currentNode);
                }
                graph.getAdj().get(currentNode).forEach(n->{
                    if(!n.isVisited())
                        bfsQueue.add(n);
                });
            }
        }
        returnString.append("]");
    return returnString.toString();
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        graph.addEdge(a,b);
        graph.addEdge(a,c);
        graph.addEdge(b,d);
        graph.addEdge(c,e);
        graph.addEdge(c,g);
        graph.addEdge(e,f);
        graph.addEdge(f,g);

        System.out.println(graph.printGraph());
        System.out.println(traverse(a,graph));


    }

}
