def bucketSort(arr):

    if(len(arr) == 0): return arr

    n = len(arr)
    maxv,minv = max(arr),min(arr)
    bucketSize = (maxv-minv)/n

    buckets = [[] for _ in range(n)]

    for num in arr:
        
        index = (int)((num - minv)/bucketSize)
        if(index == n): index -= 1
        buckets[index].append(num)

    ans = []

    for bucket in buckets:
        ans.extend(sorted(bucket))

    return ans

arr = [3.6, 2.1, 5.4, 3.9, 0.5, 8.7, 1.3]
ans = bucketSort(arr)
print(ans)

                 



