#QS-1)****************Text alignment*****************
# ----c----
# --c-b-c--
# c-b-a-b-c
# --c-b-c--
# ----c----
import string

def print_pattern():
    letters = string.ascii_lowercase  # 'abcdefghijklmnopqrstuvwxyz'
    n = 3  # Since the pattern is based on 'c', 'b', and 'a'
    
    for i in range(n - 1, -n, -1):
        row = '-'.join(letters[n-1:abs(i):-1] + letters[abs(i):n])
        print(row.center(4 * n - 3, '-'))

print_pattern()

