(ns visualizer
  (:require [hodur-engine.core :as engine]
            [schemas :as schemas]
            [hodur-visualizer-schema.core :as visualizer]))

(def meta-db
  (engine/init-schema schemas/person))

(-> meta-db
    visualizer/schema
    visualizer/apply-diagram!)
