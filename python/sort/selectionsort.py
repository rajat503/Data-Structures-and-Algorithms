def SELECTION_SORT(A):
    n = len(A)
    for i in range(n):
        minIndex = i
        for j in range(i, n):
            if A[j] < A[minIndex]:
                minIndex = j
        A[i], A[minIndex] = A[minIndex], A[i]
    return A