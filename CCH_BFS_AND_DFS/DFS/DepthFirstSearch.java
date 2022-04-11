

import Submitting.Graph.Graph;
import Submitting.Graph.Node;

import java.util.Stack;

public class DepthFirstSearch {
    private static Stack<Node> nodeList;
public static String traverse(Node startNode, Graph graph){
    StringBuilder returnString =  null;
    nodeList = new Stack();
    nodeList.push(startNode);
    while(!nodeList.isEmpty()){
        startNode = nodeList.pop();
        if(!startNode.isVisited()){
            startNode.setVisited();
            if(returnString == null) {
                returnString = new StringBuilder(startNode.toString());
            }else{
                returnString.append(", ").append(startNode);
            }
            graph.getAdj().get(startNode).forEach(nodeList :: push);
        }
    }
    return returnString.toString();
}

    public static void main(String[] args) {
        Node zero = new Node("0");
        Node one = new Node("1");
        Node two = new Node("2");
        Node three = new Node("3");
        Node four = new Node("4");
        Node five = new Node("5");
        Node six = new Node("6");
        Node seven = new Node("7");
        Graph graph = new Graph();
        graph.addEdge(zero,three);
        graph.addEdge(three,five);
        graph.addEdge(five,six);
        graph.addEdge(six,two);
        graph.addEdge(two,one);
        graph.addEdge(three,seven);
        graph.addEdge(seven,four);

        System.out.println(graph.printGraph());
        System.out.println(traverse(zero,graph));



    }

}
