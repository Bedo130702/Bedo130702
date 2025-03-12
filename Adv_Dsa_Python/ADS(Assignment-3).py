Write a Python program to create a binary search tree using recursive 
function and display that. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
def insert_recursive(root, key): 
if root is None: 
return Node(key) 
if key < root.val: 
root.left = insert_recursive(root.left, key) 
else: 
root.right = insert_recursive(root.right, key) 
return root 
def inorder(root): 
return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
elements = [50, 30, 70, 20, 40, 60, 80] 
root = None 
for el in elements: 
root = insert_recursive(root, el) 
print("Inorder traversal after recursive insert:", inorder(root)) 
Output: 
Write a Python program to create a binary search tree using non-recursive 
function and display 
that. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
 
def insert_non_recursive(root, key): 
    new_node = Node(key) 
    if root is None: 
        return new_node 
    curr = root 
    while True: 
        if key < curr.val: 
            if curr.left is None: 
                curr.left = new_node 
                return root 
            curr = curr.left 
        else: 
            if curr.right is None: 
                curr.right = new_node 
                return root 
            curr = curr.right 
 
def inorder(root): 
    return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
 
elements = [50, 30, 70, 20, 40, 60, 80] 
root = None 
for el in elements: 
    root = insert_non_recursive(root, el) 
 
