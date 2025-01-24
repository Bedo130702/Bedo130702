class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None
class BST:
    def __init__(self):
        self.root=None
    def insert(self,value):
        temp=Node(value)
        if self.root==None:
            self.root=temp
        else:
            current=self.root
            while current!=None:
                if value<current.data:
                    if current.left!=None:
                        current=current.left
                    else:
                        current.left=temp
                        return
                else:
                    if current.right!=None:
                        current=current.right
                    else:
                        current.right=temp
                        return
    def search(self,value):
        current=self.root
        while current!=None:
            if value<current.data:
                current=current.left
            elif value>current.data:
                current=current.right
            else:
                return True
    def delete(self, key):
        self.root = self._delete_node(self.root, key)

    def _delete_node(self, node, key):
        if not node:
            return node  # Base case: key not found

        # Traverse the tree to find the node to delete
        if key < node.data:
            node.left = self._delete_node(node.left, key)
        elif key > node.data:
            node.right = self._delete_node(node.right, key)
        else:
            # Case 1: Node has no children
            if not node.left and not node.right:
                return None

            # Case 2: Node has only one child
            elif not node.left:
                return node.right
            elif not node.right:
                return node.left

            # Case 3: Node has two children
            else:
                successor = self._find_min(node.right)
                node.data = successor.data
                node.right = self._delete_node(node.right, successor.data)

        return node

    def _find_min(self):
        current=self.root
        while current.left!=None:
            current = current.left
        return current.data
    
    def inorder_traversal(self):
        result = []
        self._inorder(self.root, result)
        print("In-order Traversal:", result)

    def _inorder(self, node, result):
        if node:
            self._inorder(node.left, result)
            result.append(node.data)
            self._inorder(node.right, result)

if __name__=="__main__":
    bst=BST()
    bst.insert(30)
    bst.insert(20)
    bst.insert(40)
    bst.insert(50)
    bst.insert(10)
    bst.insert(60)
    bst.insert(45)
    bst.insert(55)
    print(f"The minimum element of the tree is {bst._find_min()}")
    n=int(input("Enter a element to search: "))
    print("The searching element is :","founded" if bst.search(n) else "Not founded.")
    m=int(input("Enter the element which you want to delete."))
    bst.delete(m)
    bst.inorder_traversal()
    
    
