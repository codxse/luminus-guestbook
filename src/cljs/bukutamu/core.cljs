(ns bukutamu.core)

(-> (.getElementById js/document "content")
    (.-innerHTML)
    (set! "Hello World from ClojureScript!"))