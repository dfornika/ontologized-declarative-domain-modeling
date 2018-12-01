(ns core
  (:require #?@(:clj
                [[clojure.java.io :as io]
                 [hodur.engine :as hodur]])))

(def meta-db (-> "schemas/person.edn"
                 io/resource
                 hodur/init-path))
