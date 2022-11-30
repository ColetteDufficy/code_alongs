# numbers = [1, 2, 3, 4, 5]
# for number in numbers:
#     print(number * 3)

# chickens = ["Margaret", "Hetty", "Henrietta", "Audrey", "Mabel", "Scary Mary"]
# for chicken in chickens:
#     print(chicken) #to print out the list of individual chickens 


chickens = [
  {"name": "Margaret", "age": 2, "eggs": 0},
  {"name": "Hetty", "age": 1, "eggs": 2},
  {"name": "Henrietta", "age": 3, "eggs": 1},
  {"name": "Audrey", "age": 2, "eggs": 0},
  {"name": "Mabel", "age": 5, "eggs": 1},
  {"name": "Scary Mary", "age": 6, "eggs": 2},
]
for chicken in chickens:
    # print(chicken) #to print out the list of individual chickens 
    print(f"{chicken['name']} is {chicken['age']}.") #will output something like Margaret is 2.

total_eggs = 0
for chicken in chickens:
    print(f"We are checking this chicken's eggs: {chicken['name']}")
    print(f"We found {chicken['eggs']} eggs.")
    print(f"We had {total_eggs} in our basket.")
    total_eggs += chicken['eggs']
    print(f"We now have {total_eggs} in our basket.")
    chicken["eggs"] = 0
    print(f"The chicken now has {chicken['eggs']}")