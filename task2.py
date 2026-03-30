def down(n):
    if n == 0:
        return
    print(n, end=" ")
    down(n-1)

num = int(input())
down(num)