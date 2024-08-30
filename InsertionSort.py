list = [29,10,14,37,13]

def insertionSort(list,n):
    i = 1
    while(i < n):
        key = list[i]
        j = i - 1
        while(j >= 0 and list[j] > key):
            list[j+1] = list[j]
            j -= 1 
        list[j+1] = key
        i += 1
    return

insertionSort(list,len(list))
print("Sorted list using insSort is : ",list)

    