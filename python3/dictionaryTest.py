import time

books = ["Physics", "History", "Maths"]

books[1] = "Arabic"

books.sort(reverse = True)

books.insert(1, "English")

for b in sorted(books):
    print ("This Subject is: " + b)


emp_sub = []

j = input("Subject?: ") 

print ()

emp_sub.append(j)

print (emp_sub[0])

print ()

for number in range(10,101,10):
    print (number)
    

ages = [1, 2 , 3, 4]


print (min(ages))

time.sleep(5)




