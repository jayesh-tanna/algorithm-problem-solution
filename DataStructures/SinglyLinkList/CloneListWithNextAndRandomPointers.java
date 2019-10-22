/*
https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1
You are given a Singly Linked List with N nodes where each node next pointing to its next node. You are also given M random pointers ,
where you will be given M number of pairs denoting two nodes a and b  i.e. a->arb = b.
*/

class Clone {
    Node copyList(Node head) {
        if(head == null)
            return head;
        HashMap<Node,Node> map = new HashMap<>();
        Node clonedHeadNode = createCloneList(head,map);
        copyRandomNodes(head,clonedHeadNode,map);
        return clonedHeadNode;
    }
    private void copyRandomNodes(Node head,Node clonedHead,HashMap<Node,Node> map)
    {
        if(head == null)
            return;
        if(head.arb != null && map.containsKey(head.arb))
            clonedHead.arb = map.get(head.arb);
        copyRandomNodes(head.next,clonedHead.next,map);
    }
    Node createCloneList(Node head, HashMap<Node,Node> map)
    {
        if(head == null)
            return null;
        Node clonedNode = new Node(head.data);
        map.put(head,clonedNode);
        clonedNode.next = createCloneList(head.next,map);
        return clonedNode;
    }
}
