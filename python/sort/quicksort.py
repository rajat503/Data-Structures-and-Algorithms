ARR = []
gc = 1

def PARTITION(l, r):
    global ARR
    pivot = ARR[r]
    i = l-1
    for j in range(l, r):
        if ARR[j] < pivot:
            i += 1
            ARR[i], ARR[j] = ARR[j], ARR[i]
    ARR[i+1], ARR[r] = ARR[r], ARR[i+1]
    return i+1

def QS(l, r):
    global gc
    if r-1 <= l:
        return
    p = PARTITION(l, r-1)
    #print "After call #"+str(gc)+" to PARTITION procedure: ", ARR
    #gc += 1
    QS(l, p)
    QS(p+1, r)

def QUICKSORT(A):
    global ARR
    global gc
    gc = 1
    ARR = A
    QS(0, len(A))
    return ARR