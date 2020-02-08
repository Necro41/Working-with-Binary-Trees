package Project5;

public class BinaryTree implements CS304BinaryTreeADT {

        private BTNode root;

        /* Constructor */
        public BinaryTree()
        {
            root = null;
        }
        /* Function to check if tree is empty */


        public boolean isEmpty()
        {
            return root == null;
        }


        /* Functions to insert data */
        public void insert(EricItemType data)
        {
            root = insert(root, data);
        }
        /* Function to insert data recursively */


        public BTNode insert(BTNode node, EricItemType data)
        {
            if (node == null)
                node = new BTNode(data);
            else
            {
                if (node.getRight() == null)
                    node.right = insert(node.right, data);
                else
                    node.left = insert(node.left, data);
            }
            return node;
        }


        /* Function to count number of nodes */
        public int countNodes()
        {
            return countNodes(root);
        }


        /* Function to count number of nodes recursively */
        public int countNodes(BTNode r)
        {
            if (r == null)
                return 0;
            else
            {
                int l = 1;
                l += countNodes(r.getLeft());
                l += countNodes(r.getRight());
                return l;
            }
        }


        /* Function to search for an element */
        public boolean search(EricItemType val)
        {
            return search(root, val);
        }


        /* Function to search for an element recursively */
        public boolean search(BTNode r, EricItemType val)
        {
            if (r.getData() == val.getNum())
                return true;
            if (r.getLeft() != null)
                if (search(r.getLeft(), val))
                    return true;
            if (r.getRight() != null)
                if (search(r.getRight(), val))
                    return true;
            return false;
        }


        /* Function for inorder traversal */
        public void inorder()
        {
            inorder(root);
        }


        public void inorder(BTNode r)
        {
            if (r != null)
            {
                inorder(r.getLeft());
                System.out.print(r.getData() +" ");
                inorder(r.getRight());
            }
        }
        /* Function for preorder traversal */
        public void preorder()
        {
            preorder(root);
        }
        public void preorder(BTNode r)
        {
            if (r != null)
            {
                System.out.print(r.getData() +" ");
                preorder(r.getLeft());
                preorder(r.getRight());
            }
        }
        /* Function for postorder traversal */
        public void postorder()
        {
            postorder(root);
        }
        public void postorder(BTNode r)
        {
            if (r != null)
            {
                postorder(r.getLeft());
                postorder(r.getRight());
                System.out.print(r.getData() +" ");
            }
        }

}
