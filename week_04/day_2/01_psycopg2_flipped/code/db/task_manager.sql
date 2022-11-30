DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255)
);

CREATE TABLE tasks (
  id SERIAL PRIMARY KEY,
  description VARCHAR(255),
  assignee VARCHAR(255),
  duration INT,
  completed BOOLEAN DEFAULT FALSE,
  user_id INT REFERENCES users(id)
);

-- INSERT INTO tasks (description, assignee, duration) 
-- VALUES ('Walk Dog', 'Jack Jarvia', 60);

-- INSERT INTO tasks (description, assignee, duration) 
-- VALUES ('Feed Cat', 'Victor McDade', 5);