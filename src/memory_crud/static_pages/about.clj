(ns memory-crud.static-pages.about)

(def index
  {:name  ::index
   :enter (fn [context]
            (assoc context :response {:body   "This is About Page\n"
                                      :status 200}))})

(def routes #{["/about" :get index]})
