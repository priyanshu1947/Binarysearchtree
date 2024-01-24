class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node,int _row,int _col){
        this.node=_node;
        this.col=_col;
        this.row=_row;
        
    }
    
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        List<List<Integer>> vertical=new ArrayList<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
           Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.col;
            int y=tuple.row;
            
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).add(node.val);
            if(node.left!=null){
                q.offer(new Tuple(node.left,y+1,x-1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,y+1,x+1));
            }
        }
    
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            vertical.add(new ArrayList<>());
             
            for(PriorityQueue<Integer> nodes:ys.values()){
                while(!nodes.isEmpty()){
                    vertical.get(vertical.size()-1).add(nodes.poll());
                }
            }
        }
        return vertical;
    }
}