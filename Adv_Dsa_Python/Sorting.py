# Data Set- : 27,15,39,21,28,70

# 1. Write a Python program to implement the concept of Bubble sort on the above data set. Print
# the data set after every iteration.
# 2. Write a Python program to implement the concept of Selection sort on the above data set. Print
# the data set after every iteration.
# 3. Write a Python program to implement the concept of Insertion sort on the above data set. Print
# the data set after every iteration.
# 4. Write a Python program to implement the concept of Quick sort on the above data set. Print the
# data set after every iteration.
# 5. Write a Python program to implement the concept of Merge sort on the above data set. Print the
# data set after every iteration.
# 6. Write a Python program to show that Quick sort is better than Bubble sort.
# 7. Write a Python program to show that merge sort is more effective than quick sort.

import time

def bubblesort(lst):
    t=len(lst)
    for i in range(t):
        for j in range(0,t-i-1):
            if lst[j+1]<lst[j]:
                lst[j],lst[j+1]=lst[j+1],lst[j]
    return lst  
def selectionsort(lst):
    t=len(lst)
    for i in range(t):
        min_idx=i
        for j in range(i+1,t):
            if lst[j]<lst[i]:
                lst[i],lst[j]=lst[j],lst[i]
    return lst
def insertionsort(arr):
    t=len(arr)
    for i in range(1, t):
        key = arr[i]
        j = i-1
        while  j>=0 and key < arr[j]:
            arr[j+1]= arr[j]
            j -= 1
    return arr
def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[0]
    left = [x for x in arr[1:] if x < pivot]
    right = [x for x in arr[1:] if x >= pivot]
    return quicksort(left) + [pivot] + quicksort(right)

def merge_sort(arr):
    if len(arr) <= 1:
        return arr  # Base case: already sorted

    # Divide
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    # Merge
    sorted_array = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_array.append(left[i])
            i += 1
        else:
            sorted_array.append(right[j])
            j += 1

    sorted_array.extend(left[i:])
    sorted_array.extend(right[j:])

    return sorted_array

# Example usage
arr = [38, 27, 43, 3, 9, 82, 10]
sorted_arr = merge_sort(arr)
print("Sorted Array:", sorted_arr)

if __name__=="__main__":
    data=[27,15,39,21,28,70]
    print(bubblesort(data))
    print(selectionsort(data))
    print(insertionsort(data))
    print(quicksort(data))
    print(merge_sort(data))

# Time complexity between Quick sort and bubble sort
    data=[27,15,39,21,28,70]* 900
    start=time.time()
    bubblesort(data[:])
    end=time.time()
    print(f"bubble sort takes {end - start} second time to execute.")
    start=time.time()
    quicksort(data[:])
    end=time.time()
    print(f"Quick sort takes {end - start} second time to execute.")
    
#   Time complexity between Quick sort and Merge sort 
    
    start=time.time()
    merge_sort(data[:])
    end=time.time()
    print(f"Merge sort takes {end - start} second time to execute.")
    start=time.time()
    quicksort(data[:])
    end=time.time()
    print(f"bubble sort takes {end - start} second time to execute.")
