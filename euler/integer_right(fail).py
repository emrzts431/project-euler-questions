
toplamlar = []
solutionlar = []
for i in range(12,1001):
    toplamlar.append(i)
def üçgen_kontrol(x,y,z):
    solutions = 0
    for toplam in toplamlar:
        if (abs(y-z)<x and x<y+z) and (abs(x-z)<y and y<x+z) and (abs(x-y)<z and z<x+y) and z==(x**2+y**2)**0.5 and x+y+z==toplam:
            solutions+=1
        else:
            pass
            
            
    solutionlar.append(solutions)
    
for i in range(1,501):
    for m in range(1,501):
        for j in range(1,501):
            üçgen_kontrol(i,m,j)
            

print(list(zip(toplamlar,solutionlar)))
    


