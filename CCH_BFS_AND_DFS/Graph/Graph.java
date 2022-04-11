package Submitting.Graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private HashMap<Node, LinkedList<Node>> adj;
    public Graph(){
        adj = new HashMap<>();
    }
    public void addEdge(Node parent,Node child){
            if(!adj.keySet().contains(parent)){
                adj.put(parent,null);
            }if(!adj.keySet().contains(child)){
                adj.put(child,null);
        }
            //because this graph is undirected we need to add the edges to both ways so that is why i add helper class
            helper(parent,child);
            helper(child,parent);

    }
    private void helper(Node n1,Node n2){
        LinkedList<Node> temp = adj.get(n1);
        if(temp == null) {
            temp = new LinkedList<>();
        }else{
            temp.remove(n2);
        }
        temp.add(n2);
        adj.put(n1,temp);
    }
    public String printGraph(){
        StringBuilder returnString= new StringBuilder();
        adj.keySet().forEach(n ->{
            returnString.append(n).append(">>>>");
            adj.get(n).forEach(children->{
                returnString.append(children+", ");
            });
            returnString.append("\n");
        });
        return returnString.toString();
    }

    public HashMap<Node, LinkedList<Node>> getAdj() {
        return adj;
    }
}
