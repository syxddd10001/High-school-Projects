try:
    from getpass import getpass
    from time import *
    from math import *

except Exception:
    print("Error importing files")

class Securityfunc():
    #Main Menu
    def Menu(a):
        if a == 'a':
            Securityfunc.SignUpUser(True)
        elif a == 'b':
            Securityfunc.Login(True)
        else:
            exit()

    #Sign up function
    def SignUpUser(x):        
        askUser = input("Enter username: ")        
        readUser = open("Usernames.txt")
        readUser1 = readUser.read().strip().split()
        Dict = readUser1
        if askUser in Dict:
            print("Username taken")
            return Securityfunc.SignUpUser(True)

##        elif askUser == "print":
##            print (readUser1)

        else:            
            def passInp():
                askPass = input("Enter pass: ")
                if len(askPass) < 6:
                    print("password needs to be atleast 6 charcters")
                    return passInp()              
                saveUser = open("Usernames.txt", 'a+')
                saveUser.write(askUser + "\n")
                savePass = open("Passwords.txt", 'a+')
                savePass.write(askPass + "\n")
            passInp()

    #Login function
    def Login(y):                
        readUser = open("Usernames.txt")
        readUser1 = readUser.read().strip().split()
        readPass = open("Passwords.txt")
        readPass1 = readPass.read().strip().split()
        InfoUser =  readUser1
        InfoPass = readPass1
        askUser = input("username: ")
               
        if askUser in InfoUser:
            indexUser = InfoUser.index(askUser)
            askPass = input("pass: ")
            indexPass = InfoPass.index(askPass)
            if indexUser == indexPass:
                print("Login Success\n")
                Securityfunc.Test()
                
            else:
                print("Login Failed")
            
        else:
            print("No Usernames Match.")
            print("Please Sign Up.")
            return Securityfunc.SignUpUser(True)


    def Test():
        print("YOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!!!")

        
Securityfunc.Menu(input("a: sign up\nb: login\na or b: "))
