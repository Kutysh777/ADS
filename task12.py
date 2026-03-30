def max_list(lst):
    if len(lst) == 1:
        return lst[0]
    return max(lst[0], max_list(lst[1:]))

numbers = list(map(int, input().split()))
print(max_list(numbers))