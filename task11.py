def sum_list(lst):
    if len(lst) == 0:
        return 0
    return lst[0] + sum_list(lst[1:])

numbers = list(map(int, input().split()))
print(sum_list(numbers))