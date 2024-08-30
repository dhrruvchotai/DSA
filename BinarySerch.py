list = [-1,5,6,18,19,25,46,78,104,114]

left = 0
right = len(list) - 1

def binarySerch(list,left,right,key):

    while left <= right:
        mid = (left+right) // 2
        if(list[mid] == key):
            return mid
        elif(key < list[mid]):
            right = mid -1 
        else:
            left = mid + 1
    return -1

def recBinarySerch(list,left,right,key):
    while left <= right:
        mid = (left+right) // 2
        if(list[mid] == key):
            return mid
        elif(key < list[mid]):
            return recBinarySerch(list,left,mid-1,key)
        else:
            return recBinarySerch(list,mid+1,right,key)
    return -1

ans1 = binarySerch(list,left,right,25)
ans2 = recBinarySerch(list,left,right,14)

print("Using simple bs element found at index : ",ans1)
print("Using recursive bs element found at index : ",ans2)