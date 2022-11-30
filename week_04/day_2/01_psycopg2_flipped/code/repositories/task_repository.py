from db.run_sql import run_sql
from models.task import Task
import repositories.user_respository as user_repository




#SAVE FUNCTION IS DEFINED HERE
def save(task):
    # Create a string that is an SQL statement. Insert a row and return that row.
    sql_string = """INSERT INTO tasks (description, assignee, duration, user_id, completed) 
    VALUES (%s, %s, %s, %s, %s) RETURNING *"""

    # Create list of the actual values to insert
    values = [task.description, task.assignee, task.duration, task.user.id, task.completed]
    
    # Pass the SQL string and the actual values to the run file
    results = run_sql(sql_string, values)

    #  Gather up the PRIMARY KEY that was assigned to the new row
    id = results[0]['id']#give me the first dictionary in the list and give me the id numbver
    
    # Add the id to the task object 
    task.id = id 

    # Return the task
    return task







#SELECT ALL FUNCTION IS DEFINED HERE
def select_all():  
    tasks = [] 

    sql = "SELECT * FROM tasks"
    results = run_sql(sql)

    for row in results:
        user = user_repository.select(row['user_id'])
        task = Task(
            row['description'], 
            row['assignee'], 
            row['duration'], 
            user,
            row['completed'], 
            row['id'] 
        )
        tasks.append(task)
    return tasks 
    # will return a list of task objects




#SELECT
def select(id):
    task = None
    sql = "SELECT * FROM tasks WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

    # Checking if the list returned by 'run_sql(sql, values)' is empty. Empty lists are falsey.
    # Could alternatively have....
    # If len(results) > 0

    if results:
        result = results[0]
        task = Task(
            result['description'], 
            result['assignee'], 
            result['duration'], 
            result['completed'], 
            result['id'] )
        return task

# in terminal to see the item:
# print(task_respository.select(<id number>))
# print(task_respository.select(<id number>).__dict__)




#DELETE ALL
def delete_all():
    sql = "DELETE FROM tasks"
    run_sql(sql)


#DELETE_ID
def delete(id):
    sql = "DELETE FROM tasks WHERE Iid = %s"
    values = [id]
    run_sql(sql, values)





# UPDATE
def update(task):
    sql = """UPDATE tasks SET (description, assignee, user_id, duration, completed) = (%s, %s, %s, %s, %s)
    WHERE id = %s"""
    values = [
        task.description, 
        task.assignee, 
        task.user.id,
        task.duration, 
        task.completed, 
        task.id]
    run_sql(sql, values)