print("Inorder traversal after non-recursive insert:", inorder(root)) 
Output: 
Write a Python program to insert (by using a function) a specific element 
into an existing binary 
search tree and then display that. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
def insert_recursive(root, key): 
if root is None: 
return Node(key) 
if key < root.val: 
root.left = insert_recursive(root.left, key) 
else: 
root.right = insert_recursive(root.right, key) 
return root 
def inorder(root): 
return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
elements = [50, 30, 70, 20, 40, 60, 80] 
root = None 
for el in elements: 
root = insert_recursive(root, el) 
root = insert_recursive(root, 25) 
print("Inorder traversal after inserting 25:", inorder(root)) 
Output: 
Write a Python program to search an element in a BST and show the result. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
def insert_recursive(root, key): 
if root is None: 
return Node(key) 
if key < root.val: 
root.left = insert_recursive(root.left, key) 
else: 
root.right = insert_recursive(root.right, key) 
return root 
def search(root, key): 
if root is None or root.val == key: 
return root 
if key < root.val: 
return search(root.left, key) 
return search(root.right, key) 
def inorder(root): 
return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
elements = [50, 30, 70, 20, 40, 60, 80] 
root = None 
for el in elements: 
root = insert_recursive(root, el) 
root = insert_recursive(root, 25) 
search_key = 60 
search_result = search(root, search_key) 
print("Search result for", search_key, ":", "Found" if search_result else "Not 
Found") 
Output: 
Write a Python program to take user name as input and display the sorted 
sequence of characters 
using BST. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
def insert_recursive(root, key): 
if root is None: 
return Node(key) 
if key < root.val: 
root.left = insert_recursive(root.left, key) 
else: 
root.right = insert_recursive(root.right, key) 
return root 
def inorder(root): 
return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
def sort_chars(name): 
root = None 
for char in name: 
root = insert_recursive(root, char) 
return inorder(root) 
name = input("Enter your name: ") 
sorted_chars_result = sort_chars(name) 
print("Sorted characters in name:", "".join(sorted_chars_result)) 
Output: 
Write a Python program to sort a given set of integers using BST. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
def insert_recursive(root, key): 
if root is None: 
return Node(key) 
if key < root.val: 
root.left = insert_recursive(root.left, key) 
else: 
root.right = insert_recursive(root.right, key) 
return root 
def inorder(root): 
return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
def bst_sort(arr): 
root = None 
for num in arr: 
root = insert_recursive(root, num) 
return inorder(root) 
numbers = list(map(int, input("Enter numbers separated by space: 
").split())) 
sorted_numbers = bst_sort(numbers) 
print("Sorted numbers using BST:", sorted_numbers) 
Output: 
Write a Python program to display a BST using In-order, Pre-order, Post
order. 
Source Code: 
class Node: 
    def __init__(self, key): 
        self.left = None 
        self.right = None 
        self.val = key 
 
def insert_recursive(root, key): 
    if root is None: 
        return Node(key) 
    if key < root.val: 
        root.left = insert_recursive(root.left, key) 
    else: 
        root.right = insert_recursive(root.right, key) 
    return root 
 
def inorder(root): 
    return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
 
def preorder(root): 
    return [root.val] + preorder(root.left) + preorder(root.right) if root else 
[] 
 
def postorder(root): 
    return postorder(root.left) + postorder(root.right) + [root.val] if root 
else [] 
 
def bst_sort(arr): 
    root = None 
    for num in arr: 
root = insert_recursive(root, num) 
return inorder(root) 
numbers = list(map(int, input("Enter numbers separated by space: 
").split())) 
root = None 
for num in numbers: 
root = insert_recursive(root, num) 
print("Inorder Traversal:", inorder(root)) 
print("Preorder Traversal:", preorder(root)) 
print("Postorder Traversal:", postorder(root)) 
Output: 
Write a Python program to Count the number of nodes present in an 
existing BST and display the 
highest element present in the BST. 
Source Code: 
class Node: 
def __init__(self, key): 
self.left = None 
self.right = None 
self.val = key 
def insert_recursive(root, key): 
if root is None: 
return Node(key) 
if key < root.val: 
root.left = insert_recursive(root.left, key) 
else: 
root.right = insert_recursive(root.right, key) 
return root 
def inorder(root): 
return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
def preorder(root): 
return [root.val] + preorder(root.left) + preorder(root.right) if root else 
[] 
def postorder(root): 
return postorder(root.left) + postorder(root.right) + [root.val] if root 
else [] 
def count_nodes(root): 
return 1 + count_nodes(root.left) + count_nodes(root.right) if root else 0 
def find_max(root): 
while root and root.right: 
root = root.right 
return root.val if root else None 
numbers = list(map(int, input("Enter numbers separated by space: 
").split())) 
root = None 
for num in numbers: 
root = insert_recursive(root, num) 
print("Inorder Traversal:", inorder(root)) 
print("Preorder Traversal:", preorder(root)) 
print("Postorder Traversal:", postorder(root)) 
print("Number of nodes in BST:", count_nodes(root)) 
print("Highest element in BST:", find_max(root)) 
Output: 
Write a Python program to prove that binary search tree is better than 
binary tree. 
Source Code: 
import time 
import random 
 
class Node: 
    def __init__(self, key): 
        self.left = None 
        self.right = None 
        self.val = key 
 
def insert_recursive(root, key): 
    if root is None: 
        return Node(key) 
    if key < root.val: 
        root.left = insert_recursive(root.left, key) 
    else: 
        root.right = insert_recursive(root.right, key) 
    return root 
 
def inorder(root): 
    return inorder(root.left) + [root.val] + inorder(root.right) if root else [] 
 
def search(root, key): 
    if root is None or root.val == key: 
        return root 
    if key < root.val: 
        return search(root.left, key) 
    return search(root.right, key) 
 
def insert_binary_tree(root, key): 
    queue = [root] 
    while queue: 
        temp = queue.pop(0) 
        if not temp.left: 
            temp.left = Node(key) 
            return 
        else: 
            queue.append(temp.left) 
        if not temp.right: 
            temp.right = Node(key) 
            return 
        else: 
            queue.append(temp.right) 
 
# Generate random dataset 
size = 10000 
random_numbers = random.sample(range(1, 100000), size) 
 
# BST Operations 
bst_root = None 
start_time = time.time() 
for num in random_numbers: 
    bst_root = insert_recursive(bst_root, num) 
bst_time = time.time() - start_time 
 
# Binary Tree Operations 
bt_root = Node(random_numbers[0]) 
start_time = time.time() 
for num in random_numbers[1:]: 
insert_binary_tree(bt_root, num) 
bt_time = time.time() - start_time 
# Search Performance Comparison 
search_key = random_numbers[size // 2] 
start_time = time.time() 
search(bst_root, search_key) 
bst_search_time = time.time() - start_time 
start_time = time.time() 
queue = [bt_root] 
found = False 
while queue: 
node = queue.pop(0) 
if node.val == search_key: 
found = True 
break 
if node.left: 
queue.append(node.left) 
if node.right: 
queue.append(node.right) 
bt_search_time = time.time() - start_time 
print("BST Insertion Time:", bst_time) 
print("Binary Tree Insertion Time:", bt_time) 
print("BST Search Time:", bst_search_time) 
print("Binary Tree Search Time:", bt_search_time) 
print("BST is more efficient for searching and insertion in large datasets.")
