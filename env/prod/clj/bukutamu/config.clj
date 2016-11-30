(ns bukutamu.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[bukutamu started successfully]=-"))
   :middleware identity})
