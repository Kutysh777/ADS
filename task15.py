def is_sorted(lst):
    if len(lst) <= 1:
        return "Sorted"
    if lst[0] > lst[1]:
        return "Not sorted"
    return is_sorted(lst[1:])

numbers = list(map(int, input().split()))
print(is_sorted(numbers))