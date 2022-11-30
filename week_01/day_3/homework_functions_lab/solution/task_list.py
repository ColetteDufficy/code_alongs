tasks = [
    { "description": "Wash Dishes", "completed": False, "time_taken": 10 },
    { "description": "Clean Windows", "completed": False, "time_taken": 15 },
    { "description": "Make Dinner", "completed": True, "time_taken": 30 },
    { "description": "Feed Cat", "completed": False, "time_taken": 5 },
    { "description": "Walk Dog", "completed": True, "time_taken": 60 },
]

# MVP

## Get list of uncompleted tasks
def get_uncompleted_tasks(list):
    uncompleted_tasks = []
    for task in list:
        if task["completed"] == False:
            uncompleted_tasks.append(task)
    return uncompleted_tasks
print(get_uncompleted_tasks(tasks))



## Get list of completed tasks
def get_completed_tasks(list):
    completed_tasks = []
    for task in list:
        if task["completed"] == True:
            completed_tasks.append(task)
    return completed_tasks
print(get_completed_tasks(tasks))



## Print list of task descriptions
def print_task_descriptions(list):
    for task in list:
        print(task["description"])
print(print_task_descriptions(tasks)) #why is None showing up here at the end, when i run it?



## Get tasks where time_taken is at least a given time
def get_tasks_taking_longer_than(list, time):
    tasks = []
    for task in list:
        if task["time_taken"] >= time:
            tasks.append(task)
    return tasks
print(get_tasks_taking_longer_than(tasks, 30))



## Find any task with specific description
def get_task_with_description(list, description):
    for task in list:
        if task["description"] == description:
            return task
    return "Task Not Found"
# print(get_task_with_description(tasks, "Feed Cat"))
# print(get_task_with_description(tasks, "Feed cat"))


def print_task(task):
    print(f'Description: { task["description"] }')
    print(f'Status: { "Completed" if task["completed"] else "Incomplete"}')
    print(f'Time Taken: {task["time_taken"]} mins')

def print_list(list):
    for task in list:
        print_task(task)
# print(print_list(tasks)) #not sure ive got tbhis right  its priting all the tasks in the above format


# Extensions

def mark_task_complete(description):
    task = get_task_with_description(description)
    task["completed"] = True

# create a task
def create_task(description, time_taken):
    task = {}
    task["description"] = description
    task["completed"] = False
    task["time_taken"] = time_taken

    return task

# add a task to the list
def add_to_list(list, task):
    list.append(task)




# # Further Extensions

# def print_menu():
#     print("Options:")
#     print("1: Display All Tasks")
#     print("2: Get Uncompleted Tasks")
#     print("3: Get Completed Tasks")
#     print("4: Mark Task as Complete")
#     print("5: Get Tasks Which Take Longer Than a Given Time")
#     print("6: Find Task by Description")
#     print("7: Add a new Task to list")
#     print("Q or q: Quit")

# while (True):
#     print_menu()
#     option = input("Select an option 1, 2, 3, 4, 5 or (Q)uit: ")
#     if (option.lower() == 'q'):
#         break
#     if option == '1':
#         print_list(tasks)
#     elif option == '2':
#         print_list(get_uncompleted_tasks(tasks))
#     elif option == '3':
#         print_list(get_completed_tasks(tasks))
#     elif option == '4':
#         description = input("Enter task description to search for: ")
#         task = get_task_with_description(tasks, description)
#         if task != "Task Not Found":
#             mark_task_complete(task)
#     elif option == '5':
#         time = int(input("Enter task duration: "))
#         print_list(get_tasks_taking_longer_than(tasks, time))
#     elif option == '6':
#         description = input("Enter task description to search for: ")
#         print(get_task_with_description(tasks, description))
#     elif option == '7':
#         description = input("Enter description: ")
#         time_taken = int(input("Enter time taken: "))
#         task = create_task(description, time_taken)
#         tasks.append(task)
#     else:
#         print("Invalid Input - choose another option")
