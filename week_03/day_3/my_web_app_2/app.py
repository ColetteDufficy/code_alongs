from flask import Flask

app = Flask(__name__)  #creates the application object as an instance of class Flask
from controllers import controller

if __name__ == '__main__':
    app.run(debug=True)