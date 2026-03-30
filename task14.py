def find(lst, x):
    if len(lst) == 0:
        return "Not found"
    if lst[0] == x:
        return "Found"
    return find(lst[1:], x)

numbers = list(map(int, input().split()))
target = int(input())
print(find(numbers, target))