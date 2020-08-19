(ns memory-crud.player.index.view)

(defn enter [context]
  (let [players  (get-in context [:request :database :players])
        response (merge (:response context) {:status 200
                                             :body   "bots"})]
    (merge context {:response response})))

(def interceptor
  {:name  ::view
   :enter enter})
