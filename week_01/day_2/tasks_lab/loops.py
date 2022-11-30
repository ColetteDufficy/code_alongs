# counter = 0
# chosen_number = 5

# while (counter <= chosen_number):
#     print(f"Counter is {counter}")
#     counter +=1

my_num = 32
users_num = int(input("What number am i thinking of? ")) 

while (users_num != my_num):
    if(users_num > my_num):
        print("Too high, try again")
    else:
        print("Too low. Try again")
    users_num = int(input("Nope, try again...")) 

print(f"Yes! It was {users_num}!") #this is my comment here