stringinput = input("input a string: ")
stringinput = stringinput.lower()
counterV = 1
counterC = 1
for st in stringinput:
    if st == "a" or st == "e" or st == "i" or st == "u" or st == "o":
        print(str(counterV) + " vowel(s) found")
        counterV += 1

    else:
        pass
