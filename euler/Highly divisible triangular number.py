import time
def check(sayı):
    bölen = 2
    adet = 0
    çarpım = 1
    while sayı>1:
        
        if sayı%bölen == 0:
            sayı = int(sayı/bölen)
            adet+=1
        else:
            çarpım*=adet+1
            bölen+=1
            adet = 0
        if sayı==1:
            çarpım*=adet+1
    return çarpım
 
    
            
kontrol_sayısı = 1
su_an = time.time()
while True:
    gecen_süre = time.time()-su_an
    sıradaki = 0
    for i in range(kontrol_sayısı):
        sıradaki +=int(i)
    if check(sıradaki)>500:
        print(sıradaki)
        break
    else:
        kontrol_sayısı+=1
    
    if gecen_süre>90:
        print("Daha verimli bir program yap mankafa")
        break
    
