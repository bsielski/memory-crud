(ns memory-crud.memory)

(defonce database (atom {:players {}}))

(defn enter [database context]
  (update context :request assoc :database @database))

(defn leave [database context]
  (if-let [[op & args] (:tx-data context)]
    (do
      (apply swap! database op args)
      (assoc-in context [:request :database] @database))
    context))

(def interceptor
  {:name  ::db-interceptor
   :enter (partial enter database)
   :leaver (partial leave database)})
