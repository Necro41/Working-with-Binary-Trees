package Project5;

public class BTNode
{
    BTNode left, right;
    EricItemType data;

    /* Constructor */
    public BTNode()
    {
        left = null;
        right = null;
        int x = 0;
        EricItemType y = new EricItemType(x);
    }
    /* Constructor */
    public BTNode(EricItemType n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* Function to set left node */
    public void setLeft(BTNode n)
    {
        left = n;
    }
    /* Function to set right node */
    public void setRight(BTNode n)
    {
        right = n;
    }
    /* Function to get left node */
    public BTNode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BTNode getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(EricItemType d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data.getNum();
    }
}