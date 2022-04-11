

public class Node {
    private String value;
    private boolean visited;
    public Node(String value){
        this.value = value;
    }
    public void setVisited(){visited = true;};
    public void setUnVisited(){visited = false;};
    public boolean isVisited(){
        return visited;
    }
    @Override
    public String toString() {
        return value;
    }
}
