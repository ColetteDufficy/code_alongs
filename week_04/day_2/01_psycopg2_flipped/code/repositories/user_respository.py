from db.run_sql import run_sql

from models.user import User
  
def select_all():  
    users = [] 

    sql = "SELECT * FROM users"
    results = run_sql(sql)

    for row in results:
        user = User(row['first_name'], row['last_name'], row['id'] )
        users.append(user)
    return users 

# SAVE
def save(user):
    sql = """INSERT INTO users (first_name, last_name) 
    VALUES (%s, %s) RETURNING *""" 

    values = [user.first_name, user.last_name]
    results = run_sql(sql, values)
    id = results[0]['id']
    user.id = id
    return user

# SELECT
def select(id):
    user = None
    sql = "SELECT * FROM users WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

    # checking if list returned by 'run_sql(sql, values) is empty
    if results:
        result = results[0]
        user = User(result['first_name'], result['last_name'] )
    return user

# DELETE
def delete(id):
    sql = "DELETE FROM users WHERE id = %s"
    values = [id]
    run_sql(sql, values)

# DELETE ALL
def delete_all():
    sql = "DELETE FROM users"
    run_sql(sql)

# UPDATE
def update(user):
    sql="""UPDATE users SET (first_name, last_name) = 
    (%s, %s) WHERE id = %s"""
    values = [user.first_name, user.last_name, user.id]
    run_sql(sql, values)