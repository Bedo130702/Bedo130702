# # 1. Write a Python program to create a binary tree using recursive function and display that
# # level wise.

class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

# Recursive function to insert a new key in the binary tree
def insert(root, key):
    if root is None:
        return Node(key)
    
    if key < root.val:
        root.left = insert(root.left, key)
    else:
        root.right = insert(root.right, key)
    
    return root

# Function for in-order traversal (Left, Root, Right)
def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.val, end=" ")
        inorder_traversal(root.right)

# Driver Code
if __name__ == "__main__":
    root = None
    val=[]
    print(" Enter the elements until press -1.\n")
    while True:
        val=int(input())
        if val==-1:
            break
        root = insert(root, val)

    print("Inorder Traversal of the Binary Tree:")
    inorder_traversal(root)

# # 2. Write a Python program to create a binary tree using non-recursive function and display
# # that level wise.

class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BT:
    def __init__(self):
        self.root = None

    def insert(self, value):
        temp = Node(value)
        if not self.root:
            self.root = temp
        else:
            current = self.root
            while True:
                if value < current.data:
                    if current.left:
                        current = current.left
                    else:
                        current.left = temp
                        return
                else:
                    if current.right:
                        current = current.right
                    else:
                        current.right = temp
                        return

    def inorder_traversal(self):
        if self.root is None:
            return []
        result = []
        stack = []
        current = self.root

        while stack or current:
            while current:
                stack.append(current)  # Append Node instead of Node.data
                current = current.left
            
            current = stack.pop()
            result.append(current.data)  # Append data instead of Node itself
            current = current.right

        return result

if __name__ == "__main__":
    bs = BT()
    print("Enter the elements (enter -1 to stop):")
    while True:
        try:
            val = int(input())
            if val == -1:
                break
            bs.insert(val)
        except ValueError:
            print("Invalid input! Please enter an integer.")

    print("The Inorder Traversal is:")
    print(bs.inorder_traversal())

# # 3. Write a Python program to create a binary tree using array only and display the tree level
# # wise.

class ArrayBinaryTree:
    def __init__(self):
        self.tree = []  # Initialize an empty array to store the binary tree

    def insert(self, value):
        """Inserts a value into the binary tree (level order insertion)."""
        self.tree.append(value)

    def display_levelwise(self):
        """Displays the binary tree level-wise."""
        if not self.tree:
            print("Tree is empty!")
            return

        level = 0
        index = 0
        while index < len(self.tree):
        # Number of elements in the current level = 2^level
            count = 2 ** level  
            elements = self.tree[index:index + count]  
            print("Level", level, ":", " ".join(map(str, elements)))  
            index += count  
            level += 1  


if __name__ == "__main__":
    bt = ArrayBinaryTree()
    
    print("Enter elements to insert into the binary tree (-1 to stop):")
    while True:
        try:
            val = int(input())
            if val == -1:
                break
            bt.insert(val)
        except ValueError:
            print("Invalid input! Please enter an integer.")

    print("\nBinary Tree Level-wise:")
    bt.display_levelwise()

# # 4. Write a Python program to identify the height of a binary tree.

class HeightBinaryTree:
    def __init__(self):
        self.tree = []  # Initialize an empty array to store the binary tree

    def insert(self, value):
        """Inserts a value into the binary tree (level order insertion)."""
        self.tree.append(value)

    def display_height(self):
        """Displays the binary tree level-wise."""
        if not self.tree:
            print("Tree is empty!")
            return

        level = 0
        index = 0
        while index < len(self.tree):
        # Number of elements in the current level = 2^level
            count = 2 ** level  
            elements = self.tree[index:index + count]  
            index += count  
            level += 1  
        print("Height is:",level)


if __name__ == "__main__":
    bt = HeightBinaryTree()
    
    print("Enter elements to insert into the binary tree (-1 to stop):")
    while True:
        try:
            val = int(input())
            if val == -1:
                break
            bt.insert(val)
        except ValueError:
            print("Invalid input! Please enter an integer.")

    print("\nBinary Tree Level-wise:")
    bt.display_height()

