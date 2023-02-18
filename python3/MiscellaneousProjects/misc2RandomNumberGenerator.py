from random import * 

#randrange()                              

def randomGenerator():
    randomN = int(randrange(100))
    counterI = 0
    counterN = 1


    while  counterI != 100:
        randomN = int(randrange(100))
        print(randomN)
        if randomN % 2 == 0:
            counterN += 1
        counterI += 1
    print("Numbers generated: " + str(counterI))
    print( "Even Numbers: "+ str(counterN))
    input()
    
randomGenerator()
                                  

#range()
def numberGenerator():
    counterN = 0
    counterI = 0
    for i in range(1,101):
        if i % 2 == 0:
            counterN+=1
        counterI +=1
        print(i)
    print("Numbers Generated: " + str(counterI))
    print("Even numbers: " + str(counterN))
numberGenerator()

#random()
def randomprint():
    (int(random()* 100))


