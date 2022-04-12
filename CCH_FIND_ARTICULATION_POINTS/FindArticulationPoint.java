
import Graph.Graph;
import Graph.Node;

import java.util.*;

public class FindArticulationPoint {
    private static int time;
   public static   Set<Node> findAP(Graph graph,Node startingNode){
       Set<Node> visited= new HashSet<>();
       Set<Node> aps = new HashSet<>();
       Map<Node,Integer> visitedTime = new HashMap<>();
       Map<Node,Integer> low = new HashMap<>();
       Map<Node,Node>  parent = new HashMap<>();
       dfsTraversal(visited,aps,startingNode,visitedTime,low,parent,graph);
       return  aps;

   }
   private static  void dfsTraversal(Set<Node> visited,Set<Node> aps,Node node,Map<Node,Integer> visitedTime, Map<Node,Integer> low, Map<Node,Node>  parent,Graph graph){
       visited.add(node);
       visitedTime.put(node,time);
       low.put(node,time);
       time++;
       int childCount = 0;
       boolean isAp = false;
       for(Node n: graph.getAdj().get(node)){
           if(n == parent.get(node)){
               continue;
           }
           if(!visited.contains(n)){
               parent.put(n,node);
               childCount++;
               dfsTraversal(visited,aps,n,visitedTime,low,parent,graph);
               if(visitedTime.get(node) <= low.get(n)){
                   isAp = true;
               }else{
                   low.compute(node,(current,time)->
                       Math.min(time,low.get(n))
                   );
               }
           }else{
               low.compute(node,(current,time)->Math.min(time,visitedTime.get(n)));
           }
       }
       // parent can not be a AP because the rule does not apply to that so the parent is removed and the equation is
       //lowest of child is larger than or equal to depth op parent
        if((parent.get(node) == null && childCount >= 2)|| parent.get(node) != null && isAp){
            aps.add(node);
        }

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
        Node h = new Node("H");
        Node i = new Node("I");
        graph.addEdge(a,d);
        graph.addEdge(a,b);
        graph.addEdge(b,c);
        graph.addEdge(d,c);
        graph.addEdge(c,e);
        graph.addEdge(e,f);
        graph.addEdge(c,f);
        graph.addEdge(f,g);
        graph.addEdge(f,g);
        graph.addEdge(g,h);
        graph.addEdge(g,i);
        System.out.println(graph.printGraph());
        System.out.println("----------------");
        Set<Node> ap = findAP(graph, a);
        System.out.println(ap);




    }

}
