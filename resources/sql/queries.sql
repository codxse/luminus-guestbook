-- name: save-message!
-- creates a new message
INSERT INTO bukutamu
(name, message, timestamp)
VALUES (:name, :message, :timestamp)

-- name: get-messages
-- select all available message
SELECT * from bukutamu