decimal FindMedian(Node root,int n)
{
    if(root == null)
        return 0;
    Node current = root, pre = null,prev = null;
    int count = 0;
    while(current != null){
        if(current.left == null){
            count++;
            if(n%2 == 0 && count == n/2+1)
                return (pre.data + current.data) / 2;
            if(n%2 != 0 && count == (n+1)/2)
                return prev.data;
            current = current.right;
        }else{
            pre = current.left;
            while(pre.right != null && pre.right != current)
                pre = pre.right;
            if(pre.right == null){
                pre.right = current;
                current = current.left;
            }else{
                count++;
                prev = pre;
                pre.right =null;
                if(n%2 == 0 && count == n/2+1)
                    return (prev.data + current.data) / 2;
                if(n%2 != 0 && count == (n+1)/2)
                    return current.data;
                prev = current;
                current = current.right;
            }
        }
    }
}
