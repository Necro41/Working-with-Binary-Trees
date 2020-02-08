package Project5;

public interface CS304BinaryTreeADT
{
    boolean isEmpty();
    void insert(EricItemType data);
    BTNode insert(BTNode node, EricItemType data);
    int countNodes();
    int countNodes(BTNode r);
    boolean search(EricItemType val);
    boolean search(BTNode r, EricItemType val);
    void inorder();
    void inorder(BTNode r);
    void preorder();
    void preorder(BTNode r);
    void postorder();
    void postorder(BTNode r);
}
