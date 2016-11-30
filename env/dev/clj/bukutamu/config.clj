(ns bukutamu.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [bukutamu.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[bukutamu started successfully using the development profile]=-"))
   :middleware wrap-dev})
