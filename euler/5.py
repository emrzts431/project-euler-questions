sayı = 2
son_toplam = 0
liste = []
while(sayı<1000000):
    string = str(sayı)
    toplam = 0
    for i in string:
        toplam += int(i)**5
    if toplam == sayı:
        liste.append(sayı)
        sayı+=1
    else:
        sayı+=1
for i in liste:
    son_toplam+=i
print(liste)
print(son_toplam)

    
        
