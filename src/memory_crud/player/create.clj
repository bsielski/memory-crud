(ns memory-crud.player.create
  (:require [memory-crud.memory :as memory]
            [memory-crud.player.create.operation :as operation]))

(def routes #{["/players" :post [memory/interceptor operation/interceptor]]})
