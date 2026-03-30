def count_x(lst, x):
    if len(lst) == 0:
        return 0
    if lst[0] == x:
        return 1 + count_x(lst[1:], x)
    return count_x(lst[1:], x)

numbers = list(map(int, input().split()))
target = int(input())
print(count_x(numbers, target))