try:
    from getpass import *
    from time import *
    from math import *

except Exception:
    print("import error")

def mainMenu():
    print("1.Add  Numbers\n2.Y")
    menuInput = input()
    if menuInput ==  "1" :
        mainFunction.addNumbers()


#main function class
class mainFunction():
    def addNumbers():
        print("Enter 0.0 to see result")
        print("Enter numbers to add: ")
        try:
             while numberInput != "0.0":
                    

        except Exception:
            print("error")
        





mainMenu()
