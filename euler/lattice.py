def factorial(a):
    çarpım = 1
    for i in range(1,a+1):
        çarpım*=i
    return çarpım
sonuç = factorial(40)/(factorial(20)*factorial(20))
print(sonuç)
