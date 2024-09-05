def mergeSort(arr):

    mid = 0

    if(len(arr) > 1):
        mid = len(arr) // 2
    else:
        return

    leftArr = arr[:mid]
    rightArr = arr[mid:]

    print(leftArr)
    print(rightArr)

    mergeSort(leftArr)
    mergeSort(rightArr)


    i = j = k = 0

    while(i < len(leftArr) and j < len(rightArr)):
        if(leftArr[i] < rightArr[j]):
            arr[k] = leftArr[i]
            i += 1
        elif(rightArr[j] < leftArr[i]):
            arr[k] = rightArr[j]
            j += 1
        k +=1 
    
    while(i < len(leftArr)):
        arr[k] = leftArr[i]
        i += 1
        k += 1

    while(j < len(rightArr)):
        arr[k] = rightArr[j]
        j += 1
        k += 1

arr = [724,521,2,98,529,31,189,451]
mergeSort(arr)
print(arr)