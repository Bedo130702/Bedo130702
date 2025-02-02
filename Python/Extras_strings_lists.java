# ***********Strings************
#  Removing all duplicates from a string
#  Reverse words in a given string
#  Print even length words in a string
#  Remove ith character from the string
#  Check whether symmetrical/Palindrome string
#  Check Anagram string
#  To replace all characters of a list except the given character

from collections import Counter

# 1. Removing all duplicates from a string
def remove_duplicates(s):
    return "".join(dict.fromkeys(s))  # Preserves order

# 2. Reverse words in a given string
def reverse_words(s):
    return " ".join(s.split()[::-1])

# 3. Print even length words in a string
def even_length_words(s):
    return [word for word in s.split() if len(word)%2 == 0]

# 4. Remove ith character from the string
def remove_ith_character(s, i):
    return s[:i] + s[i+1:] if i < len(s) else s

# 5. Check whether a string is symmetrical or palindrome
def is_palindrome(s):
    return s == s[::-1] 

# 6. Check if two strings are anagrams
def is_anagram(s1, s2):
    return Counter(s1) == Counter(s2)

# 7. Replace all characters except the given one
def replace_except(s, char):
    return "".join(c if c==char else "*" for c in s)

# Testing the functions
if __name__ == "__main__":
    s = "hello world"
    print("Remove duplicates:", remove_duplicates(s))
    print("Reverse words:", reverse_words(s))
    print("Even length words:", even_length_words(s))
    print("Remove ith character:", remove_ith_character(s, 3))
    print("Is palindrome:", is_palindrome("madam"))
    print("Are anagrams:", is_anagram("listen", "silent"))
    print("Replace except:", replace_except("apple", 'p'))

# **********List************
#  Interchange first and last elements in a list
#  Cloning or copying a list
#  Count occurences of elements in a list
#  Remove multiple elements from a list
#  Remove duplicates from a list
#  Find second largest number in a list
#  Intersection of two lists
#  Check if two lists are identical
#  Maximum and minimum element’s position in a list
from collections import Counter
def interchange1stlast(word):
    if len(word)<2:
        return word
    word[0],word[-1]=word[-1],word[0]
    return word

def copyingAlist(lst):
    lst1=[]
    lst1=list.copy(lst)
    return lst1
def countOccurences(lst):
    return Counter(lst)

def removeMulelm(lst,lst2):
    return [item for item in lst if item not in lst2]

def removeDuplicate(lst):
    lst1=list(dict.fromkeys(lst))
    return lst1

def secondLargest(lst):
    numbers=[x for x in lst if isinstance(x,(int,float))]
    seclarge=sorted(set(numbers),reverse=True)
    return seclarge[1] if len(seclarge)>1 else None

def intersectionOflist(lst,lst3):
    lst1=set(lst)
    lst2=set(lst3)
    return lst1.intersection(lst2)

def identicalList(lst,lst4):
    return True if lst==lst4 else False

def maxAndminPos(lst):
    numbers=[x for x in lst if isinstance(x,(int,float)) and not isinstance(x,bool)]
    num=sorted(set(numbers),reverse=True)
    for index,value in enumerate(lst):
        if value == num[0]:
            max=index+1
        elif value == num[-1]:
            min=index+1
    return max,min
if __name__=="__main__":
    lst=["Beda",23,"patra","Beda",14,"patra",True,12,"Mca"]
    temp=lst.copy()
    print("Interchange 1st and last:",interchange1stlast(temp))
    print("Cloning or copying a list:",copyingAlist(lst))
    print("Count occurences of elements in a list:",countOccurences(lst))
    lst2=[23,14,True]
    print("remove multiple elements from list:",removeMulelm(lst,lst2))
    print("remove Duplicate elements from list:",removeDuplicate(lst))
    print("The Second largest number in the list is :",secondLargest(lst))
    lst3=["Beda",23,"Sec-B","Sudip"]
    print("The Intersection of two lists is:",intersectionOflist(lst,lst3))
    lst4=["Beda",23,"patra","Beda",1,"Mca"]
    print("Two list is identical or not?",identicalList(lst,lst4))
    print(lst)
    print("Maximum and minimum element’s position in a list :",maxAndminPos(lst))
