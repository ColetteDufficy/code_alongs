chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]

def find_chicken_by_name( list, chicken_name ):
  for chicken in list:
    if chicken["name"] == chicken_name:
      return chicken
    else:
      return "Not found"

print(find_chicken_by_name(chickens, "Margaret"))
print(find_chicken_by_name( chickens, "Audrey" ))