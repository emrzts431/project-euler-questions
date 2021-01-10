toplam_hepsi = 0
aralık = [range(1,28124)]
def abundant_check(a):
    divisors = {0,}
    toplam = 0
    for i in range(1,(a//2)+1):
        if a%i==0:
            divisors.add(i)
    for i in divisors:
        toplam += i
    if toplam > a:
        return a
    else:
        return False

for sayı in aralık:
    for m in sayı:
        for i in range(1,14062):
            for k in range(1,14062):
                c = abundant_check(i)+abundant_check(k)
                if c ==m:
                    aralık.remove(m)
        toplam_hepsi+=m

print(toplam_hepsi)
