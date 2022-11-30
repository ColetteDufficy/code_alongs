from app import app

@app.route('/') # the @app.route decorator creates an association between the URL and the function
def index():
    return "Python is awesome!"


@app.route('/<name>') # ADDED
def greet(name): # ADDED
    return f"Hello {name}!"  # ADDED