class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None
def Inorder_recursively(node):
    if node is None:
        return[]
    return Inorder_recursively(node.left) +[node.data]+ Inorder_recursively(node.right)
def inorder_traversal_iterative(root):
    if not root:
        return[]
    stack = []
    current = root
    result=[]
    while stack or current:
        # Traverse to the leftmost node
        while current:
            stack.append(current)
            current = current.left
        # Visit the node at the top of the stack
        current = stack.pop()
        result.append(current.data)
        # Traverse the right subtree
        current = current.right
    return result
if __name__=="__main__":
    root=Node(1)
    root.left=Node(2)
    root.right=Node(3)
    root.left.left=Node(4)
    root.left.right=Node(5)
    print("Inorder Traversal (Recursive):", Inorder_recursively(root))
    print("Inorder Traversal (Iteratively):", inorder_traversal_iterative(root))