# # 5. Write a Python program to identify degree of a given node.
# class TreeNode:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = TreeNode(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = TreeNode(value)
            else:
                self.right.insert(value)

    def degree(self):
        count = 0
        if self.left:
            count += 1
        if self.right:
            count += 1
        return count

# Example usage
def main():
    root_value = int(input("Enter root value: "))
    root = TreeNode(root_value)
    print("Enter value to insert (or type -1 to stop): ")
    while True:
        try:
            value = int(input())
            if value == -1:
                break
            root.insert(value)
        except ValueError:
            print("Please enter a valid integer.")
    
    print(f"Degree of root node ({root.value}): {root.degree()}")
    
    def print_degrees(node):
        if node:
            print(f"Degree of node {node.value}: {node.degree()}")
            print_degrees(node.left)
            print_degrees(node.right)
    
    print_degrees(root)

if __name__ == "__main__":
    main()

# 6. Write a Python program to count number of leaf node present in a binary tree.

class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None

def insert(root,value):
    if not root:
        return Node(value)
    if value<root.data:
        root.left=insert(root.left,value)
    else:
        root.right=insert(root.right,value)
    return root
def count_leaf_nodes(root):
    if root is None:
        return 0
    if root.left is None and root.right is None:
        return 1
    return count_leaf_nodes(root.left) + count_leaf_nodes(root.right)


if __name__=="__main__":
    n=int(input("Enter the root value.\n"))
    root=Node(n)
    print("Enter the values and press -1 for exit.")
    while True:
        value=int(input())
        try:
            if value==-1:
                break
            root=insert(root,value)
        except ValueError:
            print(" Invalid input given! ")
    print("Number of leaf nodes:", count_leaf_nodes(root))

# 7. Write a Python program to count number of internal node present in a binary tree.

class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None

def insert(root,value):
    if not root:
        return Node(value)
    if value<root.data:
        root.left=insert(root.left,value)
    else:
        root.right=insert(root.right,value)
    return root
def internal_node(root):
    count=0
    if root is None:
        return 0
    if root.left and root.right:
        count=internal_node(root.left) + internal_node(root.right)+1
    return count


if __name__=="__main__":
    n=int(input("Enter the root value.\n"))
    root=Node(n)
    print("Enter the values and press -1 for exit.")
    while True:
        value=int(input())
        try:
            if value==-1:
                break
            root=insert(root,value)
        except ValueError:
            print(" Invalid input given! ")
    print("Number of internal nodes:", internal_node(root))

# 8. Write a Python program to count number of node present in a given binary tree using
# linked list.

class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None

def insert(root,value):
    if not root:
        return Node(value)
    if value<root.data:
        root.left=insert(root.left,value)
    else:
        root.right=insert(root.right,value)
    return root
def total_node(root):
    if root is None:
        return 0
    return total_node(root.left)+total_node(root.right)+1

if __name__=="__main__":
    n=int(input("Enter the root value.\n"))
    root=Node(n)
    print("Enter the values and press -1 for exit.")
    while True:
        value=int(input())
        try:
            if value==-1:
                break
            root=insert(root,value)
        except ValueError:
            print(" Invalid input given! ")
    print("Number of Total nodes is:", total_node(root))

# 9. Write a Python program to count number of node present in a given binary tree using
# array.
class BinaryTreeArray:
    def __init__(self):
        self.tree = []
    
    def add_node(self, data):
        self.tree.append(data)
    
    def count_nodes(self):
        return len(self.tree)

# Example usage:
tree = BinaryTreeArray()
tree.add_node(1)
tree.add_node(2)
tree.add_node(3)
tree.add_node(4)
tree.add_node(5)
print("Number of nodes in the binary tree:", tree.count_nodes())

# 10. Write a Python program to count number of siblings present in a binary tree.

class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def count_siblings(root):
    if not root:
        return 0
    
    count = 0
    
    def traverse(node):
        nonlocal count
        if not node:
            return
        
        # Check if the node has both left and right children
        if node.left and node.right:
            count += 2  # Both children are siblings
        
        traverse(node.left)
        traverse(node.right)
    
    traverse(root)
    return count

# Example usage:
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)
root.right.right = TreeNode(6)

print("Number of sibling nodes in the tree:", count_siblings(root))
