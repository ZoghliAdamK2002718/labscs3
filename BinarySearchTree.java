
public class BinarySearchTree 
{
    private BinaryNode root;
    public BinarySearchTree()
    {
        root = null;
    }
    public void add(BinaryNode x)
    {
        if(root==null)
        {
            root = x;
        }
        add(root, x);
    }
    private void add(BinaryNode parent, BinaryNode x)
    {
        if(parent == null) return; 
        if(x.getValue().compareTo(parent.getValue()) < 0)
            if(parent.left()==null)
                parent.setLeft(x);
            else
                add(parent.left(), x);
        else
            if(parent.right()==null)
                parent.setRight(x);
            else
                add(parent.right(), x);
    }
    public String preOrder()
    {
        return preOrder(root).trim();
    }
    public String preOrder(BinaryNode k)
    {
        String temp = "";
        if(k!=null)
        {
            temp += k.getValue() + " ";
            preOrder(k.left());
            preOrder(k.right());
        }
        return temp;

    }
    public String postOrder()
    {
        return postOrder(root).trim(); 
    }
    public String postOrder(BinaryNode k)
    {
        String temp = "";
        if(k!=null)
        {
        preOrder(k.left());
        preOrder(k.right());
        temp += k.getValue() + " ";
        }
        return temp;
    }
}
class BinaryNode
{
    private BinaryNode left, right;
    private Comparable myValue;

    public BinaryNode(Comparable x){}

    public String toString()
    {
        String temp = "Value: " + myValue + ", Left: " +(left==null?null:left.myValue) + ", Right: " + (right==null?null:left.myValue);
        return temp;
    }
    public BinaryNode left()
    {
        return left;
    }
    public BinaryNode right()
    {
        return right;
    }
    public Comparable getValue()
    {
        return myValue;
    }
    public void setLeft(BinaryNode x)
    {
        left = x;
    }
    public void setRight(BinaryNode x)
    {
        right = x;
    }

}