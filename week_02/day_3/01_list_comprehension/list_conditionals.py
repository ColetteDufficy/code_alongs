numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
evens_squared = []
for number in numbers:
    if number % 2 == 0:
        evens_squared.append(number * number)

print(evens_squared)


#LIST COMPREHENSION
# evens_squared = [expression for item in list if condition]

numbers = range(1, 11) 
evens_squared_r = [number * number for number in numbers]
print(evens_squared_r))
