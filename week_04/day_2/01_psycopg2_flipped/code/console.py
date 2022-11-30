import pdb 
from models.task import Task
from models.user import User
import repositories.task_repository as task_repository  
import repositories.user_respository as user_repository

task_repository.delete_all()
user_repository.delete_all()


user1 = User("Sensi", "Keith")
user2 = User("Cheerleader", "James")
user_repository.save(user1)
user_repository.save(user2)
result = user_repository.select_all()



task1 = Task('Gym', "Alex", 120, user1, False)
task2 = Task('Wash the dishes', "John", 10, user1, False)
task3 = Task('Hoover', "James", 20, user2, False)
task_repository.save(task1)
task_repository.save(task2)
task_repository.save(task3)

result = task_repository.select_all()

task2.description = "Wash the dog"
task_repository.update(task2)
result = task_repository.select_all()



for task in result:
    print(task.__dict__)

pdb.set_trace()