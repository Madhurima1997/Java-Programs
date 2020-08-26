class Solution {
    int max;
    HashMap<Integer,Integer>h;
    public int widthOfBinaryTree(TreeNode root) {
        max=0;
        h=new HashMap<>();
        getwidth(root,0,0);
        return max;
    }
    public void getwidth(TreeNode root,int dep,int pos){
        //if tree is empty
        if(root==null)
            return;
        h.computeIfAbsent(dep,k->pos);//storing only the leftmost node
        //System.out.println("depth="+dep+"pos="+pos+"Maxwidth="+max+"getdepth="+h.get(dep));
        //calclating the height
        max=Math.max(max,pos-h.get(dep)+1);
        //traversing through the tree
        getwidth(root.left,dep+1,pos*2);
        getwidth(root.right,dep+1,pos*2+1);
    }
}
