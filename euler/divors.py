sıra = 1
while True:
    sayı = 0
    bölen_sayısı = 0
    for i in range(sıra+1):
        sayı+=i
    for i in range(1,sayı+1):
        if sayı%i == 0:
            bölen_sayısı +=1
    if bölen_sayısı >6:
        print(sayı)
        break
    else:
        sıra+=1
