import psycopg2
import psycopg2.extras as ext

def run_sql(sql, values = None):  # using sql as one argument and then importing a value
    conn = None
    results = []

    try:
        # Connect to db
        conn = psycopg2.connect("dbname='task_manager'") # name of databose goes in quote marks
        # Define the cursor - the cursor in the database - what thing we want it to look for the the db
        cur = conn.cursor( cursor_factory=ext.DictCursor )
        #  Execute the SQL 
        cur.execute( sql, values ) #this is referring back to line 4
        # Commit it
        conn.commit()
        # Fetch the results. Results were initially a empth list, see line 6
        results = cur.fetchall()
        # Close the connection to the DB
        cur.close()
    except (Exception, psycopg2.DatabaseError) as error:
        #  Print out any error messaages
        print(error)
    finally:
        # Close the connection to the db connection
        if conn is not None:
            conn.close()
    # Retrun Results
    return results