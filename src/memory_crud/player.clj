(ns memory-crud.player
  (:require [clojure.set :as set]
            [memory-crud.player.index :as index]
            [memory-crud.player.create :as create]))

(def routes (set/union index/routes
                       create/routes))

