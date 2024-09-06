from typing import List

arr = [1,3,2,3,4,1,6,4,3]

def countSort(arr,n):
    maximum = max(arr)

    # initialized count array and output array
    countarr = [0] * (maximum + 1)
    output = [0] * n


    for i in range(0,n):
        countarr[arr[i]] += 1

    for i in range(1,maximum+1):
        countarr[i] += countarr[i-1]


    for i in range(n-1,-1,-1):
        countarr[arr[i]] -= 1
        output[countarr[arr[i]]] = arr[i]

    return output


ans = countSort(arr,len(arr))
print(ans)