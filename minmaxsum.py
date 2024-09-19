def min_max(arr):
    arr.sort()
    min_sum =sum(arr[:4])
    max_sum = sum(arr[1:])
    print(min_sum, max_sum)

arr=[1,2,3,4,5]
min_max(arr)