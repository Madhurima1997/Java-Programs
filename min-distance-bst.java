List<Integer> l;
    public void inorder(TreeNode root){
        
        if(root==null)
            return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        int min=Integer.MAX_VALUE;
        l=new ArrayList<>();
        inorder(root);
        int i=0;
        for(i=0;i<l.size()-1;i++){
            if((l.get(i+1)-l.get(i))<min)
                min=l.get(i+1)-l.get(i);
        }
        return min;
    }
