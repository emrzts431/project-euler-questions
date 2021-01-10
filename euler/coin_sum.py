yolların_sayısı = 0
for a in range(201):
    if a*1>200:
        break
    for b in range(101):
        if a*1+b*2>200:
            break
        for c in range(41):
            if a*1+b*2+c*5>200:
                break
            for d in range(21):
                if a*1+b*2+c*5+d*10>200:
                    break
                for e in range(11):
                    if a*1+b*2+c*5+d*10+e*20>200:
                        break
                    for f in range(5):
                        if a*1+b*2+c*5+d*10+e*20+f*50>200:
                            break
                        for g in range(3):
                            if a*1+b*2+c*5+d*10+e*20+f*50+g*100>200:
                                break
                            for h in range(2):
                                if a*1+b*2+c*5+d*10+e*20+f*50+g*100+h*200 == 200:
                                    yolların_sayısı+=1
print(yolların_sayısı)
