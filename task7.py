def count_digits(n):
    if n == 0:
        return 0
    return 1 + count_digits(n // 10)

num = int(input())
print(count_digits(num))