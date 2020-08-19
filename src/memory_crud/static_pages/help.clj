(ns memory-crud.static-pages.help)

(def index
  {:name  ::index
   :enter (fn [context]
            (assoc context :response {:body   "This is Help Page\n"
                                      :status 200}))})

(def routes #{["/help" :get index]})
