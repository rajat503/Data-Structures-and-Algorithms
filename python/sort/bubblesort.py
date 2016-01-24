def BUBBLE_SORT(A):
    n = len(A)
    for i in range(n):
        for j in range(n-1, i-1, -1):
            if A[j] < A[j-1]:
                A[j], A[j-1] = A[j-1], A[j]
    return A

A = BUBBLE_SORT(map(int, raw_input().split()))
print A
