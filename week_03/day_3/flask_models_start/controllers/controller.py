from flask import render_template  #this is a function
from models.todo_list import tasks
from app import app


# @app.route('/')
# def index():
#     return "Welcome to my website that has my My ToDo List - go me!"
    

@app.route('/tasks')
def index():
    return render_template('index.html', title='Home', tasks=tasks)

