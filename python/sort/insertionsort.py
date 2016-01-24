def INSERTION_SORT(A):
    n = len(A)
    for i in range(1, n):
        x = A[i]
        j = i-1
        while j >= 0 and x < A[j]:
            A[j+1] = A[j]
            j -= 1
        A[j+1] = x
    return A