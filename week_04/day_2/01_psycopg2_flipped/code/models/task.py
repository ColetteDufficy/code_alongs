class Task:
    
    def __init__(self, description, assignee, duration, user, completed = False,  id = None ):
        self.description = description
        self.assignee = assignee
        self.duration = duration
        self.user = user
        self.completed = completed
        self.id = id    # this is the id from the database
        
    def mark_complete(self):
        self.completed = True