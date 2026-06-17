/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> m1=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
        if(m1.containsKey(node)){
            return m1.get(node);
        }
        Node n1=new Node(node.val);
        m1.put(node,n1);
        for(Node k:node.neighbors){
            n1.neighbors.add(cloneGraph(k));
        }
        
        return n1;
    }
}