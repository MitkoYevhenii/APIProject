CREATE TABLE IF NOT EXISTS users (
        user_id VARCHAR(100) PRIMARY KEY,
        password_hash TEXT NOT NULL,
        name VARCHAR(100) NOT NULL,
        age INT NOT NULL
);


CREATE TABLE IF NOT EXISTS notes (
        id BIGINT PRIMARY KEY AUTO_INCREMENT,
        user_id VARCHAR(100) NOT NULL,
        title VARCHAR(100) NOT NULL,
        content VARCHAR(1000) NOT NULL,
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
        FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
