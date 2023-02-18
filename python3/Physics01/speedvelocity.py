try:
    from time import *
    from getpass import *
    from math import *
except Exception:
    pass

#MENU FUNCTION CLASS
class menu():
    #function for speed
    def speedFunction(): #FUNCTION 1 START
        print("what do you want to find?\n1.distance\n2.speed\n3.time")
        menu_1 = input(": ")
        Result = 0
        #checking input errors
        try:
            #DISTANCE
            if menu_1 == "1":
                speedInput = float(input("Enter speed in m/s: ")) #input 1 and conversion to float
                timeInput = float(input("Enter time in seconds: ")) #input 2 and conversion to float
                Result = speedInput * timeInput #formula
                r = round(Result, 2) #rounding to 2 decimal places
                r = str(r) + " m" #output string 
            #SPEED
            elif menu_1 == "2":
                distanceInput = float(input("Enter distance in metres: ")) #input 1 and conversion to float
                timeInput = float(input("Enter time in seconds: ")) #input 2 and conversion to float
                Result = distanceInput/timeInput #formula
                r = round(Result, 2) #rounding to 2 decimal places
                r = str(r) + " m/s" #output string
            #TIME
            elif menu_1 == "3":
                distanceInput = float(input("Enter distance in metres: ")) #input 1 and conversion to float
                speedInput = float(input("Enter velocity in m\s: ")) #input 2 and conversion to float
                Result = distanceInput/speedInput
                r = round(Result, 2)
                r = str(r) + " s"

            elif menu_1 == "exit":
                exit()
             
            else:
                print("please input from the menu")
                menu.speedFunction()

            print(str(r) + "\n\n\n")
            

        except Exception: #if the user inputs a letter instead of numbers (exit being the exception)
            print("error in input")
            
        mainMenu.mainMenuFunction()  #returning to main menu after speed function
       # SPEED FUNCTION END


    #VELOCITY function
    def velocityFunction():
        print("what do you want to find?\n1.displacement\n2.velocity\n3.time")
        menu_2 = input(": ")
        # DISPLACEMENT
        if menu_2 == "1":
            print(" - is for left direction and + is for right direction")
            posS = float(input("Enter initial position:  "))
            posF = float(input("Enter final posirtion: "))
            Result = (posF - posS)
            if posF > posS:
                r = round(Result, 2)
                r = "+"+ str(r) + " m"
                print(r)
            else:
                r = round(Result, 2)
                r = str(r) + " m"
                print(r)

        #VELOCITY
        elif menu_2 == "2":
              displacementInput = float(input("Enter displacement: "))
              timeInput = float(input("Enter time: "))
              Result = displacementInput/timeInput
              r = round(Result, 2)
              r = str(r) + " m/s"
              print(r)

        else:
            print("please enter from the menu")



        mainMenu.mainMenuFunction()
#MAIN MENU CLASS
class mainMenu():
    #main menu function
    def mainMenuFunction():
        print("speed or velocity?")
        input1 = input("") 
        if input1 == "speed":
            menu.speedFunction()

        elif input1 == "velocity":
            menu.velocityFunction()
        else:
            print("Please input from the menu")
            mainMenu.mainMenuFunction()
    
mainMenu.mainMenuFunction()
