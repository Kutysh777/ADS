def palindrome(s):
    if len(s) <= 1:
        return "Palindrome"
    if s[0] != s[-1]:
        return "Not palindrome"
    return palindrome(s[1:-1])

text = input()
print(palindrome(text))