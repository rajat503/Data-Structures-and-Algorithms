def MERGE(a, b):
	c = []
	i, j = 0, 0
	while i < len(a) and j < len(b):
		if a[i] < b[j]:
			c.append(a[i])
			i += 1
		else:
			c.append(b[j])
			j += 1
	while i < len(a):
		c.append(a[i])
		i += 1
	while j < len(b):
		c.append(b[j])
		j += 1
	return c


def MERGE_SORT(A):
	n = len(A)
	if n < 2:
		a = A[0:n/2]
		b = A[n/2:]
	else:
		a = MERGE_SORT(A[0:n/2])
		b = MERGE_SORT(A[n/2:])
	return MERGE(a, b)