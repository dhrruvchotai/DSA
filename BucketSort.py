def bucketSort(arr):

    if(len(arr) == 0): return arr

    bucketCount = len(arr)
    maxv,minv = max(arr),min(arr)
    bucketSize = (maxv-minv)/bucketCount

    buckets = [[] for _ in range(bucketCount)]

    for num in arr:
        
        index = (int)((num - minv)/bucketSize)
        if(index == bucketCount): index -= 1
        buckets[index].append(num)

    ans = []

    for bucket in buckets:
        ans.extend(sorted(bucket))

    return ans

arr = [3.6, 2.1, 5.4, 3.9, 0.5, 8.7, 1.3]
ans = bucketSort(arr)
print(ans)

                 



