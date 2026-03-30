def binary(lst, x, left, right):
    if left > right:
        return -1
    mid = (left + right) // 2
    if lst[mid] == x:
        return mid
    if lst[mid] > x:
        return binary(lst, x, left, mid-1)
    return binary(lst, x, mid+1, right)

numbers = list(map(int, input().split()))
target = int(input())
print(binary(numbers, target, 0, len(numbers)-1))