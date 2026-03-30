def up(n):
    if n == 0:
        return
    up(n-1)
    print(n, end=" ")

num = int(input())
up(num)