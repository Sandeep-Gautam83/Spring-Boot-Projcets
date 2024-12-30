CREATE TABLE IF NOT EXISTS courses (
    courseId INT PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(100),
    price INT,
    category_id INT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
