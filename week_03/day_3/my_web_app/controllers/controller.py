from app import app


@app.route('/')  # @ sign is the decorator
def index():
    return "Hello World" 

@app.route('/<name>')  # @ sign is the decorator
def greet(name):
    return f"Hello {name}!" # outputs "Hello colette!"