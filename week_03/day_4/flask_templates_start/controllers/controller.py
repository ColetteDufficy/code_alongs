from flask import render_template, request
from app import app
from models.todo_list import tasks
from models.task import Task

@app.route('/tasks')
def index():
    return render_template('index.html', title='Home', tasks=tasks)

    
    
@app.route('/tasks', methods=['POST'])
def add_task():
    # print(request.form)
    task_title = request.form['title']
    task_description = request.form['description']
    new_task = Task(task_title, task_description, False)
    return "Done"
