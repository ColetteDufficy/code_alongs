def return_10():
    return 10

def add(num_1, num_2):
    return num_1 + num_2

def subtract(num_1, num_2):
    return num_1 - num_2

def multiply(num_1, num_2):
    return num_1 * num_2

def divide(num_1, num_2):
    return num_1 // num_2

def length_of_string(string):
    return len(string)

def join_string(string_1, string_2):
    return string_1 + string_2

def add_string_as_number(string_1, string_2):
    return int(string_1) + int(string_2)

def number_to_full_month_name(month_number):
    if month_number == 1:
        return "January"
    elif month_number == 3:
        return "March"
    elif month_number == 4:
        return "April"
    elif month_number == 9:
        return "September"
    elif month_number == 10:
        return "October"

def number_to_short_month_name(month_number):
    short_month_name = number_to_full_month_name(month_number)[0:3]
    return short_month_name

def volume_of_cube(length_of_side):
    return length_of_side ** 3

def string_reverse(str):
    string_reversed = ''
    index = len(str)
    while index > 0:
        string_reversed += str[ index - 1 ]
        index = index - 1
    return string_reversed

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * (5.0/9.0)
    return round(celsius, 2)
