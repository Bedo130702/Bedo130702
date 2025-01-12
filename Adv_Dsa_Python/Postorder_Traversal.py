class Node:
    def __init__(self,value):
        self.data=value
        self.left= None
        self.right=None
        
def Postorder_recursively(root):
    if not root:
        return[]
    return Postorder_recursively(root.left)+Postorder_recursively(root.right)+[root.data]
def Postorder_iteratively(root):
    if not root:
        return[]
    stack=[root]
    result=[]
    while stack:
        node=stack.pop()
        result.append(node)
        
        if node.left:
            stack.append(node.left)
        if node.right:
            stack.append(node.right)
        
    return [node.data for node in reversed(result)]
if __name__=="__main__":
    root=Node(1)
    root.left=Node(2)
    root.right=Node(3)
    root.left.left=Node(4)
    root.left.right=Node(5)
    print("Postorder Traversal (Recursive):", Postorder_recursively(root))
    print("Postorder Traversal (Iteratively):", Postorder_iteratively(root))