(ns memory-crud.player.create.operation)

(defn enter [context]
  (merge context
         {:tx-data [update
                    :players
                    merge
                    {(keyword (gensym "player_")) {:name "Bolek"}}]}))

(def interceptor
  {:name  ::view
   :enter enter})
