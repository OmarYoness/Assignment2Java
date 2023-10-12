CREATE TABLE poll (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      question VARCHAR(255) NOT NULL,
                      answer1 VARCHAR(255) NOT NULL,
                      answer2 VARCHAR(255) NOT NULL,
                      answer3 VARCHAR(255) NOT NULL,
                      votes1 INT,
                      votes2 INT,
                      votes3 INT,
                      date DATE
);
