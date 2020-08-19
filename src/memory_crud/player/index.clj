(ns memory-crud.player.index
  (:require [memory-crud.memory :as memory]
            [memory-crud.player.index.view :as view]))

(def routes #{["/players" :get [memory/interceptor view/interceptor]]})
