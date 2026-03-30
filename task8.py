def reverse(n):
    if n < 10:
        print(n, end="")
        return
    print(n % 10, end="")
    reverse(n // 10)

num = int(input())
reverse(num)