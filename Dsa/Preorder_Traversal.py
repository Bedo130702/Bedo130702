# Definition for a binary tree node
class TreeNode:
    def __init__(self, value=0, left=None, right=None):
        self.data = value
        self.left = left
        self.right = right

# Preorder traversal function (recursive)
def preorder_traversal_recursive(node):
    if node is None:
        return []
    return [node.data] + preorder_traversal_recursive(node.left) + preorder_traversal_recursive(node.right)

# Preorder traversal function (iterative)
def preorder_traversal_iterative(root):
    
    if not root:
        return []
    
    stack, result = [root], []
    
    while stack:
        node = stack.pop()
        result.append(node.data)
        # Push right first so left is processed next
        if node.right:
            stack.append(node.right)
        if node.left:
            stack.append(node.left)
    
    return result

# Example usage
if __name__ == "__main__":
    # Create a binary tree
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    
    print("Preorder Traversal (Recursive):", preorder_traversal_recursive(root))
    print("Preorder Traversal (Iterative):", preorder_traversal_iterative(root))
