list = [1,2,3,4,5]

def bubbleSort(list,n):
    last = n-1
    for i in range(0,n):
        exchs = 0
        for j in range(0,n-1):
            if(list[j] > list[j+1]):
                list[j],list[j+1] = list[j+1],list[j]
                exchs += 1
        if(exchs == 0):
            print("Vector is sorted!!")
            return last
        else:
            last = last -1
    return       

last = bubbleSort(list,len(list))
print("Sorted list using bubblesort is : ",list)
print("Last exchange at :",last)