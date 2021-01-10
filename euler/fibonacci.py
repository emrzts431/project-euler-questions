index = 1
a = 1
b = 1
while True:
    c = a+b
    a,b = b,c
    index+=1
    yazı = str(c)
    if yazı.count("")-1 == 1000:
        print(index+1)
        break
