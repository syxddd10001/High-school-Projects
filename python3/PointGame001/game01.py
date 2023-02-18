try:	
    from time import * 
    from getpass import getpass
    from math import *
    
except Exception as e:
    print(e)

class check():	
    try:
        scoreFiles = open("score.dll")
        scoreRead = scoreFiles.read().strip().split()
        trueFalse = True
        def  accumulation(x):
            if x is True:
                pass
            else:
                exit()
            points = 0
            name = input("What is your name: ")
            age =  int(input("What is your age: "))
            gender = input("what is your gender, M or F: ")
            if int(age) > 16:
                points  = points + 50
            
            if str(gender) != "M" or str(gender) != "F":
                points =  points - 50
            else:
                points = points + 50

            print(points)
            
      
    except Exception as e:
        print(e)    

    



class menu():
    def mainMenu():
        pass 	
check()   		
