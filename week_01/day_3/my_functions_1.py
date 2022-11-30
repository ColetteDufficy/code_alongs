# def greet() :
#     print("Hi!")
#     # return "Hi!" #nothing will be printed

# greet() #HI!
# greeting = greet() #Hi!
# print(greeting) #None - when ur function doesnt have a retun statement, then it will return None


# def greet(name):
#     return f"Hi {name}!"   #note the formatted string
# greeting = greet("Colette") # calling the function within the parameter
# print(greeting)


# def greet(name, time_of_day):
#     return f"Good {time_of_day} {name}!"   #note the formatted string
# greeting = greet("Colette", "Morning") # calling the function within the parameter
# print(greeting)


def greet(name, time_of_day):
    return f"Good {time_of_day} {name}!"   #note the formatted string
users_name = input("Please enter your name: ")
greeting = greet(users_name, "morning")
print(greeting)

